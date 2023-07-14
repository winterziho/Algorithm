package pm;
import java.util.*;

public class Q10811 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int[] arr = new int[N];
	
	int M = sc.nextInt();
	
	for (int i = 0; i < N; i++) {
		arr[i] = i + 1;
	}
	for(int x = 0; x < M; x++) {
		int i = sc.nextInt();
		int j = sc.nextInt();
		while(i < j) {
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
			i++;
			j--;
		}	
	}
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}
}