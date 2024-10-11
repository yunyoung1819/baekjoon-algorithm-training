package programmers.challenge.level0;

/**
 * 문제 제목: 부족한 금액 계산하기
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/82612
 * 작 성 일: 2022.02.12
 * 작 성 자: YUN YOUNG
 * 문제 설명: 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price 원인데, 놀이기구를
 * N번째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
 * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
 * 놀이기구를 count번 타게 돠면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
 * 단, 금액이 부족하지 않으면 0을 return 하세요.
 *
 * 입출력 예 설명
 * 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 총 필요한 놀이기구의 이용 금액은 30(=3+6+9+12)이 되어 10만큼 부족하므로
 * 10을 return 합니다.
 */
public class InsufficientAmount {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        solution(price, money, count);
    }

    private static long solution(int price, int money, int count) {
        long newPrice = 0;
        long pay = 0;

        for (int i = 1; i <= count; i++) {
            newPrice = (long) price * i;
            pay += newPrice;
        }
        return (pay - money) < 0 ? 0 : pay - money;
    }
}
