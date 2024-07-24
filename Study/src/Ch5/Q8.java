package Ch5;

import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Q8 {

	public int solution(int n, int m, int[] d) {

		int answer = 1;
		Queue<Person> Q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			Q.add(new Person(i, d[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority>tmp.priority) {
					Q.add(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;

	}

	public static void main(String[] args) {

		Q8 T = new Q8();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] d = new int[n];
		for(int i = 0; i < n; i ++) {
			d[i] = sc.nextInt();
		}
		

		T.solution(n, m, d);

	}
}