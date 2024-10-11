package programmers.challenge;

/**
 * 문제제목: 배열 뒤집기
 * 작 성 일: 2024.09.15
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,5}));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            int length = num_list.length;
            answer[i] = num_list[length -1-i];
        }
        return answer;
    }
}
