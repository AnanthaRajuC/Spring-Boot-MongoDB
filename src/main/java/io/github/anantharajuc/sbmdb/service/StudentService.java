package io.github.anantharajuc.sbmdb.service;

import java.util.List;

import io.github.anantharajuc.sbmdb.domain.model.Student;

/**
 * Student Service.
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
public interface StudentService 
{
	Student createStudent(Student student);
	
	Student findStudentById(String id);
	
	List<Student> findStudentByName(String name);
	
	List<Student> nativeQueryFindByName(String name);
	
	List<Student> findAllStudents();
	
	List<Student> findStudentByDepartmentName(String departmentName);
	
	List<Student> findAllStudentsPagination(int pageNo, int pageSize);
	
	List<Student> findAllStudentsSorting(String direction, String properties);
	
	Student updateStudent(String id, Student student);
	
	void deleteStudentById(String id);
}
