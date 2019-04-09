
package com.phoneAPP.phoneAPI.smartPhone.dao;

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


@RestController
public class StudentJPA {
	@Autowired
	private ContestRepo contestRepo;
	
	@GetMapping(path = "/jpa/getAllContact")
	public List<Contact> getAllContact(){
		return contestRepo.findAll();
	}
	
	@PostMapping("/jpa/addContact")
	public String getAllContact(@RequestBody Contact newFriend){
		contestRepo.save(newFriend);
		return "Success";
	}
//	
//	@DeleteMapping("/jpa/delContact/{contactID}")
//	public String getAllContact(@PathVariable int contactID){
//		return  phone.removeContact(contactID);
//	}
//	
//	
//	@PutMapping("/jpa/updateContact/{index}")
//	public String updateContact(@PathVariable int index ,@RequestBody Contact newFriend){
//		return phone.update(index,newFriend);
//	}
//	
//	@GetMapping("/jpa/findContact")
//	public Contact findContact(@RequestBody int index){
//		return phone.findContact(index);
//	}	
	
}
