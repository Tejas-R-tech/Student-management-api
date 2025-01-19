package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student_Management_System, Integer> {

	List<Student_Management_System> findByName(String name);
	
	List<Student_Management_System> findByCourse(String course);
}
