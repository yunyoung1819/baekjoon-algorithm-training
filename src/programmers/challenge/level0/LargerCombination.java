package programmers.challenge.level0;

/**
 * title: 더 크게 합치기
 * date: 2024.12.12
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class LargerCombination {
    public static void main(String[] args) {
        LargerCombination largerCombination = new LargerCombination();
        int result1 = largerCombination.solution(9, 91);
        System.out.println(result1);

        int result2 = largerCombination.solution(89, 8);
        System.out.println(result2);
    }

    private int solution(int a, int b) {
        int operation1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int operation2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        return Math.max(operation1, operation2);
    }
}
