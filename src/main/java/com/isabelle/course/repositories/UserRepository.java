package com.isabelle.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isabelle.course.entities.User;
//responssavel por fazer operações com a entidade user
public interface UserRepository  extends JpaRepository<User, Long>{

}
