package programmers.challenge.level0;

/**
 * title: 접미사인지 확인하기
 * date: 2024.12.24
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181908
 */
public class Suffix {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }

    private static int solution(String my_string, String is_suffix) {
        int suffixLength = is_suffix.length();
        int myStringLength = my_string.length();

        if (suffixLength > myStringLength) {
            return 0;
        }

        String endOfString = my_string.substring(myStringLength - suffixLength);
        return endOfString.equals(is_suffix) ? 1 : 0;
    }
}
