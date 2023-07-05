import java.util.Scanner;
public class Q2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum;
		
		for(int i = 1; i <= 9; i ++) {
			sum = n * i;
			System.out.println(n + " * " + i + " = " + sum);
		}

	}

}
