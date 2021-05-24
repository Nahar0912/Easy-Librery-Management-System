package Interfaces;
import Classes.*;

public interface IMember{
	boolean addMember(Member m);
	boolean removeMember(Member m);
	Member searchMember(int mId);
	void showallMember();
}
