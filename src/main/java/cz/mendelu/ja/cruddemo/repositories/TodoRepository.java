package cz.mendelu.ja.cruddemo.repositories;

import cz.mendelu.ja.cruddemo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
