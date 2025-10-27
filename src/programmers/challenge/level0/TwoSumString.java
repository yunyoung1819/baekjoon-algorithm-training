package programmers.challenge.level0;

import java.math.BigInteger;

/**
 * title: 두 수의 합
 * date: 2025.10.27
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181846
 * description: 0이상의 두 정수가 문자열 a,b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 완성해주세요.
 */
public class TwoSumString {
    public static void main(String[] args) {
        System.out.println(twoSum("582", "734"));
        System.out.println(twoSum("18446744073709551615", "287346502836570928366"));
        System.out.println(twoSum("0", "0"));
    }

    private static String twoSum(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        return numA.add(numB).toString();
    }
}
