package Ch1;

import java.util.Scanner;

public class Q8 {
	
	public String solution(String str) {
		
		String answer="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) answer="Yes";
		
		return answer;
	}
	
  public static void main(String[] args){
	  
	  Q8 T = new Q8();
	  
	  Scanner sc=new Scanner(System.in);
	  String str = sc.nextLine();
	  
	  System.out.println(T.solution(str));
    
    
  }
}