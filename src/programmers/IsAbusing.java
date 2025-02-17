package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 어떤 알고리즘을 써야할까?
 * 슬라이딩 윈도우 기법 (Sliding Window)
 *
 * 슬라이딩 윈도우
 * 현재 시점에서 과거 일정 시간(1분) 동안의 데이터를 유지하면서 처리하는 알고리즘
 * 불필요한 데이터를 계속 버리면서 메모리 사용을 최적화할 수 있음
 * 여기서는 각 IP별로 최근 1분동안 요청한 타임스탬프를 저장하고 오래된 데이터를 삭제하는 방식으로 동작
 *
 * 시간 복잡도: O(N)
 * 총 N개의 요청이 들어온다면 N번 반복해서 O(1) 연산을 수행하므로 총 시간 복잡도는 O(N)
 */
public class IsAbusing {

    // 요청 기록을 저장하는 해시맵 (IP별 요청 타임스탬프 저장)
    private static final Map<String, Queue<Integer>> requestLog = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null && !line.equals("END")) {
            inputs.add(line);
        }

        for (String input : inputs) {
            int abusingFlag = isAbusing(input);
            System.out.println(abusingFlag); // 0: 정상 요청, 1: 어뷰징 차단
        }
    }

    /**
     * 입력된 HTTP 요청이 어뷰징인지 판별하는 함수
     * @param input: "타임스탬프, URL, IP" 형식 문자열
     * @return 0(정상 요청) 또는 1(어뷰징 요청)
     */
    public static int isAbusing(String input) {
        // 1. 입력 문자열을 타임스탬프, URL, IP로 분리
        // 시간 복잡도 O(1)
        String[] parts = input.split(",");
        int timestamp = Integer.parseInt(parts[0]);
        String ip = parts[2];   // 클라이언트 IP

        // 2. IP별 요청 타임스탬프 기록을 관리하는 큐 (FIFO 방식)
        requestLog.putIfAbsent(ip, new LinkedList<>());
        Queue<Integer> timestamps = requestLog.get(ip);  // O(1)

        // 3. 큐에서 1분 (60초) 이전의 오래된 요청 제거
        // 최대 O(10)
        while (!timestamps.isEmpty() && timestamps.peek() <= timestamp - 60) {
            timestamps.poll();
        }

        // 4. 현재 요청 추가 후 요청 횟수 확인
        timestamps.add(timestamp);

        // 5. 1분동안 10번 이상 요청했다면 어뷰징 (1) 리턴
        if (timestamps.size() > 10) {
            return 1; // 차단
        }

        return 0; // 정상 요청
    }
}
