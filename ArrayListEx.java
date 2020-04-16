package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {
 public static void main (String args[])
		 {
	       List <String> l=new ArrayList<String>();
	       l.add("Alekhya");
	       l.add("Bhanu");
	       l.add("Alekhya");
	       l.add("Manisha");
	       l.add("Alekhya");
	       while(Collections.frequency(l, "Alekhya")>1)
	       {
	    	   l.set(l.lastIndexOf("Alekhya"), "Anantha");
	       }
	       System.out.println(l);
		 }
}
