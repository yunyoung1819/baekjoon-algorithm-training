package programmers.challenge.level0;

/**
 * title: 정수 부분
 * date: 2024.11.24
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181850
 */
public class Flo {
    public static void main(String[] args) {
        double flo = 69.32;
        System.out.println(convertDoubleToInt(flo));
    }

    private static int convertDoubleToInt(double flo) {
        return (int) flo;
    }
}
