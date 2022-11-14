package com.UST.UstempregistrationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UST.UstempregistrationService.dao.UserRepository;
import com.UST.UstempregistrationService.model.User;

@SpringBootApplication
@RestController
@CrossOrigin(origins="*")
public class UstEmpRegistrationServiceApplication {
	@Autowired
	private UserRepository repository;
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		repository.save(user);
		return "Hey" +user.getName()+"your Registration is Completed";
		
	}

	@GetMapping("/getAllusers")
	public List<User>findAllUser(){
		return repository.findAll();
	}
	@GetMapping("/findusers/{email}")
	public List<User>findUser(@PathVariable String email){
		return repository.findByEmail(email);
	}
	@DeleteMapping("/cancel/id")
	public List<User>cancleRegistration(@PathVariable int id){
		 repository.deleteById(id);
		return repository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(UstEmpRegistrationServiceApplication.class, args);
	}

}
