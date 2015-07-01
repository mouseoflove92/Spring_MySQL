package com.example.spring.demo.service.interfaces;

import java.util.List;

import com.example.spring.demo.domain.Student;

public interface IStudentService {
	void add(Student student);

	Student update(Student student);

	void delete(Student student);

	List<Student> findAll();

	List<Student> findByAgeGreaterThan(int age);
}
