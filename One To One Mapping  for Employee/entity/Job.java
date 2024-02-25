package com.jbk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Job {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
		int id;
		
	@Column()
		String Name;
		
//	constractor	
		public Job( String Name) {
			this.Name=Name;
	
		}
//setter or getter
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

// Tostring
		@Override
		public String toString() {
			return "Job [id=" + id + ", Name=" + Name + "]";
		}

		
}
