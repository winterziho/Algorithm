import java.util.*;

public class ExamScann {


	public static void main(String[] args) {
		
	
		
		int[] num = scann();
		
		int x = minn(num);
		System.out.println(x);
		
		
		
		}
	public static int[] scann(){
		Scanner scan = new Scanner(System.in);
		
		
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i ++) {
			System.out.println(i + "번 째 숫자를 입력하세요 : ");
			num[i] = scan.nextInt();
			
	}
		return num;
		
}
	public static int minn(int[] num) {
		int min = num[0];
		for(int i = 0; i < 3; i ++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		return min;
	}
		
	}
