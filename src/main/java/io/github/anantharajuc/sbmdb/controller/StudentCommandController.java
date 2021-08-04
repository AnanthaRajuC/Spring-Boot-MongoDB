package io.github.anantharajuc.sbmdb.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmdb.api.ResourcePaths;
import io.github.anantharajuc.sbmdb.model.Student;
import io.github.anantharajuc.sbmdb.model.dto.StudentDTO;
import io.github.anantharajuc.sbmdb.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;

/*
 * Student Command Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@RestController
@RequestMapping(value=ResourcePaths.Student.V1.ROOT)
public class StudentCommandController 
{
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	ModelMapper modelMapper;
	
	/*
	 * Method that creates a student in the database.
	 * 
	 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
	 * 
	 * @param student - student object in JSON format
	 * 
	 * @return <code>student</code> object and the HTTP status
	 * 
	 * HTTP Status:
	 * 
	 * 201 - Created: Everything worked as expected.
	 */
	@Operation(summary="Add a new student to the datastore")
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Student> createStudent(@RequestBody StudentDTO studentDTO)
	{
		Student student = modelMapper.map(studentDTO, Student.class);
		
		return ResponseEntity.ok(studentServiceImpl.createStudent(student)); 
	}

	/*
	 * Method that updates an existing student in the database.
	 * 
	 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
	 * 
	 * @param id - the id of the student
	 * @param studentDTO - updated <code>student</code> object
	 * 
	 * @return Updated <code>student</code> object and the HTTP status
	 * 
	 * HTTP Status:
	 * 
	 * 200 - OK: Everything worked as expected.
	 */
	@PutMapping(value=ResourcePaths.ID)
	public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody StudentDTO studentDTO)
	{
		Student student = modelMapper.map(studentDTO, Student.class);
		
		return ResponseEntity.ok(studentServiceImpl.updateStudent(id, student));
	}

	/*
	 * Method that deletes an existing student in the database.
	 * 
	 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
	 * 
	 * @param id - the id of the student
	 * 
	 * @return Response and the HTTP status
	 * 
	 * HTTP Status:
	 * 
	 * 204 - OK: Everything worked as expected.
	 * 404 - Not Found: The requested resource doesn't exist.
	 * 405 - Method Not Allowed: Resource (Id) to be deleted not supplied
	 */
	@DeleteMapping(value=ResourcePaths.ID)
	public void deleteStudentById(@PathVariable String id)
	{
		studentServiceImpl.deleteStudentById(id);
	}
}
