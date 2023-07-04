
public class ex1 {
	public static void searcherr(){
		System.out.println("찾지 못했습니다.");
	}

	public static void main(String[] args) {
		
		int[] arr = {11, 13, 17, 19, 20, 21, 23};
		
		int head = 0;
		int tail = 6;
		int center;
		
		while(head <= tail) {
			center = (head + tail)/2;
			
			if(arr[center] == 25) {
				System.out.println(center + "번째 요소에 있습니다.");
				break;
			}
			
			if(arr[center] < 17) {
				head = center + 1;
			}else {
					tail = center -1;
			}
			if(head > tail) {
				searcherr();
				break;
			}
			 
		}
	}
}


