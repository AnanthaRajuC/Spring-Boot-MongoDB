package io.github.anantharajuc.sbmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbmdb.model.Demographics;

/**
 * 
 * Repository class for <code>Demographics</code> domain object. 
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Repository
public interface DemographicsRepository extends MongoRepository<Demographics, String> 
{

}
