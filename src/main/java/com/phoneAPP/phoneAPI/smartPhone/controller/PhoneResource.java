package com.phoneAPP.phoneAPI.smartPhone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phoneAPP.phoneAPI.smartPhone.model.Contact;
import com.phoneAPP.phoneAPI.smartPhone.service.MobilePhone;

@RestController
public class PhoneResource {
	@Autowired
	private MobilePhone phone;
	
	@GetMapping(path = "/getAllContact")
	public ArrayList<Contact> getAllContact(){
		return phone.getContact();
	}
	
	@PostMapping("/addContact")
	public String getAllContact(@RequestBody Contact newFriend){
		return  phone.addContact(newFriend);
	}
	
	@DeleteMapping("/delContact/{contactID}")
	public String getAllContact(@PathVariable int contactID){
		return  phone.removeContact(contactID);
	}
	
	
	@PutMapping("/updateContact/{index}")
	public String updateContact(@PathVariable int index ,@RequestBody Contact newFriend){
		return phone.update(index,newFriend);
	}
	
	@GetMapping("/findContact")
	public Contact findContact(@RequestBody int index){
		return phone.findContact(index);
	}	
	
}
