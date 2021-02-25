package com.example.sep.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class restController {
	
	@GetMapping("/getCourse")
	public Course getCourse()
	{
		return new Course("MS1","MSc in IT",350000,"http",1,"uni1","fac1","user1");
	}
	
	@PostMapping("/addCourse")
	public void addCourse(@RequestBody Course course)
	{
		System.out.println(course);
	}
	
	@GetMapping("/getFaculty")
	public Faculty getFaculty()
	{
		return new Faculty("fac1","faculty of IT",1,"dist1");
	}
	
	@PostMapping("/addFaculty")
	public void addFaculty(@RequestBody Faculty faculty)
	{
		System.out.println(faculty);
	}
	
	@GetMapping("/getUniversity")
	public University getUniversity()
	{
		return new University("uni1","UoM","RL01","RW23",1);
	}
	
	@PostMapping("/addUniversity")
	public void addUniversity(@RequestBody University university)
	{
		System.out.println(university);
	}
	
	@GetMapping("/getDistrict")
	public District getDistrict()
	{
		return new District("dist1","Colombo");
	}
	
	@PostMapping("/addDistrict")
	public void addDistrict(@RequestBody District district)
	{
		System.out.println(district);
	}
	
	@GetMapping("/getUser")
	public User user()
	{
		return new User("user1","name1","0771234567","user@gmail.com","123",1);
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		System.out.println(user);
	}

}
