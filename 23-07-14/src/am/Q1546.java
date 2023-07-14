package am;
import java.util.*;
public class Q1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double sum = 0;
		double M = arr[0];
		double div = 0;
		for(int i = 0; i < N; i++) {
			double x = sc.nextInt();
			arr[i] = x;
			if(M < arr[i]) {
				M = arr[i];
			}
		}
		for(int i = 0; i < N; i++) {
				div = arr[i]/M * 100;
				sum += div;
			}
		
		System.out.println(sum/N);
	}

}
