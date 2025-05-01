package programmers.algorithm.hash;

import java.util.Arrays;

/**
 * title: 전화번호 목록
 * date: 2025.05.01
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 *
 */
public class PhoneBook {
    public static void main(String[] args) {
        String[] phoneBook = {"123", "456", "789"};
        boolean result = solution(phoneBook);
        System.out.println(result);
    }

    private static boolean solution(String[] phone_book) {
        // 전화번호부 배열을 정렬
        Arrays.sort(phone_book);

        /*
         * 정렬을 하면 접두어 관계에 있는 문자열끼리는 반드시 '옆에 붙어 있게' 된다.
         * 예를 들어 ["119", "97674223", "1195524421"] -> ["119", "1195524421", "97674223"]
         */
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
