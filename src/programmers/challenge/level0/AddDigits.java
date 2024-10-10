package programmers.challenge.level0;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }

    private static int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            answer += c - '0';
        }
        return answer;
    }
}
