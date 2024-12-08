package programmers.challenge.level0;

import java.util.LinkedList;
import java.util.List;

/**
 * title: 할 일 목록
 * date: 2024.12.08
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */
public class TodoList {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        solution(todo_list, finished);
    }

    private static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> notFinishedList = new LinkedList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                notFinishedList.add(todo_list[i]);
            }
        }

        return notFinishedList.toArray(new String[0]);
    }
}
