package am;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[31];
		
		for(int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			arr[n] = true;
		}
		for(int i = 1; i < 31; i++) {
			if(arr[i]!= true) {
				System.out.println(i);
			}
		}

	}

}
