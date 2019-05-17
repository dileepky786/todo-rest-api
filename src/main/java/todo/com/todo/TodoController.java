package todo.com.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class TodoController{

    @Autowired
    TodoRepo todoRepo;

    @GetMapping("/todos")
    public List<Todo> getTodos(){

        List<Todo> todos = todoRepo.findAll();

        return todos;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable int id){

        Todo todo = todoRepo.findById(id).orElse(null);
        return todo;
    }

    @PutMapping("/todos/{id}")
    public void save(@RequestBody Todo todo, @PathVariable int id){

        System.out.print(todo.getTitle());
        todoRepo.save(todo);
    }
}