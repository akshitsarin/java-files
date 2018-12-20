// bridge of stones geeks4geeks question
import java.util.Scanner;
class BridgeOfStones
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, x, answer;
		while (t-->0)
		{
			n = sc.nextInt();
			x = sc.nextInt();
			answer = minJump(n, x);
			System.out.println(answer);
		}
	}

	public static int minJump(int n, int x)
	{
		int first=1;
		int ud;
		int ld = (x/2);
			
		if (n%2==0 && x%2==1) // e-o
			ud = (n-x)/2 + 1;
		else ud = (n-x)/2;    // e-e, e-o, o-o
		int answer = ud > ld ? ld : ud;
		return answer;
	}
}

// geeks4geeks
// 		long first=1;
// 		long ud;
// 		long ld = (X/2);
			
// 		if (N%2==0 && X%2==1) // e-o
// 			ud = (N-X)/2 + 1;
// 		else ud = (N-X)/2;    // e-e, e-o, o-o
// 		long answer = ud>ld ? ld : ud;
// 		System.out.println(answer);
