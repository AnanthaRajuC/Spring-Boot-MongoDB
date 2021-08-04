package io.github.anantharajuc.sbmdb.api.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmdb.api.controller.student.StudentQueryController;

@RestController
public class RootController 
{
	@SuppressWarnings("rawtypes")
	@GetMapping("/")
	public ResponseEntity<RepresentationModel> root()
	{
		RepresentationModel<?> model = new RepresentationModel<>();
		
		model.add(linkTo(methodOn(RootController.class).root()).withSelfRel());
		model.add(linkTo(methodOn(StudentQueryController.class).findAllStudents()).withRel("students"));
		
		return ResponseEntity.ok(model);
	}
}
