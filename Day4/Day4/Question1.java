import java.util.Scanner;

public class Avenger {
	
	Scanner sc=new Scanner(System.in);

//	(name,age,power,weapon,planet)
	String name,power,weapon,planet;
	int age;
	public void getDetail()
	{
		System.out.println("Enter name");
		name=sc.nextLine();
		
		System.out.println("Enter Your power");
		power=sc.nextLine();
		
		System.out.println("Enter Your weapon");
		weapon=sc.nextLine();
		
		System.out.println("Enter your planet");
		planet=sc.nextLine();
	}
	
	public void displayDetail()
	{
		System.out.println("Welcome "+name+", your power is "+power+", weapon is "+weapon+" and you are from "+planet+".");
	}
}