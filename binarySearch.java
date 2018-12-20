// binary search using array list
import java.util.ArrayList;
import java.util.Scanner;

public class BS
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Till?"); // sorted elements from 1 to end_point
		int end_point = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>(end_point);
		for(int i=1; i<=end_point; i++)
			numbers.add(i);
		System.out.println(numbers + "\nFind?");
		int find = sc.nextInt();
		int result = bSearch(numbers, 0, end_point-1, find);
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result);
	}
	public static int bSearch(ArrayList<Integer> numbers, int start, int end, int find)
	{
		if (end>=start)
		{
			int mid = start + (end-start)/2;
			if (numbers.get(mid)==find) return mid;
			if (numbers.get(mid)>find) return bSearch(numbers, start, mid-1, find);
			return bSearch(numbers, mid+1, end, find);
		}
		return -1;
	}
}
