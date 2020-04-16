package com.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
public class MapEx {
	public static void main(String[] args) throws Exception {
		/*MapEx m=new MapEx();
		File f=new File("D:\\gitpractice\\rivisionhandson\\vehicle.txt");
	    FileReader fi=new FileReader(f);
		BufferedReader br=new BufferedReader(fi);
	    List <String> l=new ArrayList<String>();	
	    String str;
		   while((str=br.readLine())!=null)
		   {
	         l.add(str);
	       }
          Map<String,Integer> map=new HashMap<String,Integer>();
          Iterator<String> it=l.iterator();
          while(it.hasNext())
          {
        	  String cars=it.next();
        	  map.put(cars,Collections.frequency(l, cars));
          }
          //System.out.println(map);
          Set<Map.Entry<String,Integer>> s=map.entrySet();
          Iterator<Map.Entry<String, Integer>> itr=s.iterator();
          while(itr.hasNext())
          {
        	  Map.Entry<String, Integer> m1	=itr.next();
        	  System.out.println(m1.getKey()+"->"+m1.getValue());
          }*/
		List<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(65);
		l.add(28);
		l.add(15);
		//System.out.println(l);
		List<Integer> l1=new ArrayList();
		//l1=(List<Integer>) l.stream();
		System.out.println(l1);
		}
}