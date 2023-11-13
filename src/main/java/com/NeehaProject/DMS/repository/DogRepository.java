package com.NeehaProject.DMS.repository;
/**
 * @author S555197-Neeha Beerkur
 */
import org.springframework.data.repository.CrudRepository;

import com.NeehaProject.DMS.Models.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
List<Dog> findByName(String name);
	
}
