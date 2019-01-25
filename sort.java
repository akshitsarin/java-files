// implement selection, insertion, bubble sort and find their time of executions
// sizes : 10, 100, 1000... upto 10^7
import java.util.Random;
import java.util.Scanner;

class sort{
	public static double selectionSort(int arr[], int size){
		int min, min_index = 0;
		int temp;
		double st, ft;
		st = System.nanoTime();
		for (int i=0; i<size-1; i++){
			min = arr[i];
			for (int j=i+1; j<size; j++)
				if (arr[j]<min){
					min = arr[j];
					min_index = j;
				}
			if (arr[i]!=min){
				arr[i]+=arr[min_index];
				arr[min_index]=arr[i]-arr[min_index];
				arr[i]-=arr[min_index];
			}
		}
		ft = System.nanoTime();
		return (ft-st);
	}

	public static double bubbleSort(int arr[], int size){
		double st = System.nanoTime();
		for (int i=0; i<size; i++)
			for(int j=0; j<size-i-1; j++)
				if (arr[j]>arr[j+1]){
					arr[j]+=arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]-=arr[j+1];
				}
		double ft = System.nanoTime();
		return (ft-st);
	}

	public static double insertionSort(int arr[], int size){
		int key, j;
		double st = System.nanoTime();
		for (int i=1; i<size; i++){
			key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		double ft = System.nanoTime();
		return (ft-st);

	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input in the order : 'size' "
						+ "'type[selection-s, insertion-i, bubble-b]' " 
						+ "'case[best-b, avg-a, worst-w'");
		int size = sc.nextInt(); 
		int arr[] = new int[size];
		char type = sc.next().charAt(0);
		char order = sc.next().charAt(0);

		switch(order){
			case 'a':
				Random rand = new Random();
				for (int i=0; i<size; i++)	arr[i] = rand.nextInt(size);
				break;
			case 'b':
				for (int i=0; i<size; i++)	arr[i] = i;
				break;
			case 'w':
				for (int i=0; i<size; i++)	arr[i] = size-i; 
				break;
		}
		double time = 0;
		switch(type){
			case 'b':
				time = bubbleSort(arr, size);
				break;
			case 'i':
				time = insertionSort(arr, size);
				break;
			case 's':
				time = selectionSort(arr, size);
				break;				
		}
		System.out.println(time);
	}
}