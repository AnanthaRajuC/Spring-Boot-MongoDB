package io.github.anantharajuc.sbmdb.api.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Component;

import io.github.anantharajuc.sbmdb.api.controller.student.StudentQueryController;
import io.github.anantharajuc.sbmdb.api.hateoas.common.SimpleIdentifiableRepresentationModelAssembler;
import io.github.anantharajuc.sbmdb.domain.model.Student;

@Component
public class StudentRepresentationModelAssembler extends SimpleIdentifiableRepresentationModelAssembler<Student>
{
	public StudentRepresentationModelAssembler()
	{
		super(StudentQueryController.class);
	}
	
	@Override
	public void addLinks(EntityModel<Student> resource)
	{
		super.addLinks(resource);
		
		resource.add(linkTo(methodOn(StudentQueryController.class).findStudentSubjects(resource.getContent().getId())).withRel("subjects")); 
		resource.add(linkTo(methodOn(StudentQueryController.class).findStudentDemographics(resource.getContent().getId())).withRel("demographics")); 
		resource.add(linkTo(methodOn(StudentQueryController.class).findStudentHobbies(resource.getContent().getId())).withRel("hobbies")); 
	}
	
	@Override
	public void addLinks(CollectionModel<EntityModel<Student>> resources) 
	{
		super.addLinks(resources);
		
		resources.add(linkTo(methodOn(RootController.class).root()).withRel("root"));
	}
}
