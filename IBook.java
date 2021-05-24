package Interfaces;
import Classes.*;

public interface IBook{
	boolean addBook(Book b);
	boolean removeBook(Book b);
	Book searchBook(int bId);
	void showallBook();
}
