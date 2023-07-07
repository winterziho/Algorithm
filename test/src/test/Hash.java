package test;
import java.util.Scanner;

import java.util.Arrays;

public class Hash {

	public static void main(String[] args) {
		int[] D = input();
		int[] H = save(D);
		int k = search(H);
		System.out.println(Arrays.toString(H));
		
		if(k > -1) {
		System.out.println( (k+1) + " 번 째에 있습니다.");
		}else {
			System.out.println("없음");
		}
	}
	public static int[] save(int[] D) {
		
		
		int[] H = new int[11];
		for(int i = 0; i < D.length; i ++) {
			
			int k = D[i] % (D.length * 2);
			
			while(H[k] != 0) {
				k = (k + 1) % (D.length * 2);
				}
			H[k] = D[i];
			}
		return H; 
		}
	
	public static int search(int[] H) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int k = num % H.length;
		
		while(H[k] != 0) {
			if(H[k] == num) {
				
				return k;
			}
			k = (k + 1) % H.length;
		}	
		return -1;
	}
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 갯수를 입력하세요 : ");
		int arrNum = sc.nextInt();
		
		int[] arrx = new int[arrNum];
		for(int i= 0; i < arrx.length; i++) {
		System.out.println( i + " 번 째 요소를 입력하세요 : ");
		arrx[i] = sc.nextInt();
		}
		
		return arrx;
	}
	}

