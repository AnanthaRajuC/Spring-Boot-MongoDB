package io.github.anantharajuc.sbmdb.api.controller.student;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmdb.api.ResourcePaths;
import io.github.anantharajuc.sbmdb.api.hateoas.StudentRepresentationModelAssembler;
import io.github.anantharajuc.sbmdb.domain.model.Demographics;
import io.github.anantharajuc.sbmdb.domain.model.Hobbies;
import io.github.anantharajuc.sbmdb.domain.model.Student;
import io.github.anantharajuc.sbmdb.domain.model.Subject;
import io.github.anantharajuc.sbmdb.service.impl.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/*
 * Student Query Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@Tag(name="StudentQueryController", description = "Set of public APIs, for querying Student.")
@RestController
//@RequestMapping(value=ResourcePaths.Student.V1.ROOT)
@RequestMapping("/api")
public class StudentQueryController 
{
	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@Autowired
	private StudentRepresentationModelAssembler studentRepresentationModelAssembler;
	
	@Autowired
	ModelMapper modelMapper;
	
	/*
	 * Method that returns all students from the datastore 
	 * 
	 * HTTP Status:
	 * 
	 * 200 - OK: Everything worked as expected.
	 */
	//@GetMapping()
	@GetMapping(value = "/students", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	@Operation(summary="Find all student's in the data store.")
	public ResponseEntity<CollectionModel<EntityModel<Student>>> findAllStudents()
	{
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>(); 
		
		return new ResponseEntity<>(studentRepresentationModelAssembler.toCollectionModel(studentServiceImpl.findAllStudents()), headers, HttpStatus.OK); 
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
	//@GetMapping(value=ResourcePaths.ID)
	@GetMapping("/students/{id}")
	@ResponseStatus(HttpStatus.OK) 
	/*public ResponseEntity<Student> findStudentById(@PathVariable String id)
	{
		return  ResponseEntity.ok(studentServiceImpl.findStudentById(id));
	}*/
	public ResponseEntity<EntityModel<Student>> findStudentById(@PathVariable String id)
	{
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>(); 
		
		return new ResponseEntity<>(studentRepresentationModelAssembler.toModel(studentServiceImpl.findStudentById(id)), headers, HttpStatus.OK);
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
	
	@GetMapping("/students/{id}/subjects")
	@ResponseStatus(HttpStatus.OK) 
	public ResponseEntity<List<Subject>> findStudentSubjects(@PathVariable String id)
	{
		return  ResponseEntity.ok(studentServiceImpl.findStudentSubjects(id)); 
	}
	
	@GetMapping("/students/{id}/demographics")
	@ResponseStatus(HttpStatus.OK) 
	public ResponseEntity<Demographics> findStudentDemographics(@PathVariable String id)
	{
		return  ResponseEntity.ok(studentServiceImpl.findStudentDemographics(id)); 
	}
	
	@GetMapping("/students/{id}/hobbies")
	@ResponseStatus(HttpStatus.OK) 
	public ResponseEntity<List<Hobbies>> findStudentHobbies(@PathVariable String id)
	{
		return  ResponseEntity.ok(studentServiceImpl.findStudentHobbies(id));  
	}
}
