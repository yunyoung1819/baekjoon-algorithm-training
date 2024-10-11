package programmers.challenge.level0;

public class Game369 {
    public static void main(String[] args) {
        // Test Value
        int order1 = 3;
        int order2 = 29423;

        // Test Case
        System.out.println(solution(order1));
        System.out.println(solution(order2));
    }

    private static int solution(int order) {

        int count = 0;

        String orderString = String.valueOf(order);
        char[] orderCharArray = orderString.toCharArray();

        for (char c : orderCharArray) {
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }
        return count;
    }
}
