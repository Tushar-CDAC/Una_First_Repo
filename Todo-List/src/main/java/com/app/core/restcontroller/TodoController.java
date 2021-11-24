package com.app.core.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.entity.Todo;
import com.app.core.service.ITodoService;

@RestController
@CrossOrigin
public class TodoController {

	@Autowired
	private ITodoService service;

	public TodoController() {
		System.out.println("in controller");
	}

	// add todo
	@PostMapping("/addtodo")
	public ResponseEntity<?> addTodo(@RequestBody Todo todo) {
		System.out.println("IN add TODO");
		return new ResponseEntity<>(service.addTodo(todo), HttpStatus.OK);
	}

	// get todo
	@GetMapping("/gettodo/{id}")
	public ResponseEntity<?> getTodo(@PathVariable long id) {
		System.out.println("IN GET TODO");
		return new ResponseEntity<>(service.getTodo(id), HttpStatus.OK);
	}

	// deletetodo
	@DeleteMapping("/deletetodo/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable long id) {
		System.out.println("IN delete TODO");
		return new ResponseEntity<>(service.deleteTodo(id), HttpStatus.OK);
	}

	// updatetodo
//	@PutMapping("/updatetodo")
//	public ResponseEntity<?> updateTodo(@RequestBody Todo todo) {
//		System.out.println("IN update TODO");
//		return new ResponseEntity<>(service.updateTodo(todo), HttpStatus.OK);
//	}
}
