package pack;
import java.util.Scanner;

class Bookstore {
	
	String bookname;
	int qty;
	int price;
	
	static String collegename;
	
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter bookname");
		bookname=sc.nextLine();
		
		System.out.println("Enter quantity");
		qty=sc.nextInt();
		
		System.out.println("Enter price");
		price=sc.nextInt();
		
	}
	
	static void college()
	{
		collegename="MRU";
	}
	
	void display()
	{
		System.out.println("College name : "+collegename);
		System.out.println("Bookname : "+bookname);
		
		System.out.println("Quanity:"+qty );
		
		System.out.println("Book price : "+price+" Rs");	
		
		
	
	}
	
	int checkPrice()
	{
	
		if(price>5000)
			return 200;
		else
			return 100;
	}
	
}
	public class Mybookstore{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookstore b=new Bookstore();
		
		b.input();
		Bookstore.college();
		b.display();
		System.out.println("Discount : "+b.checkPrice()+" Rs");
		


	}


}