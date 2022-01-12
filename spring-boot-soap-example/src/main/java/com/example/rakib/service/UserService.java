package com.example.rakib.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.rakib.spring.User;

@Service
public class UserService {

	
	private static final Map<String, User> users = new HashMap<String, User>();
	
	@PostConstruct
	public void intialize() {
		User mukesh = new User();
		mukesh.setEmpId(1001);
		mukesh.setName("Mukesh");
		mukesh.setSalary(18000);
		
		User rakeem = new User();
		rakeem.setEmpId(1001);
		rakeem.setName("Mukesh");
		rakeem.setSalary(18000);
		User anand = new User();
		anand.setEmpId(1001);
		anand.setName("Mukesh");
		anand.setSalary(18000);
		User murshid = new User();
		murshid.setEmpId(1001);
		murshid.setName("Mukesh");
		murshid.setSalary(18000);
		
		users.put(mukesh.getName(), mukesh);
		users.put(rakeem.getName(), rakeem);
		users.put(anand.getName(), anand);
		users.put(murshid.getName(), murshid);
		
	}
	
	public User getUser(String name) {
		
		return users.get(name);
	}
}
