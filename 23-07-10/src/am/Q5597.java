package am;
import java.util.*;
public class Q5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[31];
		for(int i = 0; i < 28; i++) {
			int input = sc.nextInt();
			n[input] = 1;
			
			}
			
		for(int i = 1; i < n.length; i++) {
			if(n[i] !=1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
