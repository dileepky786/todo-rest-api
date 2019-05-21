package todo.com.todo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Integer>{

	List<Todo> findAllByTitle(String q);

	List<Todo> findByTitle(String q);


}