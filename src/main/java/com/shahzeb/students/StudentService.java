package com.shahzeb.students;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


	@Autowired
	private StudentsRepository studentsRepository;

	public List<Students> getAllStudents() {


		List<Students> students = new ArrayList<>();

		studentsRepository.findAll().forEach(students::add);

		return students;
	}

	public Optional<Students> getStudentById(Integer id) {

		// return list.stream().filter(s -> s.getName().equals(str)).findFirst().get();
		return studentsRepository.findById(id);
	}

	public boolean setStudent(Students student) {
		// Students[] a = { student1, student2, student3, tmp };

		studentsRepository.save(student);
		return true;
	}

	public void updateStudent(Students student, String str) {
//		int counter = 0;
//		for (Students s : list) {
//			if (s.getName().equals(str)) {
//				list.set(counter, student);
//				return;
//			}
//		}

	}

	public void deleteStudentById(String str) {
//		 list.removeIf(t -> t.getName().equals(str));

	}

}
