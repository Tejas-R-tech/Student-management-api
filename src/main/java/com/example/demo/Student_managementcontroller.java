package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_managementcontroller {

	@Autowired
	private Studentrepo studentrepo;
	
	
	@PostMapping("/insertdata")
	public List<Student_Management_System>savadata(@RequestBody List<Student_Management_System>sms){
		return studentrepo.saveAll(sms);
	}
	
	@GetMapping("/getdata/{name}")
	public List<Student_Management_System>getval(@PathVariable("name")String uname){
		return studentrepo.findByName(uname);
	}
	
	@GetMapping("/getvalue")
	public List<Student_Management_System>getbydat(@RequestParam("name")String upname){
		return studentrepo.findByName(upname);
	}
	
	@GetMapping("/getbycourse/{course}")
	public List<Student_Management_System>getspecal(@PathVariable("course")String ncourse){
		return studentrepo.findByCourse(ncourse);
	}
	
	@GetMapping("/bycourse")
	public List<Student_Management_System>displayval(@RequestParam("course")String upcourse){
		return studentrepo.findByCourse(upcourse);
	}
}
