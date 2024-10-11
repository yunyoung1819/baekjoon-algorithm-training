package programmers.challenge.level0;

/**
 * 문제제목 : 음양 더하기
 * 작 성 일 : 2022.01.29
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은
 * 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * absolutes의 길이는 1이상 1,000 이하입니다.
 * absolutes의 모든 수는 각각 1이상 1,000 이하입니다.
 * signs의 길이는 absolutes의 길이와 같습니다.
 * signs[i]가 참이면 absolutes[i]의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 */
public class AddingYingYang {
    public static void main(String[] args) {
        boolean[] signs = {true, false, true};
        int[] absolutes = {4,7,12};

        System.out.println(solution(absolutes, signs));
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            boolean sign = signs[i];
            answer += sign ? absolutes[i] : (absolutes[i] * -1);
        }
        return answer;
    }
}
