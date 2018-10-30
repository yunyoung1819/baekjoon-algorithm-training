package algorithm.graph;

/**
 * 다익스트라 알고리즘 (Dijkstra Algorithm)
 * @author yunyoung
 *
 */
public class Dijkstra {
	public static void main(String[] arg) {
		int[][] map = { {0, 10, 4, 999},
						{10, 0, 2, 2},
						{4, 2, 0, 5},
						{999, 2, 5, 0}
		};
		
		int n = 4;	// 노드의 개수 
		int[] visit = new int[n];	// 방문한 노드 목록 
		int[] minDistance = new int[n]; // 0에서 n까지 최단 경로
		int min;
		int current = 0;
		int[] path = new int[n]; // 중간경로
		
		for(int i = 0; i < n; i++) {
			visit[i] = 0; // 방문한 좌표 초기화
			minDistance[i] = 999;	// 최단거리 999로 초기화
		}
		
		minDistance[0] = 0;
		
		// 방문안한 노드 중 가장 가까운(가격이 싼) 노드 찾기
		for(int i = 0; i < n; i++) {
			min = 9999;
			
			for(int j = 0; j < n; j++) {
				if(min > minDistance[j] && visit[j] == 0) {
					min = minDistance[j];
					current = j;
				}
			}
			
			visit[current] = 1;
			
			for(int j = 0; j < n; j++) {
				if((minDistance[j] > minDistance[current] + map[current][j]) && map[current][j] != 999) {
					minDistance[j] = minDistance[current] + map[current][j];
					path[j] = current;
				} // 0~j까지 거리 > 0~현재 + 현재~j (현재를 거쳐가는게 더 빠르면) 최단 거리 수정 
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(i + "번 노드까지 최단 경로 : ");
			int j = i;
			System.out.print(j);
			
			while(j != 0) {
				System.out.print(" <- " + path[j]);
				j = path[j];
			}
			System.out.println(" ");
		}
	}
}
