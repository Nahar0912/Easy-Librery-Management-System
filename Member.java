package Classes;

public class Member extends Person {
	private double fee;
	
	public Member(){}
	public Member(String name,int id,double fee){
		super(name,id);
		this.fee=fee;
	}
	
	public void setFee(double fee){
		this.fee = fee;
	}
	
	public double getFee(){
		return fee;
	}
	public void show(){
		System.out.println("Name :	" +getName());
		System.out.println("ID :	" +getId());
		System.out.println("Fee :	"+getFee());
	}
}