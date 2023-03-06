package com.spring.boot.curd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student
{	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
	private Integer id;
    @Column
	private String name;
    @Column
	private String rollNo;
    @Column
	private String emailId;
  
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String rollNo, String emailId, String country) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.emailId = emailId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", emailId=" + emailId + "]";
	}
	


}
