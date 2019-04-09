package com.phoneAPP.phoneAPI.smartPhone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phoneAPP.phoneAPI.smartPhone.model.Contact;


@Repository
public interface ContestRepo extends JpaRepository<Contact,Integer> {

	
}
