package io.github.anantharajuc.sbmdb.service;

import java.util.List;
import io.github.anantharajuc.sbmdb.model.Student;

public interface StudentService 
{
	Student createStudent(Student student);
	
	Student findStudentById(String id);
	
	List<Student> findStudentByName(String name);
	
	List<Student> findAllStudents();
	
	Student updateStudent(String id, Student student);
	
	void deleteStudentById(String id);
}
