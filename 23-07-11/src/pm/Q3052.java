package pm;
import java.util.*;
public class Q3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[42];
		
		for(int i = 0; i < 10; i++) {
			arr[sc.nextInt() % 42] = true;
		}
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
