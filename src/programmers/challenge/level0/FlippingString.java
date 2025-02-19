package programmers.challenge.level0;

/**
 * title: 문자열 뒤집기
 * date: 2025.02.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181905
 * description: 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 e까지를
 * 뒤집은 문자열을 return 하는 solution 함수를 작성해주세요.
 */
public class FlippingString {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        System.out.println(solution(my_string, 6, 12));
    }

    private static String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();

        for (int i = s, j = e; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return new String(arr);
    }
}
