package programmers.challenge.level0;

public class FindNumber {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        System.out.println(solution(num, k));
    }

    private static int solution(int num, int k) {

        char[] charArray = String.valueOf(num).toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int target = Integer.parseInt(String.valueOf(charArray[i]));
            if (k == target) {
                return i + 1;
            }
        }
        return -1;
    }
}
