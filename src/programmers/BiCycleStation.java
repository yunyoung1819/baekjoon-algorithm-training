package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제
 * 1. 마을에 0번부터 n-1번까지 번호가 붙은 자전거 보관소가 있음
 * 2. 보관소들 사이에는 몇 분 걸리는 자전거 길(도로)이 양방향으로 이어져 있고, 아직 모든 곳이 연결된 건 아님
 * 3. 여러분은 0번 보관소에서 자전거를 빌려서 딱 k분간 쉬지 않고 페달을 밟다가, 그 순간에 어느 보관소에 정확히 도착할 수 있는지 찾으려고 함
 * 4. 중간에 길 한가운데서 멈추거나 되돌아갈 수는 없고, 길 위에선 계속 달려야함. 하지만 같은 길을 여러 번 왔다갔다 할 순 있어요.
 * 5. 도착 가능한 보관소 번호를 작은 수부터 순서대로 모아 리턴하고, 전혀 못가는 곳이 없다면 [-1]을 리턴해요.
 *
 */
public class BiCycleStation {
    private static final int NO_STATION = -1;
    public int[] solution(int stationCount, int k, int[][] roads) {
        // 그래프 (인접 리스트) 생성
        List<List<Edge>> graph = buildGraph(stationCount, roads);

        // dp[time][node]: time분 후 node 도착 가능 여부
        boolean[][] dp = new boolean[k+1][stationCount];
        dp[0][0] = true; // 0분 뒤엔 0번에 있다

        // 시간(time) 순서대로 dp 채우기
        for (int time = 1; time <= k; time++) {
            // 각 보관소(node)를 살펴보고
            for (int node = 0; node <stationCount; node++) {
                // node와 연결된 모든 길(edge)를 확인
                for (Edge egde : graph.get(node)) {
                    int prevTime = time - egde.time; // 이 길을 타기 전 시각
                    // 그 시각에 edge.to(이웃 보관소)에 도착해 있을 수 있다면
                    if (prevTime >= 0 && dp[prevTime][egde.to]) {
                        dp[time][node] = true;  // time 분 후 node 도착 가능
                        break;  // 더 볼필요 없이 다음 node로
                    }
                }
            }
        }

        // k분 후 도착 가능한 보관소 모으기
        List<Integer> answerList = new ArrayList<>();
        for (int node = 0; node < stationCount; node++) {
            if (dp[k][node]) {
                answerList.add(node);
            }
        }

        // 아무도 없으면 [-1]
        if (answerList.isEmpty()) {
            return new int[] {NO_STATION};
        }

        // 아니면 오름차순 정렬된 배열로 반환
        return answerList.stream().mapToInt(i -> i).toArray();
    }

    // 그래프를 List<List<Edge>> 형태로 만드는 헬퍼 메서드
    private List<List<Edge>> buildGraph(int n, int[][] roads) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int a = road[0], b = road[1], t = road[2];
            // 양방향 간선 추가
            graph.get(a).add(new Edge(b, t));
            graph.get(b).add(new Edge(a, t));
        }
        return graph;
    }

    private static class Edge {
        final int to;    // 연결된 보관소 번호
        final int time;  // 그 길을 지나는 데 걸리는 시간(분)

        Edge(int to, int time) {
            this.to = to;
            this.time = time;
        }
    }

}
