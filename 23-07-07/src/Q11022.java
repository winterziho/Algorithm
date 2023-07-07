import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum = 0;
		
		for(int x = 0; x < T; x++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum = A - B;
			
			System.out.println("Case #" + x + ":" + A + B + "=" + sum);
		}

	}

}
