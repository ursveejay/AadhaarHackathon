package com.vj.dto;

import java.util.Date;

public class Student {

private int id;
private String name;
private int classOfStudy;
private Date dob;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getClassOfStudy() {
	return classOfStudy;
}
public void setClassOfStudy(int classOfStudy) {
	this.classOfStudy = classOfStudy;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}

}