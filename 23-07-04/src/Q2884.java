import java.util.Scanner;
public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int err = M - 45;
		
		
		if(err < 0) {
			err += 60;
			H -= 1;
			if(H < 0) {
				H += 24;
			}
		}
		
		System.out.print(H);
		System.out.println(" " + err);

	}

}
