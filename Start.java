import Classes.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Start{
	public static void main(String[] args)throws IOException{
		try{
			Scanner sc =new Scanner(System.in);
			Library lb=new Library();
			Employee e=new Employee();
			Member m=new Member();
			Book b=new Book();
			FileWriter fw=new FileWriter("A.txt",true); 
			
			fw.write("HELLO GLORIOUS\n");			
			fw.close();
			
			FileReader fr=new FileReader("F:/JAVA/Library Management System/New folder/ABC.txt");
			Scanner sin=new Scanner(fr);
			String s;
			while(sin.hasNext()){
				s=sin.nextLine();
				System.out.println(s);
			}
			fr.close();
			
			
			boolean start=true;
			while(start){
				System.out.println("\n1.Employee Management");
				System.out.println("2.Member Management");
				System.out.println("3.Book Management");
				System.out.println("4.Library Information");
				System.out.println("5.Exit\n"); 
				
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice){
					// Emplyee Management
					case 1:
					System.out.println("\nSelect your option ");
					System.out.println("\t1.Insert New Employee");
					System.out.println("\t2.Remove Existing Employee");
					System.out.println("\t3.Show All Employees");
					System.out.println("\t4.Go Back\n");
					
					System.out.print("Enter your choice: ");	
					int c1 = sc.nextInt();
					switch(c1){
						case 1:
							System.out.println("Insert Employee Information<<<<<<");
							System.out.print("Enter Emplyee Name:	");
							String eName=sc.next();
							System.out.print("Enter Emplyee ID:	");
							int eId=sc.nextInt();
							System.out.print("Enter Emplyee Salary:	");
							double eSalary=sc.nextDouble();
							
							e=new Employee(eName,eId,eSalary);
							
							if(lb.addEmployee(e)){
								System.out.println("Employee added Successfully.");
								System.out.println("Name: "+eName+"\nID:	"+eId+"\nSalary:	"+eSalary);
							}
							else{
								System.out.println("Employee can't be added...Something went wrong");
							}
						break;
						
						case 2:
							System.out.println("Remove Emloyee Information<<<<<<<");
							System.out.print("Enter Eployee ID:	");
							int eId1=sc.nextInt();
							
							e=lb.searchEmployee(eId1);
							
							System.out.println("Confirm Delete?");
							System.out.print("Enter 1 to confirm");
							int delete=sc.nextInt();
							
							if(delete==1){
								if(e!=null){
									if(lb.removeEmployee(e)){
										System.out.println("Employee ID " +eId1+" Removed Successfully.");
									}
									else{
										System.out.println("Employee can't be deleted...Something went wrong");
									}
								}
								else{
									System.out.println("No Employee found.");
								}
							}
							else{
								System.out.println("Employee is not removed.");
							}
						break;
						
						case 3:
							System.out.println("You have chosen to show all Employee");
							lb.showallEmployee();
						break;
						
						case 4:
							System.out.println("Go back to main");
						break;
						
						default:
							System.out.println("\nTry again...");
						break;
					}
					break;
					
					
					//Member Management
					case 2:
					System.out.println("\nSelect your option ");
					System.out.println("\t1.Insert New Member");
					System.out.println("\t2.Remove Existing Member");
					System.out.println("\t3.Show All Member");
					System.out.println("\t4.Go Back\n");
					
					System.out.print("Enter your choice: ");	
					int c2 = sc.nextInt();
					switch(c2){
						case 1:
							System.out.println("Insert Member Information<<<<<<");
							System.out.print("Enter Member Name:	");
							String mName=sc.next();
							System.out.print("Enter Member ID:	");
							int mId=sc.nextInt();
							System.out.print("Enter Member Fee:	");
							double mFee=sc.nextDouble();
							
							m=new Member(mName,mId,mFee);
							
							if(lb.addMember(m)){
								System.out.println("Member added Successfully.");
								System.out.println("Name: "+mName+"\nID:	"+mId+"\nSalary:	"+mFee);
							}
							else{
								System.out.println("Member can't be added...Something went wrong");
							}
						break;
						
						case 2:
							System.out.println("Remove Member Information<<<<<<<");
							System.out.print("Enter Member ID:	");
							int mId1=sc.nextInt();
							
							m=lb.searchMember(mId1);
							
							System.out.println("Confirm Delete?");
							System.out.print("Enter 1 to confirm");
							int delete=sc.nextInt();
							
							if(delete==1){
								if(m!=null){
									if(lb.removeMember(m)){
										System.out.println("Member ID " +mId1+" Removed Successfully.");
									}
									else{
										System.out.println("Member can't be deleted...Something went wrong");
									}
								}
								else{
									System.out.println("No Member found.");
								}
							}
							else{
								System.out.println("Member is not removed.");
							}
						break;
						
						case 3:
							System.out.println("You have chosen to show all Member");
							lb.showallMember();
						break;
						
						case 4:
							System.out.println("Go back to main");
						break;
						
						default:
							System.out.println("\nTry again...");
						break;
					}
					break;
					
					
					// Book Management
					case 3 :
					System.out.println("\nSelect your option :");
					System.out.println("\t1.Insert New Book");
					System.out.println("\t2.Remove Existing Book");
					System.out.println("\t3.Show All Books");
					System.out.println("\t4.Go Back\n");
					
					System.out.print("Enter your choice : ");
					int c3 = sc.nextInt();
					
					switch(c3){
						case 1:
							System.out.println("Insert Book Information<<<<<<");
							System.out.print("Enter book name : ");
							String bName = sc.next();
							System.out.print("Enter book ID : ");
							int bId = sc.nextInt();
							System.out.print("Enter book publisher : ");
							String bPublisher = sc.next();
							
							b=new Book(bName,bId,bPublisher);
						
							if(lb.addBook(b)){
								System.out.println("Book added Successfully.");
								System.out.println("Name: "+bName+"\nID:	"+bId+"\nPublisher:	"+bPublisher);
							}
							else{
								System.out.println("Book can't be added...Something went wrong");
							}
						break;
						
						case 2:
							System.out.println("Remove Book<<<<<<<");
							System.out.println("Enter Book ID : ");
							int bId1 = sc.nextInt();
							
							b=lb.searchBook(bId1);
							
							System.out.println("Confirm Delete?");
							System.out.print("Enter 1 to confirm");
							int delete=sc.nextInt();
							
							if(delete==1){
								if(b!=null){
									if(lb.removeBook(b)){
										System.out.println("Book " +bId1+" Removed Successfully.");
									}
									else{
										System.out.println("Book can't be removed...Something went wrong");
									}
								}
								else{
									System.out.println("No Book found.");
								}
							}
							else{
								System.out.println("Book is not removed.");
							}
						break;
						
						case 3:
							System.out.println("You have chosen to show all Books");
							lb.showallBook();
						break;
						
						case 4:
							System.out.println("Go back to main");
						break;
						
						default:
							System.out.println("\nTry again...");
						break;
					}
					break;	
					
					
					// Library Information
					case 4:
					System.out.println("\nSelect your option :");
					System.out.println("\t1.Show Library Information");
					System.out.println("\t2.Go Back\n");
					
					System.out.print("Enter your choice : ");
					int c4 = sc.nextInt();
					
					switch(c4){
						case 1:
							lb=new Library("GLORIOUS","Uttara sector 2",1854456778);
							
							System.out.println("\nOur Library Information<<<<<<");
							System.out.println("Name : "+lb.getName());
							System.out.println("Address: "+lb.getAddress());
							System.out.println("Phone no: "+lb.getPhone());
						break;
						
						case 2:
							System.out.println("Go back to main");
						break;
						
						default:
							System.out.println("\nTry again...");
						break;
					}
					break;
					
					
					// Exit
					case 5:
						start=false;
						System.out.println("\nGoodbye...hope see you again.....");
					break;
					
					default:
						System.out.println("\nTry again...");
					break;
				}
			}
		}
		catch(FileNotFoundException ex){
			System.out.println("\nYour File Path Is Incorrect!!!! ");
		}
		catch(IOException ex){
			System.out.println("\nYour File is not created!!!! ");
		}
		catch(InputMismatchException ex){
			System.out.println("\nPlease enter a Number!!!!!");
		}
		catch(Exception ex){
			System.out.println("\nInput Mismatch!!!!!");
		}
		finally{
			System.out.println("\nAnd Try Again...");
		}
	}
}