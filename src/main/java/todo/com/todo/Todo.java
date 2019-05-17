package todo.com.todo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo{

    @Id
    private int id;
    private String title;
	private Boolean completed;

	public Todo(){};
	
	public Todo(int id, String title, Boolean completed){

		this.id=id;
		this.title=title;
		this.completed=completed;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id= id;
    }
    
    public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title= title;
    }
    
    public Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed= completed;
	}

}