package programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제
 * 투썸플레이스 OO지점에서는 사은이벤트로 매일 고객 한 명을 임의로 선정해 커피 무료 쿠폰을 발송합니다.
 * 배열 arr에는 고객들의 ID가 이벤트에 당첨된 순서대로 들어있으며, 각 고객의 ID는 자연수입니다.
 * 쿠폰에 당첨된 고객 중, 가장 빨리 중복으로 당첨된 고객은 며칠만에 중복 당첨됐는지를 return 하도록 solution 함수를 작성하세요.
 * 단, 중복으로 당첨된 고객이 없는 경우 -1을 return 하세요.
 *
 * 알고리즘: 해시맵 완전탐색
 * 시간 복잡도: O(n)
 */
public class TwoSome {
    public int solution(int[] arr) {
        // 중복이 없을 때를 대비해 배열 길이 + 1을 초기 최소 간격으로 설정
        int minDays = arr.length + 1;
        // 친구 ID -> 마지막 당첨 인덱스 (날짜)
        Map<Integer, Integer> lastWin = new HashMap<>();

        // 배열을 처음부터 끝까지 한 번만 순회
        for (int today = 0; today < arr.length; today++) {
            int id = arr[today]; // 오늘 당첨된 친구 ID

            // 이전에 당첨된 적이 있으면
            if (lastWin.containsKey(id)) {
                int prevDay = lastWin.get(id); // 직전 당첨일
                int interval = today - prevDay; // 오늘과의 날 차이
                // 더 짧은 간격이면 갱신
                if (interval < minDays) {
                    minDays = interval;
                }
            }

            // 처음 당첨이든 중복이든 오늘을 마지막 당첨일로 기록
            lastWin.put(id, today);
        }

        // 중복 당첨이 한번도 없으면 -1, 아니면 최소 일수 반환
        return (minDays == arr.length + 1) ? -1 : minDays;
    }
}
