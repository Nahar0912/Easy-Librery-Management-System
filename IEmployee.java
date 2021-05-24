package Interfaces;
import Classes.*;

public interface IEmployee{
	boolean addEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(int eId);
	void showallEmployee();
}
