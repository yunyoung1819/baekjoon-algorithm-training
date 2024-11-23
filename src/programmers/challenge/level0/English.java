package programmers.challenge.level0;

/**
 * title: 영어가 싫어요
 * date: 2024.11.23
 * author: YUN YOUNG
 * description: 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 * 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return하도록 solution 함수를 완성해주세요.
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120894
 */
public class English {
    public static void main(String[] args) {
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers1));

        String numbers2 = "onefourzerosixseven";
        System.out.println(solution(numbers2));

        String numbers3 = "zerofour";
        System.out.println(solution(numbers3));
    }

    private static long solution(String numbers) {
        String[] numbers_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_str.length; i++) {
            numbers = numbers.replaceAll(numbers_str[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
