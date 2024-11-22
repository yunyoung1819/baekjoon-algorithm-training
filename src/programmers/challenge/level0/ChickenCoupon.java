package programmers.challenge.level0;

/**
 * title: 치킨 쿠폰
 * date: 2024.11.13
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120884
 * description: 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
 * 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
 * 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때
 * 받을 수 있는 최대 서비스 치킨의 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class ChickenCoupon {
    public static void main(String[] args) {
        int orderedChicken = 100;
        System.out.println(solution(orderedChicken));
    }

    private static int solution(int chicken) {
        int coupon = chicken;
        int serviceChicken = 0;
        int serviceCoupon = 0;

        // 총 쿠폰 수는 지급된 쿠폰 수와 서비스 치킨을 주문하면서 받은 쿠폰 수를 합쳐서 구한다.
        int totalCoupon = coupon + serviceCoupon;

        // 총 쿠폰 수가 10보다 많으면
        while (totalCoupon >= 10) {
            coupon -= 10;  // 쿠폰에서 10장을 차감한다.
            serviceChicken++;      // 서비스 치킨 수를 1마리 주문한다.
            serviceCoupon++;       // 서비스 쿠폰 수를 1 증가한다.
            totalCoupon = coupon + serviceCoupon;  // 총 쿠폰 수는 10장이 차감된 쿠폰 수와 서비스 쿠폰 수를 합친다.
        }

        return serviceChicken;
    }
}
