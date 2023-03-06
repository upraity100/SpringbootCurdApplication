package com.spring.boot.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.curd.entity.Student;
import com.spring.boot.curd.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	
	@Autowired
	StudentRepository studentRepository;
	

	public void save(Student student)
	{
		System.out.print(student.getId());
		if(student.getId()==null)
		{
			studentRepository.save(student);
			System.out.print(student.getId());
			
		}
		else
		{
			
			System.out.print(student.getId());
			Student staffUpdate = studentRepository.findById(student.getId()).get();
			staffUpdate.setName(student.getName());
			staffUpdate.setRollNo(student.getRollNo());
			staffUpdate.setEmailId(student.getEmailId());
		    studentRepository.save(staffUpdate);
			
			}
	}

	public List<Student> getAll()
	{
		return studentRepository.findAll();
	}

	public Student getById(Integer id)
	{
		return studentRepository.findById(id).get();
	}
	
	public void delete(Student student)
	{
		 studentRepository.delete(student);
	}
	
	
	 public Student updateStudent(Integer id, Student student) {
		 System.out.print("yroooooo"+student.getId());
			Student staffUpdate = studentRepository.findById(student.getId()).get();
			staffUpdate.setName(student.getName());
			staffUpdate.setRollNo(student.getRollNo());
			staffUpdate.setEmailId(student.getEmailId());
		    return studentRepository.save(staffUpdate);
	    }
	
	
	

}

