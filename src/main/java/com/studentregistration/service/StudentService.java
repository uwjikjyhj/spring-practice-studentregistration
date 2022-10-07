package com.studentregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studentregistration.dao.IDao;
import com.studentregistration.dto.Student;

@Component(value = "service")
public class StudentService implements IService {
	@Autowired
	IDao dao;

	@Override
	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Student getStudentByMobileNo(String mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
}
