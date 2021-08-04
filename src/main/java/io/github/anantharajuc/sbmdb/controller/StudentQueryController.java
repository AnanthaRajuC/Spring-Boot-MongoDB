package io.github.anantharajuc.sbmdb.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmdb.api.ResourcePaths;
import io.github.anantharajuc.sbmdb.model.Student;
import io.github.anantharajuc.sbmdb.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/*
 * Student Query Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@RestController
@RequestMapping(value=ResourcePaths.Student.V1.ROOT)
public class StudentQueryController 
{
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	ModelMapper modelMapper;
	
	/*
	 * Method that returns all students from the datastore 
	 * 
	 * HTTP Status:
	 * 
	 * 200 - OK: Everything worked as expected.
	 */
	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary="Find all student's in the data store.")
	public ResponseEntity<List<Student>> findAllStudents()
	{
		return ResponseEntity.ok(studentServiceImpl.findAllStudents());
	}
	
	@GetMapping(value=ResourcePaths.SORTING)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Student>> findAllStudentsSorting(@RequestParam String direction, @RequestParam String properties)
	{
		return ResponseEntity.ok(studentServiceImpl.findAllStudentsSorting(direction, properties));
	}
	
	@GetMapping(value=ResourcePaths.PAGINATION)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Student>> findAllStudentsPagination(@RequestParam int pageNo, @RequestParam int pageSize)
	{
		return ResponseEntity.ok(studentServiceImpl.findAllStudentsPagination(pageNo, pageSize));
	}
	
	/*
	 * Method to search a student by id.
	 * 
	 * @return <code>Student</code> object and the HTTP status
	 * 
	 * HTTP Status:
	 * 
	 * 200 - OK: Everything worked as expected.
	 */	
	@Operation(summary="Get a student object by its id")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found the student", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class)) }),
			               @ApiResponse(responseCode = "400", description = "Invalid id supplied", content = @Content), 
                           @ApiResponse(responseCode = "404", description = "Student not found", content = @Content) })
	@GetMapping(value=ResourcePaths.ID)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Student> findStudentById(@PathVariable String id)
	{
		return  ResponseEntity.ok(studentServiceImpl.findStudentById(id));
	}
	
	@Operation(summary="Find student by student name via native query")
	@GetMapping(value=ResourcePaths.NAME_NATIVE_QUERY)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Student>> findStudentByNameNativeQuery(@RequestParam String name)
	{
		return ResponseEntity.ok(studentServiceImpl.nativeQueryFindByName(name));
	}
	
	@Operation(summary="Find student by student name")
	@GetMapping(value=ResourcePaths.NAME)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Student>> findStudentByName(@RequestParam String name)
	{
		return ResponseEntity.ok(studentServiceImpl.findStudentByName(name));
	}
	
	@Operation(summary="Find student by department name")
	@GetMapping(value=ResourcePaths.DEPARTMENT)
	@ResponseStatus(HttpStatus.OK)
	public List<Student> findStudentByDepartmentName(@RequestParam String departmentName)
	{
		return studentServiceImpl.findStudentByDepartmentName(departmentName);
	}
}
