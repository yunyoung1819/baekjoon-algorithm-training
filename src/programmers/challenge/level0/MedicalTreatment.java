package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 문제제목: 진료 순서 정하기
 * 작 성 일: 2025.09.19
 * 작 성 자: yun young
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120835
 * 문제설명: 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때
 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return 하도록 solution 함수를 완성해주세요.
 */
public class MedicalTreatment {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        int[] result = solution(emergency);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int bigger = 0;
            for (int j = 0; j < n; j++) {
                if (emergency[j] > emergency[i]) {
                    bigger++;
                }
            }
            answer[i] = bigger + 1;
        }
        return answer;
    }
}
