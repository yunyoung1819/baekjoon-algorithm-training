package programmers.challenge.level0;

/**
 * 특정한 문자를 대문자로 바꾸기
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/181873
 *
 * 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때
 * my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는
 * solution 함수를 작성해주세요.
 *
 */
public class CapitalLetters {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        solution(my_string, alp);
    }

    private static String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            return my_string.replace(alp, alp.toUpperCase());
        } else {
            return my_string;
        }
    }
}
