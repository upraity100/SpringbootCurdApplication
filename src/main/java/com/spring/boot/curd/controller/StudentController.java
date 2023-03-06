package com.spring.boot.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.curd.entity.Student;
import com.spring.boot.curd.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public ModelAndView getAllStudents()
	{
	    ModelAndView mav = new ModelAndView("index");
        List<Student> studentList= studentService.getAll();
        mav.addObject("students",studentList);
	    return mav;
	}
	
	@GetMapping("/add-student")
	public ModelAndView addStudent()
	{
		System.out.println("Working add student");
		ModelAndView mav = new ModelAndView("add_student");
		mav.addObject("command",new Student());
		return mav;
	}
	@PostMapping("/save-student")
	public String saveStaff(@ModelAttribute Student student)
	{
		 studentService.save(student);
	     return "redirect:/";
	}
	
	
	@GetMapping("/student-delete/{id}")
	public String deleteStaff(@PathVariable("id") Integer id)
	{
		Student deleteStaff=studentService.getById(id);
		studentService.delete(deleteStaff);
		return "redirect:/";
	}
	
	
	 @RequestMapping(value = "/update-student/{id}")
	    public String showUpdateContactPage(@PathVariable int id, Model model) {
	        model.addAttribute("id", id);
	        model.addAttribute("command", studentService.getById(id));
	        return "update";
	    }

	    @RequestMapping(value = "/update-student/{id}", method = RequestMethod.POST)
	    public String updateContact(@PathVariable int id, @ModelAttribute("student") Student student) {
	        studentService.updateStudent(id, student);
	        return "redirect:/";
	    }
	
	
	
	

}
