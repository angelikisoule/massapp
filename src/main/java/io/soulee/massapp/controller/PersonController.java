package io.soulee.massapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.soulee.massapp.dao.PersonsRepository;
import io.soulee.massapp.entity.Person;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
	
	@Autowired
	private PersonsRepository personsRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<Person>> list() {
		Iterable<Person> responseData = personsRepository.findAll();
		return responseOK(responseData);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Person> find(@PathVariable Long id) {
		Optional<Person> order = personsRepository.findById(id);
		return toResponseEntity(order);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<Person> find(@RequestParam String lastName) {
		Optional<Person> order = personsRepository.findByLastName(lastName);
		return toResponseEntity(order);
	}
	
	
	protected static <T> ResponseEntity<T> responseOK(T data) {
		return ResponseEntity.status(HttpStatus.OK)
							 .body(data);
	}
	
	protected static <T> ResponseEntity<T> toResponseEntity(Optional<T> optionalValue) {
		return optionalValue.map(ResponseEntity.ok()::body)
							.orElseGet(() -> ResponseEntity.notFound()
														   .build());
	}

}
