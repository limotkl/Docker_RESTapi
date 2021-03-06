package com.phoneAPP.phoneAPI.smartPhone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue
	private Integer CID;
	
	private String firstname;
	private String lastname;
	private String phone_number;
	private String email_address;
	
public Contact(){
		
	}

	public Contact(Integer id,String first_,String last,String phone,String email){
		this.CID = id;
		this.firstname = first_;
		this.lastname = last;
		this.phone_number = phone;
		this.email_address = email;
	}

	public Integer getCID() {
		return CID;
	}

	public void setCID(Integer cID) {
		CID = cID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	
	
	
}
