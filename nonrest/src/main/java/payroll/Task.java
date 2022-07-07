package payroll;
import java.util.Objects;

public class Task {
	
	private String id;
	private String description;
	private String idEmployee;
	
	public Task() {
	}
	
	public Task(String id, String description, Strig idEmployee) {
		this.id = id;
		this.description = description;
		this.idEmployee = idEmployee;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getIdEmployee() {
		return this.idEmployee;
	}
}
