package programmers.challenge.level0;

/**
 * title: 이어 붙인 수
 * date: 2025.01.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181928
 * description: 정수가 담긴 리스트 num_list 가 주어집니다. num_list의 홀수만 순서대로 이어붙인 수와
 * 짝수만 순서대로 이어 붙인 수의 합을 return 하도록 solution 함수를 완성해주세요.
 */
public class ConnectedNumber {
    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }

    private static int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();

        for (int num : num_list) {
            (num % 2 == 0 ? evenNumbers : oddNumbers).append(num);
        }
        int result = Integer.parseInt(oddNumbers.toString()) + Integer.parseInt(evenNumbers.toString());
        return result;
    }
}
