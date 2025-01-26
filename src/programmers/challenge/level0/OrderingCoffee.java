package programmers.challenge.level0;

import java.util.HashMap;
import java.util.Map;

/**
 * title: 커피 심부름
 * date: 2025.01.26
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */
public class OrderingCoffee {
    public static void main(String[] args) {
        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int totalPrice1 = solution(order1);
        System.out.println(totalPrice1);

        String[] order2 = {"americanoice", "americano", "iceamericano"};
        int totalPrice2 = solution(order2);
        System.out.println(totalPrice2);
    }

    private static int solution(String[] order) {
        Map<String, Integer> coffeeMenu = new HashMap<>();
        coffeeMenu.put("americano", 4500);
        coffeeMenu.put("cafelatte", 5000);
        coffeeMenu.put("anything", 4500);

        int totalPrice = 0;

        for (String eachOrder : order) {
            if (eachOrder.contains("americano")) {
                eachOrder = "americano";
            }
            if (eachOrder.contains("cafelatte")) {
                eachOrder = "cafelatte";
            }
            totalPrice += coffeeMenu.getOrDefault(eachOrder, 0);
        }
        return totalPrice;
    }
}
