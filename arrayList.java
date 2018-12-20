import java.util.Scanner;
import java.util.ArrayList;

public class arrList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		ArrayList<Integer> thisIsAL = new ArrayList<Integer>(size);
		// adding elements
		for (int i=0; i<size+2; i++) // (size+2)
			thisIsAL.add(sc.nextInt());
		// printing one by one
		for (int i=0; i<size+2; i++)
			System.out.print(thisIsAL.get(i) + " ");
		// printing altogether
		System.out.println(thisIsAL);
	}
}
