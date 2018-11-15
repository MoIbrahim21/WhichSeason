/**
 * Mo Ibrahim 
 * PD 5 Intro to Java
 */
import java.util.Scanner;

public class Whichseason {

	public static void main(String[] args) 
	{
		Scanner jawn = new Scanner(System.in);
		System.out.println("To Start please input your birth month in number form");
		int m1 = jawn.nextInt();
		if(m1<1 || m1>12)
		{
			System.out.println("Than month is not accurate");
		}
		else if(m1==12 || m1<=2)
		{
			System.out.println("You are born during the winter season");
		}
		else if (m1<=5)
		{
			System.out.println("You are born during the spring season");
		}
		else if (m1<=8)
		{
			System.out.println("You were born during the summer season");
		}
		else if (m1<=11)
		{
			System.out.println("You were born during the fall season");
		}
		
		
	}
	

}
