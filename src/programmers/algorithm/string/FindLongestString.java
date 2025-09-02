package programmers.algorithm.string;

/**
 * 문제제목: 특정 문자열로 끝나는 가장 긴 문자열 찾기
 * 작 성 일: 2025.09.02
 * 작 성 자: Yun Young
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */
public class FindLongestString {
    public static void main(String[] args) {
        String myString = "AAAAaaaa";
        String pat = "a";
        String answer = solution(myString, pat);
        System.out.println(answer);
    }

    private static String solution(String myString, String pat) {
        int lastOccurrencePosition = myString.lastIndexOf(pat);
        String subStr = myString.substring(0, lastOccurrencePosition  + pat.length());
        return subStr;
    }
}
