package Ch1;

import java.util.*;

public class Q7_1 {
	
	public String solution(String str) {
		
		String answer="YES";
		str=str.toUpperCase();
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(len-1-i)) return"NO";
		}
		return answer;
	}
	
  public static void main(String[] args){
	  
	  Q7_1 T = new Q7_1();
	  
	  Scanner sc=new Scanner(System.in);
	  String str = sc.next();
	  
	  System.out.println(T.solution(str));
    
    
  }
}