package io.github.anantharajuc.sbmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbmdb.domain.model.Hobbies;

/**
 * 
 * Repository class for <code>Hobbies</code> domain object. 
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Repository
public interface HobbiesRepository extends MongoRepository<Hobbies, String>
{

}
