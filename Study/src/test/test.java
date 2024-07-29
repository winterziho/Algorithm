package test;

import java.util.*;

public class test {

	public int distance(int[] arr, int mid) {

		int cnt = 1;
		int ep = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}

	public void solution(int n, int c, int[] arr) {

		int answer = 0;

		Arrays.sort(arr);

		int rt = arr[n - 1];
		int lt = 1;

		while (lt <= rt) {
			int mid = (rt + lt) / 2;
			if (distance(arr, mid) >= c) {

				answer = mid;
				lt = mid + 1;

			} else
				rt = mid - 1;
		}

		System.out.println(answer);

	}

	public static void main(String[] args) {

		test T = new test();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		T.solution(n, c, arr);
	}
}