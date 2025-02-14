package programmers.challenge.level0;

/**
 * title: 주사위 게임2
 * date: 2025.02.14
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */
public class DiceGame2 {
    public static void main(String[] args) {
        DiceGame2 diceGame = new DiceGame2();
        int score = diceGame.calculateScore(4, 4, 4);

        System.out.println(score);
    }

    private int calculateScore(int a, int b, int c) {
        int score = 0;
        int sum = a + b + c;
        int sumSq = (a * a) + (b * b) + (c * c);
        int sumCube = (a * a * a) + (b * b * b) + (c * c * c);

        if (a != b && b != c && a != c) {
            score = sum;
        } else if (a == b && b == c) {
            score = sum * sumSq * sumCube;
        } else {
            score = sum * sumSq;
        }

        return score;
    }
}
