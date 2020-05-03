package com.shahzeb.students;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// DataService for StudentsService 
@Repository
public interface StudentsRepository extends CrudRepository<Students,Integer> {

}
