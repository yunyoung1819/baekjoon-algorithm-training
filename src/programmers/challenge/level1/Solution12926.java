package programmers.challenge.level1;

/**
 * title: 시저 암호
 * date: 2025.04.25
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12926
 * description: 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해보세요.
 */
public class Solution12926 {
    public static void main(String[] args) {
        String s = "Z";
        int n = 7;
        System.out.println(solution(s, n));
    }

    private static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            push(n, c, sb);
        }
        return sb.toString();
    }

    private static void push(int n, char c, StringBuilder sb) {
        if (!Character.isAlphabetic(c)) {
            sb.append(c);
        } else {
            if (c >= 'A' && c <= 'Z') {
                char moved = (char) (c + n);
                if (moved > 'Z') {
                    moved -= 26;
                }
                sb.append(moved);
            } else {
                char moved = (char) (c + n);
                if (moved > 'z') {
                    moved -= 26;
                }
                sb.append(moved);
            }
        }
    }
}