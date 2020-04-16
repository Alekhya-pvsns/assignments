package com.collections;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import java.io.*;


public class CaseStudy1 {
   static Customer c=new Customer();
   public static List<Customer> allCustomers() throws Exception 
   {
	   File f=new File("D:\\gitpractice\\collectioncasestudy\\rivisionhandson\\customer.txt");
	   FileReader fi=new FileReader(f);
	   BufferedReader br=new BufferedReader(fi);
	   List <Customer> l=new ArrayList<Customer>();
	   String str;
	   while((str=br.readLine())!=null)
	   {
		   String s[]=str.split(",");
		   c.setCustId(Integer.parseInt(s[0]));
		   c.setCustName(s[1]);
		   c.setEmail(s[2]);
		   c.setMobile(s[3]);
		   SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		   String s1=s[4];
		   Date d=null;
		   try
		   {
			   d=sdf.parse(s1);
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   c.setDob(d);
		   Address a=new Address();
		   a.setCity(s[5]);
		   a.setState(s[6]);
		   a.setCountry(s[7]);
		   c.setAddress(a);
		   l.add(c);
	   }
	   return l;
   }
   public static void displayAll() throws Exception
   {
	   List<Customer> l1=allCustomers();
	   for(Customer cust:l1)
	   {
		   System.out.println(cust);
	   }
   }
  public static void displayByCity(String city) throws Exception
  {
	  List<Customer> cus = allCustomers();
	  for(Customer c1:cus)
	  {
     	if(c1.getAddress().getCity()== city)
		{
		  c = c1;
	    }
	  }
	  for(Customer custom:cus)
	  {
		  System.out.println(custom);
	  }
	  /*List<Customer> list = allCustomers();
		 
			 Comparator<Customer> cC=(c1,c2)->{ 
				 return c1.getAddress().getCity().compareTo(c2.getAddress().getCity());
			 };
			 Collections.sort(list,cC);
		for(Customer cComparator: list)
		{
			System.out.println(c);
		}  
   */
  }
  public static int calage(Date dob)
  {
	  int a=2020-(dob.getYear()+1900);
	  return a;
  }
  public static void displayByAge(int age) throws Exception
  {
	  List<Customer> l1= allCustomers();
	  List<Customer> l2=new ArrayList();
	  for(Customer c3:l1)
	  {
		  int a1=calage(c3.getDob());
		  //System.out.println(age);
		  if(a1<age)
		  {
			  l2.add(c3);
		  }
	  }
	  for(Customer custom2:l2)
	  {
		  System.out.println(custom2);
	  }
  }
   public static void main(String[] args) throws Exception {
		
		while(true)
		{
			System.out.println("1.Display all Customers \n 2.Display by Age \n 3.Display by Country \n 4.Exit");
			System.out.println("Enter your choice::");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
	        switch(ch)
	        {
	         case 1: 
	        	 displayAll();
	        	 break;
	         case 2:
	        	 System.out.println("Enter age::");
	        	 int age=sc.nextInt();
	        	 displayByAge(age);
	        	 break;
	         case 3: 
	        	 System.out.println("Enter city::");
	        	 String n=sc.next();
	        	 displayByCity(n);
	        	 break;
	         case 4:
	        	 System.out.println("Exited");
	        	 System.exit(0);
	        }
		}

	}

}
