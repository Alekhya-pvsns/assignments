package com.collections;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Comparable<Customer>, Serializable, Cloneable {
   private int custId;
   private String custName;
   private String email;
   private String mobile;
   private Date dob;
   private Address address;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Date getDob() {
	return dob;
}
public Customer() {
	super();
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Customer(int custId, String custName, String email, String mobile, Date dob, Address address) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.email = email;
	this.mobile = mobile;
	this.dob = dob;
	this.address = address;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", mobile=" + mobile
			+ ", dob=" + dob + ", address=" + address + "]";
}
@Override
public int compareTo(Customer arg0) {
	// TODO Auto-generated method stub
	return 0;
}

}
