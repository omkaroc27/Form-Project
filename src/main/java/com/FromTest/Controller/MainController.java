package com.FromTest.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.FromTest.Model.User;
import com.FromTest.Model.Data;
import com.FromTest.Repo.DataRepository;
import com.FromTest.Repo.UserRepository;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private DataRepository drepo;
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@PostMapping("/Register")
	public String Register(@ModelAttribute User user , HttpSession session) {
		
		repo.save(user);
		session.setAttribute("massage", "User Register Successfully!..");
		return"DataFrom";
	}
	
	@PostMapping("/Data")
	public String Data(@ModelAttribute Data data , HttpSession session) {
		
		drepo.save(data);
		//session.setAttribute("massage", " Successfully!..");
		return"Sucess";
	}
}
