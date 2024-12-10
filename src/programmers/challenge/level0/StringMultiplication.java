package programmers.challenge.level0;

/**
 * title: 문자열 곱하기
 * date: 2024.12.10
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class StringMultiplication {
    public static void main(String[] args) {
        StringMultiplication stringMultiplication = new StringMultiplication();
        String my_string = "string";
        int k = 3;
        String result = stringMultiplication.multiply(my_string, k);
        System.out.println(result);
    }

    private String multiply(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}
