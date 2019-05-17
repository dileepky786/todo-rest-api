package todo.com.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Autowired
	TodoRepo todoRepo;
	@Override
    public void run(String...args) throws Exception {
		
		this.todoRepo.save(new Todo(1,"todo1",true));
		this.todoRepo.save(new Todo(2,"todo2",true));
		this.todoRepo.save(new Todo(3,"todo3",true));
		this.todoRepo.save(new Todo(4,"todo4",true));
		this.todoRepo.save(new Todo(6,"todo6",true));
		this.todoRepo.save(new Todo(7,"todo7",true));
		this.todoRepo.save(new Todo(8,"todo8",true));
		this.todoRepo.save(new Todo(9,"todo9",true));
		this.todoRepo.save(new Todo(10,"todo10",true));		
	

    }

}
