package algorithm;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[101];
		Arrays.fill(arr, 1);
	
		
		
		for(int k = 2; k * k <= 100; k++) {
			if(arr[k] == 1) {
				for(int i = 2; i <= arr.length/k; i++){
					arr[i*k] = 0;
				}
				
			}
			
		} 
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == 1) {
				System.out.print(i + " ");
			}		
		}
}
}
		

