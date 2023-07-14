package pm;
import java.util.*;
public class Q11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String[] N = new String [x];
		N = sc.next().split("");
		int[] arr = new int[N.length];
		int sum = 0;
		
		for(int i = 0; i < N.length; i++) {
			
		arr[i] = Integer.parseInt(N[i]);
		sum += arr[i];
		}
		System.out.println(sum);
	}

}
