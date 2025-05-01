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
        // 정렬하고 바로 옆의 번호만 비교하는 방식으로 푼다.
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {  // 정렬하면 접두어인 번호는 옆에 위치하게 된다.
                return false;
            }
        }
        return true;
    }
}
