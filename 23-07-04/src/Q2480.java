import java.util.Scanner;
public class Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int max = a;
		
		if(a == b && b == c) {
			sum = 10000 + a*1000;
			
		}else if (a != b && b != c && a != c) {
			if(max < b) {
				max = b;
			}
			if(max < c) {
				max = c;
			}
			sum = max * 100;
		}
		else if(a == b) {
			sum = 1000 + a*100;
		}else if(a == c) {
			sum = 1000 + a*100;
		}else if(c == b) {
			sum = 1000 + c*100;
		}
		
		
		
		
		System.out.println(sum);
	}

}
