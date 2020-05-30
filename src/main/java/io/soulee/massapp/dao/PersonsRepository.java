package io.soulee.massapp.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.soulee.massapp.entity.Person;

public interface PersonsRepository extends CrudRepository<Person, Long>{

	Optional<Person> findByLastName(@Param("lastName") String lastName);

}
