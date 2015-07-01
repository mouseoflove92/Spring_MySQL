package com.example.spring.demo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.demo.domain.Student;
import com.example.spring.demo.service.interfaces.IStudentService;

@Controller
public class DemoController {

	private static final Logger LOGGER = Logger.getLogger(DemoController.class);

	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		List<Student> students = studentService.findByAgeGreaterThan(23);

		LOGGER.info("Have " + students.size() + " student(s)");
		for (Student s : students) {
			LOGGER.info(s.getId() + "   " + s.getName() + "   " + s.getAge());
		}

		return "demo";
	}

}
