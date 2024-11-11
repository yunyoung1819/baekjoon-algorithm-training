package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * title: Task2
 * date: 2024.11.11
 * author: yun young
 * description
 * 당신은 비행기 좌석 예약을 처리하고 있다. 비행기에는 1부터 N까지 번호가 매겨진 좌석이 N줄 있다.
 * 아래 그림과 같이 각 줄에는 좌석이 열(10)석 있다. (글자 I를 제외하고 A부터 K까지 레이블이 지정됨)
 *
 * 일부 좌석은 이미 예약되어 있다.
 * 예약 좌석 목록은 "1A 3C 2B 20G 5A"와 같이 한 개의 공백으로 구분된 좌석번호를 포함하는 문자열 S(길이 M)으로 주어진다.
 * S에 나열된 예약 좌석의 순서는 임의적이다.
 *
 * 최대한 많은 4인 가족에게 좌석을 배정하시오. 4인 가족은 한 줄에서 서로 인접한 네 좌석을 사용하며,
 * 통로를 사이에 둔 좌석들(예: 2C와 2D)은 서로 인접한 것으로 간주하지 않는다.
 * 통로를 사이에 두고 가족을 분리할 수 있지만 이 경우에는 반드시 두 사람이 통로 양쪽에 앉아야 한다.
 * 어떤 좌석도 한 가족 이상에서 배정할 수 없다.
 *
 * 함수를 작성하시오.
 *
 * Class Solution { public int solution(int N, String S); }
 *
 * 줄 개수 N과 예약 좌석 목록 S가 주어졌을 때, 남은 미예약 좌석에 앉을 수 있는 4인 가족의 최대 수를 반환해야 한다.
 * 예를 들어 N=2, S=“1A 2F 1C”일때 함수는 2를 반환해야 한다. 다음 그림은 남은 좌석에 두 가족을 앉히는 방법 중 한가지를 나타낸다.
 *
 * N = 1, S = “”(빈 문자열) 일떄는 아래 그림과 같이 한 줄의 좌석에 최대 두 가족을 앉힐 수 있으므로 함수는 2를 반환해야 한다.
 *
 * N=22, S=“1A 3C 2B 20G 5A”일 때 함수는 41을 반환해야 한다.
 *
 * 문제 풀이 접근
 * 1. 좌석 예약 상태 파악: 예약된 좌석이 문자열 S로 주어진다. 이를 통해 각 줄에서 예약된 좌석을 표시할 수 있다.
 * 2. 가능한 가족 배치: 각 줄에서 인접한 네 좌석(A-B-C-D, E-F-G-H, H-I-J-K) 중 예약되지 않은 좌석을 찾아 4인 가족이 앉을 수 있는 경우를 확인한다.
 * 3. 최대 2가족 배치 가능: 각 줄마다 최대 두 가족이 배치될 수 있다.
 */
public class Task2 {

    /**
     * TODO
     * 1. 예약 좌석 처리
     * 주어진 예약 좌석 문자열 S를 공백을 기준으로 분리하여 Set<String>에 저장한다. 이렇게 하면 특정 좌석이 예약되었는지 여부를 빠르게 확인할 수 있다.
     *
     * 2. 가족 배치 가능한 블록 확인
     * 각 줄마다 4인 가족이 앉을 수 있는 3가지 블록(좌측, 우측, 중간)을 확인한다.
     * 왼쪽 블록: B,C,D,E 가 예약되지 않은 경우
     * 중간 블록: D,E,F,G 가 예약되지 않은 경우
     * 오른쪽 블록: F,G,H,J가 예약되지 않은 경우
     *
     * 3. 가족 배치 수 계산
     * 한 줄에서 왼쪽 블록과 오른쪽 블록이 모두 비어있으면 두 가족이 배치 가능
     * 그렇지 않다면 한 줄에 하나의 가족만 배치할 수 있음
     *
     * 4. 최종 결과 반환
     * familyCount에는 각 줄에서 배치할 수 있는 최대 가족 수의 합이 저장됨
     */
    public int solution(int N, String S) {
        // 예약 좌석 목록을 Set에 저장
        Set<String> reservedSeats = new HashSet<>();
        if (S != null && !S.isEmpty()) {
            String[] reservations = S.split(" ");
            for (String seat : reservations) {
                reservedSeats.add(seat);
            }
        }

        int familyCount = 0;

        // 각 줄에 대해 가능한 가족 배치 확인
        for (int row = 1; row <= N; row++) {
            boolean leftBlock = !reservedSeats.contains(row + "B")
                    && !reservedSeats.contains(row + "C")
                    && !reservedSeats.contains(row + "D")
                    && !reservedSeats.contains(row + "E");

            boolean middleBlock = !reservedSeats.contains(row + "D")
                    && !reservedSeats.contains(row + "E")
                    && !reservedSeats.contains(row + "F")
                    && !reservedSeats.contains(row + "G");

            boolean rightBlock = !reservedSeats.contains(row + "F")
                    && !reservedSeats.contains(row + "G")
                    && !reservedSeats.contains(row + "H")
                    && !reservedSeats.contains(row + "J");

            // 한 줄에서 최대 두 가족까지 배치 가능
            if (leftBlock && rightBlock) {
                familyCount += 2;
            } else if (leftBlock || middleBlock || rightBlock) {
                familyCount += 1;
            }
        }
        return familyCount;
    }
}
