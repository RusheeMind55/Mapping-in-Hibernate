package com.jbk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private	int Ref_id;

	
	String Name;
	
	@Column(unique=true)
	private	String Email_id;
	
	String JobTittle;

	@OneToOne
	private Job job;
	
	
	//job class ka constructor
	public Job getjob() {
		return job;
		
	}
	
	
	public Employee() {}


	public int getRef_id() {
		return Ref_id;
	}


	public void setRef_id(int ref_id) {
		Ref_id = ref_id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail_id() {
		return Email_id;
	}


	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}


	public String getJobTittle() {
		return JobTittle;
	}


	public void setJobTittle(String jobTittle) {
		JobTittle = jobTittle;
	}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "Fresher [Ref_id=" + Ref_id + ", Name=" + Name + ", Email_id=" + Email_id + ", JobTittle=" + JobTittle
				+ ", job=" + job + "]";
	}
	
	
	

	
}
