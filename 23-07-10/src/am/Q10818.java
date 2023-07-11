package am;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[N - 1];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
		}
		}
		
		System.out.print(min);
		System.out.print(" " + max);
		sc.close();
		
	}

}
