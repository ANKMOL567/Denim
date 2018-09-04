package com.dxx.dxc;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {

	String dName;
	int dYear;
	
	@OneToMany(mappedBy="dNo")
	List<Student> students=new ArrayList<Student>();

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Id
	String dNo;
	
	public Department() {
	}
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdYear() {
		return dYear;
	}
	public void setdYear(int dYear) {
		this.dYear = dYear;
	}
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}

}
