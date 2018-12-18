import java.util.*;

class arrList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		ArrayList<Integer> thisIsAL = new ArrayList<Integer>(size);
		// System.out.println("This is ArrayList : " + thisIsAL);
		for (int i=0; i<size+2; i++)
			thisIsAL.add(sc.nextInt());
		for (int i=0; i<size+2; i++)
			System.out.print(thisIsAL.get(i) + " ");
		System.out.println(thisIsAL);
	}
}