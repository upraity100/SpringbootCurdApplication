package com.spring.boot.curd.service;

import java.util.List;

import com.spring.boot.curd.entity.Student;

public interface StudentService
{
	void save(Student student);
	List<Student> getAll();
	Student getById(Integer id);
	void delete(Student student);
	Student updateStudent(Integer id, Student student);
}



