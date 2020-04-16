package com.collections;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import java.util.*;

public class MapExample{
  
	public  static Map<Project, Employee> loadProjects()
	{
		Map<Project,Employee> map=new TreeMap<Project,Employee>();
		
		Employee e1=new Employee(101,"Anand",20000.00,"anand@gmail.com");
		Employee e2=new Employee(115,"Ananth",30000.00,"ananth@gmail.com");
		Employee e3=new Employee(125,"Anandi",28000.00,"anandi@gmail.com");
		Employee e4=new Employee(108,"Arjun",25000.00,"arjun@gmail.com");
		Employee e5=new Employee(158,"Anuradha",50000.00,"anu@gmail.com");
		
		Project p1=new Project(1020,"java","25-05-2020","22-07-2020");
		Project p2=new Project(1200,"testing","22-04-2020","22-07-2020");
		Project p3=new Project(1025,".net","25-04-2020","18-06-2020");
		Project p4=new Project(2010,"it","25-04-2020","22-07-2020");
		Project p5=new Project(1002,"support","28-04-2020","23-07-2020");
	    
		map.put(p1,e1);
		map.put(p2,e2);
		map.put(p4,e3);
		map.put(p3, e5);
		
		return map;
	}
	public static void displayByProjectId(Map<Project,Employee> map)
	{
		SortedMap<Project,Employee>  sortedMap = new TreeMap<Project, Employee>(map);
		sortedMap.entrySet().stream().forEach(t->System.out.println(t));
	}
    public static void displayByProjectDomain(Map<Project,Employee> map)
	{
		Comparator<Map.Entry<Project, Employee>> comp=new Comparator<Map.Entry<Project,Employee>>()
		{

			@Override
			public int compare(Entry<Project, Employee> o1, Entry<Project, Employee> o2) 
			{
		      return o1.getKey().getDomain().compareTo(o2.getKey().getDomain());
	        }
		};
		map.entrySet().stream().sorted(comp).forEach(t->System.out.println(t));
	}
	public static void main(String[] args)
	{
		
		 Map<Project,Employee> map=loadProjects();
		 System.out.println("_________________________________________");
		 displayByProjectId(map);
		 System.out.println("_________________________________________");
		 displayByProjectDomain(map);
	 			
	}

}

	