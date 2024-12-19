package programmers.challenge.level0;

/**
 * title: 글자 이어 붙여 문자열 만들기
 * date: 2024.12.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */
public class Solution181915 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        String answer = solve(my_string, index_list);
        System.out.println(answer);
    }

    private static String solve(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();

        for (int index : index_list) {
            result.append(my_string.charAt(index));
        }

        return result.toString();
    }
}
