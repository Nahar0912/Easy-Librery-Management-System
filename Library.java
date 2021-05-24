package Classes;
import Interfaces.*;

public class Library implements IEmployee,IMember,IBook{
	private String name,address;
	private long phone_no;
	boolean flag=false;
	
	private Employee employee[]=new Employee[50];
	private Member member[]=new Member[50];
	private Book book[]=new Book[50];
	
	public Library(){}
	public Library(String name,String address,long phone_no){
		this.name=name;
		this.address=address;
		this.phone_no=phone_no;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setPhone(long phone_no){
		this.phone_no=phone_no;
	}
	public long getPhone(){
		return phone_no;
	}
	
	public void show(){
		System.out.println("Name :	"+getName());
		System.out.println("Phone : " +getAddress());
		System.out.println("Phone : " +getPhone());
	}
	
	// Emplyee Management
	public boolean addEmployee(Employee e){
		for(int i=0;i<employee.length;i++){
			if(employee[i]==null){
				employee[i]=e;
				flag=true;
				break;
			}
			else{
				flag = false;
			}
		}
		return flag;
	}
	public boolean removeEmployee(Employee e){
		for(int i=0;i<employee.length;i++){
			if(employee[i]==e){
				employee[i]=null;
				flag=true;
				break;
			}
			else{
				flag=false;
			}
		}
		return flag;
	}
	public Employee searchEmployee(int eId){
		Employee e=null;
		for(int i=0;i<employee.length;i++){
			if(employee[i]!=null){
				if(employee[i].getId()==eId){
					e=employee[i];
					break;
				}
			}
		}
		return e;
	}
	public void showallEmployee(){
		for(int i=0;i<employee.length;i++){
			if(employee[i]!=null){
				employee[i].show();
			}
		}
	}
	
	// Member Management
	public boolean addMember(Member m){
		for(int i=0;i<member.length;i++){
			if(member[i]==null){
				member[i]=m;
				flag=true;
				break;
			}
			else{
				flag = false;
			}
		}
		return flag;
	}
	public boolean removeMember(Member m){
		for(int i=0;i<member.length;i++){
			if(member[i]==m){
				member[i]=null;
				flag=true;
				break;
			}
			else{
				flag=false;
			}
		}
		return flag;
	}
	public Member searchMember(int mId){
		Member m=null;
		for(int i=0;i<member.length;i++){
			if(member[i]!=null){
				if(member[i].getId()==mId){
					m=member[i];
					break;
				}
			}
		}
		return m;
	}
	public void showallMember(){
		for(int i=0;i<member.length;i++){
			if(member[i]!=null){
				member[i].show();
			}
		}
	}
	
	// Book Management
	public boolean addBook(Book b){
		for(int i=0;i<book.length;i++){
			if(book[i]==null){
				book[i]=b;
				flag=true;
				break;
			}
			else{
				flag = false;
			}
		}
		return flag;
	}
	
	public boolean removeBook(Book b){
		for(int i=0;i<book.length;i++){
			if(book[i]==b){
				book[i]=null;
				flag=true;
				break;
			}
			else{
				flag=false;
			}
		}
		return flag;
	}
	
	public Book searchBook(int bId){
		Book b=null;
		for(int i=0;i<book.length;i++){
			if(book[i]!=null){
				if(book[i].getId()==bId){
					b=book[i];
					break;
				}
			}
		}
		return b;
	}
	
	public void showallBook(){
		for(int i=0;i<book.length;i++){
			if(book[i]!=null){
				book[i].show();
			}
		}
	}
	
}