package algorithm;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
			if(arr[i] % 2 != 0 && arr[i] % 3 != 0&&arr[i] % 5 != 0 && arr[i] % 7 != 0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
