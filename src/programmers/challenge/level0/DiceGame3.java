package programmers.challenge.level0;

import static java.lang.Math.*;

import java.util.Arrays;

/**
 * title: 주사위 게임 3
 * date: 2025.10.04
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181916
 * description:
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 *
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 x p 점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p !- q)라면 (10 x p + q)^2점을 얻습니다.
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p,q(p != q)라고 한다면 (p + q) x |p-q| 점을 얻습니다.
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q,r(q != r)이라면 q x r 점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자만큼의 점수를 얻습니다.
 *
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
        int[] v = {a, b, c, d};
        Arrays.sort(v);
        int p = 0, q = 0, r = 0, score = 0;

        // 1. 네 주사위에서 나온 숫자가 모두 p로 같은 경우
        if (a == b && b == c && c == d) {
            score = 1111 * v[0];
        }

        // 2. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q인 경우
        // [q, p, p, p], [p, p, p, q]
        if (((v[0] != v[1]) && (v[1] == v[2]) && (v[2] == v[3])) ||
            ((v[0] == v[1]) && (v[1] == v[2]) && (v[2] != v[3]))) {
            p = v[1];
            q = (v[0] != v[1]) ? v[0] : v[3];
            score = (int) pow((10 * p + q), 2);
        }

        // 3. 주사위가 두개씩 같은 값이 나오고 나온 숫자가 각각 p,q인 경우
        if (((v[0] == v[1]) && (v[2] == v[3])) && (v[0] != v[3])) {
            p = v[0];
            q = v[3];
            score = (p + q) * abs(p - q);
        }

        // 4. 어느 두 주사위에서 나온 숫자가 모두 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q,r인 경우
        // [p, p, q, r], [q, p, p, r], [q, r, p, p]
        if (((v[0] == v[1]) && (v[1] != v[2]) && (v[2] != v[3])) ||
            ((v[0] != v[1]) && (v[1] != v[2]) && (v[2] == v[3])) ||
            ((v[0] != v[1]) && (v[1] == v[2]) && (v[2] != v[3]))) {
            if (v[0] == v[1]) {
                q = v[2];
                r = v[3];
            } else if (v[2] == v[3]) {
                q = v[0];
                r = v[1];
            } else {
                q = v[0];
                r = v[3];
            }
            score = q * r;
        }

        // 5. 네 주사위에 적힌 숫자가 모두 다른 경우
        if ((a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d)) {
           score = v[0];
        }

        return score;
    }
}
