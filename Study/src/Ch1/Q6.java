package Ch1;

import java.util.*;

public class Q6 {
	
	public String solution(String str) {
		
		String answer = "";
		
		for(int i = 0; i < str.length(); i ++) {
			
			if(str.indexOf(str.charAt(i)) == i) answer+= str.charAt(i);
			
		}
		return answer;
	}
	
  public static void main(String[] args){
	  
	  Q6 T = new Q6();
	  
	  Scanner sc=new Scanner(System.in);
	  String str = sc.next();
	  
	  System.out.println(T.solution(str));
    
    
  }
}