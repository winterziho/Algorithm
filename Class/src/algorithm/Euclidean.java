package algorithm;
import java.util.*;
public class Euclidean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.println("b를 입력하세요 : ");
		int y = sc.nextInt();
		int max = x;
		int min = y;
		
		int r = 0;
		
		if(max < y) {
			max = y;
			min = x;
		}
		do {
			r = max % min;
			if(r != 0) {
				max = min;
				min = r;
				
				}
			}
		while(r != 0); 
		System.out.println("최대 공약수는 : " + min);
	}
}
