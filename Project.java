package com.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project implements Comparable<Project>{
  private int id;
  private String domain;
  private String startDate;
 
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
private String endDate;
@Override
public String toString() {
	return "Project [id=" + id + ", domain=" + domain + ", startDate=" + startDate + ", endDate=" + endDate + "]";
}
public Project(int id, String domain, String starDate, String endDate) {
	super();
	this.id = id;
	this.domain = domain;
	this.startDate = starDate;
	this.endDate = endDate;
}
@Override
public int compareTo(Project o) {
	if(this.id >o.id)
	{
		return 1;
	}
	else if(this.id <o.id)
	{
		return -1;
	}
	else
	{
	return 0;
}
}


		

			
}



