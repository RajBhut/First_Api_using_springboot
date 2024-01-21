package com.springrest.springrest.entities;

public class Student_details {
private int rollnum;
private String name;
public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}
public String getName() {
	return name;
}
public Student_details() {
	super();

}
public Student_details(int rollnum, String name) {
	super();
	this.rollnum = rollnum;
	this.name = name;
}
@Override
public String toString() {
	return "Student_details [rollnum=" + rollnum + ", name=" + name + "]";
}
public void setName(String name) {
	this.name = name;
}

	
	
	
	
}
