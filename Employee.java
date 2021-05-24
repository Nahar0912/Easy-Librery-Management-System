package Classes;

public class Employee extends Person{
	
	private double salary;
	
	public Employee(){}
	public Employee(String name,int id,double salary){
		super(name,id);
		this.salary=salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void show(){
		System.out.println("Name :	"+getName());
		System.out.println("ID : " +getId());
		System.out.println("Salary : " +getSalary());
	}
}