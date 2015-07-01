package com.example.spring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.demo.domain.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByAgeGreaterThan(int age);
}
