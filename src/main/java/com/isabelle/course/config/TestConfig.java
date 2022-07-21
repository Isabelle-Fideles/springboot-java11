package com.isabelle.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isabelle.course.entities.User;
import com.isabelle.course.repositories.UserRepository;

@Configuration //classe para configuração
@Profile("test")
public class TestConfig implements CommandLineRunner  { //para ser executado quando o programa for iniciado
	
	@Autowired
	private UserRepository userRepository; //ele q salva os dados

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
