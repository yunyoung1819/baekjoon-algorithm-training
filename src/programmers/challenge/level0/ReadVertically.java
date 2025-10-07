package programmers.challenge.level0;

/**
 * title: 세로 읽기
 * date: 2025.10.07
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181904
 * description:
 * 문자열 my_string과 두 정수 m, c가 주어집니다.
 * my_string을 한 줄에 m 글자씩 가로로 적었을 때
 * 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해주세요.
 */
public class ReadVertically {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1,1));
    }

    private static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i += m) {
            String substring = my_string.substring(i, i + m);
            sb.append(substring.charAt(c - 1));
        }

        return sb.toString();
    }
}
