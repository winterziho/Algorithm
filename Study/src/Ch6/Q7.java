package Ch6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
	
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point other) {
		if(this.x == other.x) return this.y - other.y;
		else return this.x - other.x;
	}
}

public class Q7 {

	public void solution(int n, ArrayList<Point>points) {

		Collections.sort(points);
		for(Point x : points) System.out.println(x.x +" "+ x.y);
		
	}

	public static void main(String[] args) {

		Q7 T = new Q7();
		ArrayList<Point> points = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			points.add(new Point(x, y));
		}
		
		
		
		T.solution(n,points);
		
	}
}