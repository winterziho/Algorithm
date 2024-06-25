package test;

import java.util.*;

public class test {
	
	public int solution(String str) {
		
		StringBuilder answer = new StringBuilder();
		str=str.replaceAll("[^0-9]", "");
		
		char[] s = str.toCharArray();
		if(s[0] == '0') {
			for(int i = 1; i<str.length(); i++) {
				answer.append(s[i]);
			}
		}
		else answer.append(str);
		
		
		
		return Integer.parseInt(answer.toString());
	}
	
  public static void main(String[] args){
	  
	  test T = new test();
	  
	  Scanner sc=new Scanner(System.in);
	  String str = sc.nextLine();
	  
	  System.out.println(T.solution(str));
    
    
  }
}