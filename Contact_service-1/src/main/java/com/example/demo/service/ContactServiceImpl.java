package com.example.demo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(new Contact(1l, "babu@gmail.com", "babu leon", 9999l),
			new Contact(2l, "deol@gmail.com", "sunny deol", 8888l),
			new Contact(3l, "zarin@gmail.com", "zarin khan", 7777l)

	);

	@Override
	public List<Contact> getContactofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
