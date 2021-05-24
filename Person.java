package Classes;

public abstract class Person {
	
	protected String name;
	protected int id;
	
	public Person(){}
	public Person(String name,int id){
		this.name=name;
		this.id=id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public abstract void show();
}