
public class Quiz2 {

	public static void main(String[] args) {
		int[] arrH = {42, 12, 0, 25, 36, 0, 0, 0, 30, 20, 8};
		
		
		int x = 12;
		
		int k = x % 11;
		
		while (arrH[k] != 0) {
			if(arrH[k] == x) {
				System.out.println();
				break;
			}else {
				k =(k + 1) %11;
			}
		}
		System.out.println("값이 존재하지 않습니다.");
		
	}

}