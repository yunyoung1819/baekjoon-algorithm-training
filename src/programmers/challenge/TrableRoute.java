package programmers.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 문제제목: 여행경로
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/43164
 * 작 성 일 : 2020.07.08
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다.
 * 항상 "ICN" 공항에서 출발합니다.
 * 항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때,
 * 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 모든 공항은 알파벳 대문자 3글자로 이루어집니다.
 * 주어진 공항 수는 3개 이상 10,000개 이하입니다.
 * tickets의 각 행 [a,b]는 a공항에서 b공항으로 가는 항공권이 있다는 의미입니다.
 * 주어진 항공권은 모두 사용해야 합니다.
 * 만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
 * 모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.
 */
public class TrableRoute {
    static boolean visit[];
    static List<String> list = new ArrayList<>();
    static String route = "";

    public static void main(String[] args) {
        String[][] tickets = {{"ICN","SFO"}, {"ICN","ATL"}, {"SFO","ATL"}, {"ATL","ICN"},{"ATL","SFO"}};
        getTrableRoute(tickets);
    }

    private static String[] getTrableRoute(String[][] tickets) {
        visit = new boolean[tickets.length];

        for (int i = 0; i < tickets.length; i++) {
            String departure = tickets[i][0];
            String destination = tickets[i][1];

            if (departure.equals("ICN")) {
                visit[i] = true;
                route = departure + ",";
                dfs(tickets, destination, 1);
                visit[i] = false;
            }
        }

        Collections.sort(list);
        String[] answer = list.get(0).split(",");
        return answer;
    }

    private static void dfs(String[][] tickets, String end, int count) {
        route += end + ",";

        if (count == tickets.length) {
            list.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            String depart = tickets[i][0];
            String desti = tickets[i][1];

            if (end.equals(depart) && !visit[i]) {
                visit[i] = true;
                dfs(tickets, desti, count+1);
                visit[i] = false;
                route = route.substring(0, route.length()-4);
            }
        }
    }
}
