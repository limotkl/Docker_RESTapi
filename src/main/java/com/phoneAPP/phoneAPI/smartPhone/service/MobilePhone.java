package com.phoneAPP.phoneAPI.smartPhone.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.phoneAPP.phoneAPI.smartPhone.model.Contact;

//@Component
@Service
public class MobilePhone {
	private ArrayList<Contact> phoneBook = new ArrayList<Contact>();
	
	public MobilePhone(){
		phoneBook.add(new Contact(0,"Fang","Li","9293971317","limotkl@gmail.com"));
		phoneBook.add(new Contact(1,"aaa","bb","9293971317","limotkl@gmail.com"));
	}
	private boolean isExist(Contact temp){
		int first = 0;
		int last = 0;
		//Is there a better way?
		for (Contact j : this.phoneBook) {
			if (first ==1 && last==1)
				break; 
			if (j.getFirstname().equals(temp.getFirstname()))
				first = 1;
			if (j.getLastname().equals(temp.getLastname()))
				last = 1;
		}
		
		if (first ==1 && last==1)
			return true;
		else
			return false;
	}
	
	
	public ArrayList<Contact> getContact(){
		// should return a copy of this.phone_book?
		return this.phoneBook;
	}
	
	
	public String addContact(Contact newFriend){
		
		if (this.isExist(newFriend))
			return "Failed! Contact already exist.";
		else{
			this.phoneBook.add(newFriend);
			return "Add Success";
		}
	}
	public String removeContact(int index){
		//int index = phoneBook.indexOf(friend);
		if(index >=0 && index < this.phoneBook.size()){
			this.phoneBook.remove(index);
			return "Remove success.";
		}
		else
			return "Failed Contact doesn't exist.";
	}
	
	public Contact findContact(int index){
		//int index = phoneBook.indexOf(name);
		if (index < 0 || index >= this.phoneBook.size())
			return null;
		return phoneBook.get(index);
	}
	
	public String update(int index,Contact newName){
		//int index = phoneBook.indexOf(name);
		if (index >=0 && index < this.phoneBook.size()){
			phoneBook.set(index, newName);
			return "Updated";
		}
		else
			return "Failed! out of range";
		
	}
		
	
	
	
}
