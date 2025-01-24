package programmers.challenge.level0;

/**
 * title: I로 만들기
 * date: 2025.01.24
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181834
 */
public class Makel {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }

    private static String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = myString.toCharArray();

        for (char c : charArray) {
            if (c < 'l') {
                sb.append('l');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
