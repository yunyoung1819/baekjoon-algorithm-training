package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 배열에서 문자열 대소문자 변환하기
 * date: 2024.12.06
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */
public class StringCaseConversion {
    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        solution(strArr);
    }

    private static String[] solution(String[] strArr) {

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                String lowerCase = strArr[i].toLowerCase();
                strList.add(lowerCase);
            } else {
                String upperCase = strArr[i].toUpperCase();
                strList.add(upperCase);
            }
        }

        return strList.toArray(new String[0]);
    }
}
