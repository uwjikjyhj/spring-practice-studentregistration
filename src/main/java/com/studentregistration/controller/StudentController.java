package com.studentregistration.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.studentregistration.dao.IDao;
import com.studentregistration.dto.Student;
import com.studentregistration.service.IService;

@Controller
@RequestMapping("/")
public class StudentController {
	@Autowired
	IService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String getRegistrationForm(Map<String, Student> map) {
		map.put("student", new Student());
		return "registrationform";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String saveStudent(@ModelAttribute("student") Student student,
			Map<String, Student> map) {
		Student savedUser = service.saveStudent(student);
		map.put("student", savedUser);
		return "studentdetails";
	}
}