package programmers.algorithm_solving.recursive;

/**
 * 이진트리 순회 (DFS: Depth-First Search) 구현
 */
class Node {
	int data; // 1 2 3 4 5 6 7
	Node lt, rt;

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class DFS {
	Node root;
	public void DFS(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt);
		}
	}

	public static void main(String[] args) {
		DFS tree = new DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
