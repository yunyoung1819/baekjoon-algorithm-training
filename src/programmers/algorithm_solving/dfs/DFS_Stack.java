package programmers.algorithm_solving.dfs;

import java.util.Stack;

public class DFS_Stack {
	
	// 방문 처리에 사용할 배열 선언
	static boolean[] visited = new boolean[9];
	
	// 그래프의 연결 상태를 2차원 배열로 표현
	// 인덱스가 각각의 노드 번호가 될 수 있게 0번 인덱스는 아무것도 없는 상태
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

	// DFS 사용 스택
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		// 시작 노드를 스택에 넣어준다.
		stack.push(1);
		
		// 시작 노드 방문 처리
		visited[1] = true;
		
		// 스택이 비어있지 않으면 계속 반복
		while (!stack.isEmpty()) {
			// 스택에서 하나를 꺼냄
			int nodeIndex = stack.pop();
			
			// 방문 노드 출력
			System.out.print(nodeIndex + " -> ");
			
			// 꺼낸 노드와 인접한 노드 찾기
			for (int LinkedNode : graph[nodeIndex]) {
				// 인접한 노드를 방문하지 않았을 경우에 스택에 넣고 방문 처리
				if (!visited[LinkedNode]) {
					stack.push(LinkedNode);
					visited[LinkedNode] = true;
				}
			}
		}
	}
}
