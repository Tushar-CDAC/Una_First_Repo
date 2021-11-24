package com.app.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.core.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
