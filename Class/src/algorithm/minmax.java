package algorithm;
import java.util.*;
public class minmax {

	public static void main(String[] args) {
		
		int[] arr = {12, 13, 11, 14, 10};
		
		int i = 0;
		while(i < arr.length) {
			
			int tmin = i;
			int k = i + 1;
			
			while(k < arr.length) {
				if(arr[tmin]> arr[k]) {
					tmin = k;
				}
				k = k + 1;
			}
			
			int temp = arr[tmin];
			arr[tmin] = arr[i];
			arr[i] = temp;
			i = i + 1;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
