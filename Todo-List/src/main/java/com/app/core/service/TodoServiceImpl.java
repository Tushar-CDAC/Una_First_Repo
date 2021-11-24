package com.app.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.entity.Todo;

import com.app.core.repo.TodoRepository;

@Service
public class TodoServiceImpl implements ITodoService{

	@Autowired
	private TodoRepository repo;
	
	@Override
	public String addTodo(Todo todo) {
		// TODO Auto-generated method stub
		String msg=" ";
		Todo todo1 = new Todo(todo.getTitle(),todo.getDescription(),todo.getTodoStatus(),todo.getDateCreated(),todo.getLastModified());
		msg ="Todo added;";
		repo.save(todo1);
		return  msg;
	}

	@Override
	public void updateTodo(Todo todo) {
		todo.setTitle(todo.getTitle());
		todo.setDescription(todo.getDescription());
		todo.setTodoStatus(todo.getTodoStatus());
		todo.setDateCreated(todo.getDateCreated());
		todo.setLastModified(todo.getLastModified());
		repo.save(todo);
	}

	@Override
	public Todo getTodo(long id) {
		return repo.findById(id).get();
	}

	@Override
	public String deleteTodo(long id) {
		// TODO Auto-generated method stub
		String msg ="";
		repo.deleteById(id);
		msg="todo deleted";
		return msg;
	}

}
