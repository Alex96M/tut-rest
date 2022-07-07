package payroll;

import java.util.List;
import Employee;
import Task;
import java.util.Objects;

public class ControllerTask {
	
	Task task;
	List<Employee> employee = new List<>();
	
	public ControllerTask() {
		
	}
	
	public newTask (String idEmployee, String desc, String idTask) {
		task = new Task(idTask, desc, idEmployee);
	}
	
	public List<Task> getLista(String id){
		for (int i = 0; i < employee.size(); i++) {
			if (employee.getId().equals(id)) {
				return employee.ListTask;
				break;
			}
		}
	}
}
