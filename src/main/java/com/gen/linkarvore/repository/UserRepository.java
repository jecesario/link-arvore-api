package com.gen.linkarvore.repository;

import com.gen.linkarvore.model.User;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
	public List<User> findAllByEmail(String email);
	public Optional<User> findByEmailAndPassword(String email, String password);
	public Optional<User> findByEmail(String email);
}
