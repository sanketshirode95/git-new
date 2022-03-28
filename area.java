package pack;
import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float l,b;
		float area, perimeter;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length");
		l=sc.nextFloat();
		
		System.out.println("Enter breadth");
		b=sc.nextFloat();
		
		area=l*b;
		perimeter=2*(l+b);
		
		System.out.println("Area= "+area);
		System.out.println("Perimeter+ "+perimeter);
		

	}

}
