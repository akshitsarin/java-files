// find next greater element ('_' if largest encountered)
import java.util.Scanner;
import java.util.Arrays;

class smallestGreater
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), size;
        while (t-->0)
        {
            size = sc.nextInt();
            int arr[] = new int[size];
            for (int i=0; i<size; i++)
                arr[i] = sc.nextInt();
            
            int orig[] = arr.clone();
            Arrays.sort(arr);
            
            for (int j=0; j<size; j++)
                for (int i=0; i<size; i++)
                {
                    if (orig[j] == arr[i] && arr[i] == arr[size-1])
                    {
                        System.out.print("_" + " ");
                        break;
                    }    
                    if (orig[j]== arr[i] && arr[i] != arr[i+1])
                        System.out.print(arr[i+1] + " ");
                }
            System.out.println();    
        }
    }
}
