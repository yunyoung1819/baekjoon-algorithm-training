package algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 너비 우선 탐색 (BFS) 
 * @author yunyoung
 *
 */
public class BreadthFirsgtSearch {

	// 정점의 개수
	static int V = 5;
	
	// 발견한 정점을 표시하는 배열
    static int[] discovered = new int[V];
    
    // 인접 리스트
    static ArrayList<Integer>[] adjList = new ArrayList[V];
    
    // 발견 정점 큐
    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    
    public static void main(String[] args) {
    	
    	adjList[0] = new ArrayList<>();
    	adjList[0].add(1);
    	adjList[0].add(2);
    	
    	adjList[1] = new ArrayList<>();
    	adjList[1].add(0);
    	adjList[1].add(2);
    	
    	adjList[2] = new ArrayList<>();
    	adjList[2].add(0);
    	adjList[2].add(1);
    	adjList[2].add(3);
    	adjList[2].add(4);
    	
    	adjList[3] = new ArrayList<>();
    	adjList[3].add(2);
    	
    	adjList[4] = new ArrayList<>();
    	adjList[4].add(2);
    	
    	bfs();
    }
    
    public static void bfs() {
    	
    	int node;
    	
    	// 큐에 시작지점 추가 및 발견 표시
    	queue.add(0);
    	discovered[0] = 1;
    	
    	while(queue.size() > 0) {
    		// 큐에 방문할 정점을 poll
    		node = queue.pollFirst();
    		
    		System.out.println(node + 1);
    		
    		if(adjList[node] != null) {
    			// 인접 정점들을 발견
    		    for(int adjacent : adjList[node]) {
    		    	// 이미 발견된 정점이 아니라면
    		    	if(discovered[adjacent] == 0) {
    		    		// 큐에 추가 및 발견 표시  
    		    		queue.add(adjacent);
    		    		discovered[adjacent] = 1;
    		    	}
    		    }
    		}
    	}
    }
}
