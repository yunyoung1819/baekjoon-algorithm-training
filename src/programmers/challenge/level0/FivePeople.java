package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 5명씩
 * date: 2024.12.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */
public class FivePeople {
    public static void main(String[] args) {
        FivePeople fivePeople = new FivePeople();

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] result = fivePeople.solution(names);

        for (String name : result) {
            System.out.println(name);
        }
    }

    private String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            result.add(names[i]);
        }

        return result.toArray(new String[0]);
    }
}
