package com.dxx.dxc;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Student {
String name;
	
	@Id
	String rollno;
	float marks;
	
	@ManyToOne
	Department dNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getdNo() {
		return dNo;
	}

	public void setdNo(Department dNo) {
		this.dNo = dNo;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	

}
