package programmers.challenge.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * title: K의 개수
 * date: 2024.11.20
 * author: YUN YOUNG
 * link: <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120887">link</a>
 * description: 1부터 13까지의 수에서 1은 1,10,11,12,13 이렇게 총 6번 등장합니다.
 * i,j,k가 매개변수로 주어질 때 i부터 j까지 k가 몇번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 */
public class K {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
        System.out.println(solution(10,50,5));
        System.out.println(solution(3,10,2));
    }

    private static int solution(int i, int j, int k) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int n = i; n <= j; n++) {
            char[] charArray = String.valueOf(n).toCharArray();
            for (char c : charArray) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }
        char key = (char) (k + '0');
        return countMap.getOrDefault(key, 0);
    }
}
