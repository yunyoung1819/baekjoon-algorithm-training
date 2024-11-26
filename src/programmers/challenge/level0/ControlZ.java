package programmers.challenge.level0;

/**
 * title: 컨트롤 제트
 * date: 2024.11.27
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */
public class ControlZ {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    private static int solution(String s) {
        String[] strArray = s.split(" ");
        int answer = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("Z") && i >= 1) {
                answer -= Integer.parseInt(strArray[i-1]);
            } else {
                answer += Integer.parseInt(strArray[i]);
            }
        }
        return answer;
    }
}
