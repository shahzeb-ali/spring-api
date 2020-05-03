package com.shahzeb.APIstarter.HelloWorld.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("/students")
	public List<Students> getStudents(){
		Students student1 = new Students("Ashar",4,"Kindergartn");
		Students student2 = new Students("sanaullah",10,"Gymnasium");
		Students student3 = new Students("ryan",7,"Schule");
		List<Students> list = new ArrayList<Students>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		return list;
	}

}
