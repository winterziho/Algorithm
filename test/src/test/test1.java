package test;


public class test1 {

	public static void main(String[] args) {
		
		int[] H = {0, 1, 2, 3, 4, 5, 17};
		int head = 0;
		int tail = 6;
		int result = 0;
		
		while(head <= tail) {
			
			int center = (head + tail)/2;
			
			if(H[center] == 17) {
				result = center;
				break;
			}else if(H[center] < 17) {
				head = center + 1;
			}else {
				tail = center -1;
			}
			result = -1;
		}
		if(result > -1) System.out.println(result + "번째 요소에 있습니다.");
		else {
			System.out.println("찾지 못했습니다.");
		}
		

	}

}
