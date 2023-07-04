import java.util.Scanner;

public class Q2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = B + C;
		if(sum >= 60) {
			int count = sum / 60 ;
			A += count;
			sum -= count * 60;
			if(A >= 24) {
				A -= 24;
			}
		}
		System.out.print(A);
		System.out.print(" "+ sum);
	}

}
