package com.app.core.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.core.entity.Todo;

@Service
@Transactional
public interface ITodoService {

	String addTodo(Todo todo);
	void updateTodo(Todo todo);
	Todo getTodo(long id);
	String deleteTodo(long id);
}
