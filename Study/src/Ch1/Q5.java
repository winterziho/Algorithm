package Ch1;

import java.util.*;

public class Q5 {
	
	public String solution(String str) {
		
		String answer;
		char[] s = str.toCharArray();
		
			
			int lt = 0;
			int rt = str.length()-1;
			 
			while(lt < rt) {
				
				if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {
					
					char tmp = s[lt];
					s[lt] = s[rt];
					s[rt] = tmp;
				}
			lt++;
			rt--;
			}
			answer = String.valueOf(s);
		
		return answer;
	}
	
  public static void main(String[] args){
	  
	  Q5 T = new Q5();
	  
	  Scanner sc=new Scanner(System.in);
	  String str = sc.next();
	  
	  System.out.println(T.solution(str));
    
    
  }
}