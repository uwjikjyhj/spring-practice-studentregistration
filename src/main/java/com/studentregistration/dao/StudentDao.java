package com.studentregistration.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.studentregistration.dto.Student;

@Component(value = "dao")
public class StudentDao implements IDao {
	@Autowired
	private JdbcTemplate template;

	@Override
	public void saveStudent(Student student) {
		String insert = "INSERT INTO students(name, age, mobileno, address) VALUES(?, ?, ?, ?)";
		template.update(insert, student.getName(), student.getAge(), student.getMobileNo(), student.getAddress());
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
		String query = "SELECT * FROM students WHERE id=?";
		return template.queryForObject(query, new StudentRowMapper(), new Object[]{mobileNo});
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
