// check if given strings are anagram or not
import java.util.*;

public class anagram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		while(testcase-->0)
		{
			String first = sc.nextLine();
			String second = sc.nextLine();
			// remove all whitespace
			String fir = first.replaceAll("\\s+", "");
			String sec = second.replaceAll("\\s+", "");
			// convert to char array
			char f[] = fir.toCharArray();
			char s[] = sec.toCharArray();
			// sort acc to ascii values
			Arrays.sort(f);
			Arrays.sort(s);
			System.out.println(Arrays.equals(f, s) ? 1 : 0);
		}
	}
}