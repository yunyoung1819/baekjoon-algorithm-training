package programmers.challenge.level0;

/**
 * title: 주사위 게임1
 * date: 2024.12.18
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */
public class DiceGame {
    public static void main(String[] args) {

        DiceGame diceGame = new DiceGame();

        int score1 = diceGame.play(3, 5);
        System.out.println(score1);

        int score2 = diceGame.play(6, 1);
        System.out.println(score2);

        int score3 = diceGame.play(2,4);
        System.out.println(score3);
    }

    private int play(int a, int b) {
        int score = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            score = (a * a) + (b * b);
        } else if (a % 2 != 0 || b % 2 != 0) {
            score = 2 * (a + b);
        } else {
            score = Math.abs(a - b);
        }
        return score;
    }
}
