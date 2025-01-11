package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 외계어 사전
 * date: 2025.01.11
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */
public class AlienDictionary {
    public static void main(String[] args) {
        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell1, dic1));

        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell2, dic2));
    }

    private static int solution(String[] spell, String[] dic) {
        // spell = ["a", "b", "c"] -> "abc
        String target = sortedString(spell);

        // 외계어 사전(dic)에서 각 단어를 검사
        for (String word : dic) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if (target.equals(sortedWord)) {
                return 1;
            }
        }
        return 2;
    }

    private static String sortedString(String[] arr) {
        char[] chars = String.join("", arr).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
