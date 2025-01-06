package programmers.challenge.level0;

import java.util.Arrays;

/**
 * Title: OX 퀴즈
 * Date: 2025.01.06
 * Author: yun young
 * Link: https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */
public class OXQuiz {
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answers = solution(quiz);
        System.out.println(Arrays.toString(answers));
    }

    private static String[] solution(String[] quizList) {
        String[] results = new String[quizList.length];

        for (int i = 0; i < quizList.length; i++) {
            results[i] = evaluateQuiz(quizList[i]);
        }

        return results;
    }

    private static String evaluateQuiz(String quiz) {
        String[] parts = quiz.split(" ");
        int leftOperand = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int rightOperand = Integer.parseInt(parts[2]);
        int expectedResult = Integer.parseInt(parts[4]);

        int actualResult = operator.equals("+")
                ? leftOperand + rightOperand
                : leftOperand - rightOperand;
        return actualResult == expectedResult ? "O" : "X";
    }
}
