package programmers.challenge.level0;

/**
 * 문제제목: 아이스 아메리카노
 * 작 성 일: 2024.09.15
 * 작 성 자: YUN YOUNG
 * 문제설명: 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원 입니다.
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
 * 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 */
public class IceAmericano {

    public static final int price = 5500;

    public static void main(String[] args) {
        // 테스트 케이스 실행
        System.out.println(solution(price));
        System.out.println(solution(15000));
    }

    private static int[] solution(int money) {
        int count = money / price;
        int remain = money % price;
        int[] answer = {count, remain};
        return answer;
    }
}
