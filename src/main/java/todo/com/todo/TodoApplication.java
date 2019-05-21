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
		
		this.todoRepo.save(new Todo(1,"brush teeth",true));
		this.todoRepo.save(new Todo(2,"shoes polish",true));
		this.todoRepo.save(new Todo(3,"iron cloths",true));
		this.todoRepo.save(new Todo(4,"make breakfast",true));
		this.todoRepo.save(new Todo(6,"clean room",true));
		this.todoRepo.save(new Todo(7,"bring vegitables",true));
		this.todoRepo.save(new Todo(8,"prepare protien shake",true));
		this.todoRepo.save(new Todo(9,"hit the gym",true));
		this.todoRepo.save(new Todo(10,"read before going to sleep",true));		
	

    }

}
