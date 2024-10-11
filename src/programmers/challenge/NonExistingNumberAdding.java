package programmers.challenge;

import java.util.ArrayList;

/**
 * 문제제목: 없는 숫자 더하기
 * 작 성 일: 2022.01.29
 * 작 성 자: YUN YOUNG
 * 문제설명: 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return하도록 solution 함수를 완성해주세요.
 */
public class NonExistingNumberAdding {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        solution(numbers);
    }

    public static int solution(int[] numbers) {
        var answer = 0;
        var numbersList = new ArrayList<Integer>();

        for (var number : numbers) {
            numbersList.add(number);
        }

        for (int i = 0; i <= 9; i++) {
            if (!numbersList.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}
