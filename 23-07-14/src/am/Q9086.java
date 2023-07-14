package am;
import java.util.*;
public class Q9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int i = 0; i < T; i++) {
			String[] arr = sc.next().split("");
			
			String res = arr[0] + arr[arr.length-1];
			System.out.println(res);
		}

	}

}
