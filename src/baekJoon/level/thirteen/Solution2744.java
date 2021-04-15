package baekJoon.level.thirteen;

import java.util.Scanner;

/**
 * 문제번호 : 2744번
 * 문제제목 : 대소문자 바꾸기
 * 문제링크 : https://www.acmicpc.net/problem/2744
 * 문제등급 : Bronze II
 * 작 성 일 : 2021.04.15
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 출   력 : 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다. 
 */
public class Solution2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Solution2744 solution = new Solution2744();
        System.out.println(solution.changeWordCase(input));
        sc.close();
    }

    public String changeWordCase(String words) {
        char[] charArray = words.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
    }
}
