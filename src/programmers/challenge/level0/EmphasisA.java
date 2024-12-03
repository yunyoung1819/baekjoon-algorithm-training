package programmers.challenge.level0;

/**
 * title: A 강조하기
 * date: 2024.12.01
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */
public class EmphasisA {
    public static void main(String[] args) {
        String myString = "abstract algebra";
        String answer = solution(myString);

        assert answer.equals("AbstrAct AlgebrA") : "Test failed: Expected 'AbstrAct AlgebrA' but got '" + answer + "'";
        System.out.println("Test passed!");
    }

    private static String solution(String myString) {
        return myString.toLowerCase().replace("a", "A");
    }
}
