package com.shahzeb.students;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService stu;
	


	@RequestMapping("/getstudents")
	public List<Students> getStudents() {

		return stu.getAllStudents();
	}

	@RequestMapping(value = "/getstudent/{name}")
	public Optional<Students> getStudent(@PathVariable("name") Integer str) {
		return stu.getStudentById(str);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/setstudent")
	public String setStudent(@RequestBody Students student) {

		
		if(stu.setStudent(student) == true) {
			return "ok";
		}
		return "Not ok";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updatestudent/{name}")
	public void updateStudent(@RequestBody Students student, @PathVariable("name") String str) {

		stu.updateStudent(student,str);
		return;
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestudent/{name}")
	public void deleteStudent(@PathVariable("name") String str) {
		return;
	}
	
	

}
