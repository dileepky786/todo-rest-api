package todo.com.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

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

    @PutMapping("/todos")
    public void updateTodo(@RequestBody Todo todo){
        
        todoRepo.save(todo);
    }

    @PostMapping("/todos")
    public List<Todo> saveTodo(@RequestBody Todo todo){
        
        todoRepo.save(todo);

        List<Todo> todos = todoRepo.findAll();

        return todos;
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id){
        
        todoRepo.deleteById(id);
    }

    @GetMapping("todos/search")
    public List<Todo> search(@RequestParam(value = "q") String q){

        return todoRepo.findAll().stream().filter(x -> x.getTitle().toLowerCase().contains(q.toLowerCase())).collect(Collectors.toList());
    }
}