package programmers.challenge.level0;

/**
 * title: 배열 회전시키기
 * date: 2024.11.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,455,6,4,-1,45,6};
        solution(numbers1, "right");
        solution(numbers2, "left");
    }

    private static int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];

        if (direction.equals("right")) {
            result[0] = numbers[numbers.length-1];

            for (int i = 1; i < numbers.length; i++) {
                result[i] = numbers[i-1];
            }
        } else if (direction.equals("left")) {
            result[result.length-1] = numbers[0];

            for (int i = 0; i < numbers.length - 1; i++) {
                result[i] = numbers[i+1];
            }
        }
        return result;
    }
}
