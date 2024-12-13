package programmers.challenge.level0;

/**
 * title: 문자열 뒤의 n글자
 * date: 2024.12.13
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181910
 * description: 문자열 my_string 과 정수 n이 매개변수로 주어질 때,
 * my_string 뒤의 n 글자로 이루어진 문자열을 return 하는 solution 함수를 완성해주세요.
 */
public class Solution181910 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        Solution181910 solution = new Solution181910();
        System.out.println(solution.sol(my_string, n));
    }

    private String sol(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        int startIndex = my_string.length() - n;

        for (int i = startIndex; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
