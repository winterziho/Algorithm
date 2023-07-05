import java.util.Scanner;
public class Q25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N; i += 4) {
			System.out.print("long ");
		}
		System.out.println("int");
	}

}
