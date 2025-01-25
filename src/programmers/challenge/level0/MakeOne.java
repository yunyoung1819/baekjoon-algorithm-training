package programmers.challenge.level0;

/**
 * title: 1로 만들기
 * date: 2025.01.26
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181880
 * description: 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면 마지막엔 1이 됩니다.
 * 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
 * 10 / 2 = 5
 * (5-1) / 2 = 2
 * 2 / 2 = 1
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
 * 정수들이 담긴 리스트 num_list가 주어질 때 num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를
 * return 하도록 solution 함수를 완성해주세요.
 */
public class MakeOne {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            int number = num_list[i];
            int cnt = 0;

            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = (number - 1) / 2;
                }
                cnt++;
            }
            answer += cnt;
        }
        return answer;
    }
}
