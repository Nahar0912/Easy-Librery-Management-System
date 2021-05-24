package Classes;

public class Book{
	
	private String name, publisher;
	private int id;
	
	public Book(){}
	public Book(String name, int id, String publisher){
		this.name=name;
		this.id=id;
		this.publisher=publisher;
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
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void show(){
		System.out.println("Name :	"+getName());
		System.out.println("ID : " +getId());
		System.out.println("Publisher : " +getPublisher());
	}
}