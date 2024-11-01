package programmers.challenge.level0;

import java.util.Objects;

public class SimilarityOfArray {
    public static void main(String[] args) {
        // test case
        String[] s1 = {"a","b","c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(solution(s1, s2));
    }

    private static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (Objects.equals(s1[i], s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
