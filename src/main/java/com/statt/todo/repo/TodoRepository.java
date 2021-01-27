package com.statt.todo.repo;

import com.statt.todo.model.Todo;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Todo Entity")
@RepositoryRestResource
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
