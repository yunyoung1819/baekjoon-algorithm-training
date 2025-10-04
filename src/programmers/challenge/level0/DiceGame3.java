package programmers.challenge.level0;

import static java.lang.Math.*;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/**
 * title: 주사위 게임 3
 * date: 2025.10.04
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181916
 * description:
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 x p 점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p !- q)라면 (10 x p + q)^2점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p,q(p != q)라고 한다면 (p + q) x |p-q| 점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q,r(q != r)이라면 q x r 점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a,b,c,d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해주세요.
 */
public class DiceGame3 {
    public static void main(String[] args) {
        System.out.println(getScore(2,2,2,2));
        System.out.println(getScore(4,1,4,4));
        System.out.println(getScore(6,3,3,6));
        System.out.println(getScore(2,5,2,6));
        System.out.println(getScore(6,4,2,5));
    }

    private static int getScore(int a, int b, int c, int d) {
        int[] dice = sorted(a, b, c, d);
        int p, q = 0, r = 0;

        if (isAllEqual(a, b, c, d)) {
            return 1111 * dice[0];
        }

        // [q, p, p, p], [p, p, p, q]
        if (isThreeEqualOneDifferent(dice)) {
            p = dice[1];
            q = (dice[0] != dice[1]) ? dice[0] : dice[3];
            return (int) pow((10 * p + q), 2);
        }

        if (isTwoPairsDistinct(dice)) {
            p = dice[0];
            q = dice[3];
            return (p + q) * abs(p - q);
        }

        // [p, p, q, r], [q, p, p, r], [q, r, p, p]
        if (isExactlyOnePair(dice)) {
            if (dice[0] == dice[1]) {
                q = dice[2];
                r = dice[3];
            } else if (dice[2] == dice[3]) {
                q = dice[0];
                r = dice[1];
            } else {
                q = dice[0];
                r = dice[3];
            }
            return q * r;
        }

        if (isAllDistinct(a, b, c, d)) {
           return dice[0];
        }

        return dice[0];
    }

    private static boolean isAllDistinct(int a, int b, int c, int d) {
        return (a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d);
    }

    private static boolean isExactlyOnePair(int[] dice) {
        return ((dice[0] == dice[1]) && (dice[1] != dice[2]) && (dice[2] != dice[3])) ||
            ((dice[0] != dice[1]) && (dice[1] != dice[2]) && (dice[2] == dice[3])) ||
            ((dice[0] != dice[1]) && (dice[1] == dice[2]) && (dice[2] != dice[3]));
    }

    private static boolean isTwoPairsDistinct(int[] dice) {
        return ((dice[0] == dice[1]) && (dice[2] == dice[3])) && (dice[0] != dice[3]);
    }

    private static boolean isThreeEqualOneDifferent(int[] dice) {
        return ((dice[0] != dice[1]) && (dice[1] == dice[2]) && (dice[2] == dice[3])) ||
            ((dice[0] == dice[1]) && (dice[1] == dice[2]) && (dice[2] != dice[3]));
    }

    private static boolean isAllEqual(int a, int b, int c, int d) {
        return a == b && b == c && c == d;
    }

    private static int [] sorted(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        return dice;
    }
}
