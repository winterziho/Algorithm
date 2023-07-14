package algorithm;
import java.util.*;
public class Bubble {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 2, 4, 5};
		int k = 0;
		int temp;
		
		while(k < 4) {
			
			int i = arr.length;
			
			for(i = 4;i > k; i--) {
				if(!(arr[i - 1] < arr[i])) {
					temp = arr[i-1];
					arr[i -1] = arr[i];
					arr[i] = temp;
				}
			}k++;
		} 
		System.out.println(Arrays.toString(arr));
	}

}
