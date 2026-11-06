package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Members {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id;
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private int phone;
	
	private int joining_date;
	@OneToMany(mappedBy = "member")
    private List<Books> books = new ArrayList<>();


	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(int joining_date) {
		this.joining_date = joining_date;
	}
	
	

}
