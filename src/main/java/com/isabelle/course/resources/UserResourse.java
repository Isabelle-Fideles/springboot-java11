package com.isabelle.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isabelle.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResourse {
	
//endpoint para acessar os usuarios:	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L, "Maria","Mrai@gmail","2323","1234");
		return ResponseEntity.ok().body(u);
	}
}
