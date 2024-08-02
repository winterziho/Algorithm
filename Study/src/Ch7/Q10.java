package Ch7;

import java.util.*;

//class Node{
//	int data;
//	Node lt, rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}

public class Q10 {

	Node root;

	public int BFS(int L, Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {

				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null)
					return L;
				if (cur.lt != null)
					Q.offer(cur.lt);
				if (cur.rt != null)
					Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}

	public static void main(String args[]) {
		Q10 tree = new Q10();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(0, tree.root));
	}

}
