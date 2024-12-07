package programmers.challenge.level0;

import java.util.HashSet;
import java.util.Set;

/**
 * title: 중복된 문자 제거
 * date: 2024.12.07
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */
public class DuplicatedLetter {
    public static void main(String[] args) {
        DuplicatedLetter duplicatedLetter = new DuplicatedLetter();

        System.out.println(duplicatedLetter.removeDuplicated("people"));
        System.out.println(duplicatedLetter.removeDuplicated("We are the world"));
    }

    private String removeDuplicated(String my_string) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder();
        char[] charArray = my_string.toCharArray();

        for (char ch : charArray) {
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

}
