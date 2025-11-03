package programmers;

import java.util.Stack;

/**
 * 접근 방법
 * 이 문제는 스택(Stack) 자료구조를 이용하면 깔끔하게 해결할 수 있다.
 * 출금(음수)시 가장 최근의 입금부터 차감해야하므로, 후입선출(LIFO) 구조인 스택이 적합하다.
 *
 * 풀이 방법
 * 1. deposit 배열을 순회하며:
 * - 양수이면 스택에 그대로 push (입금)
 * - 음수이면 출금이므로, 스택의 top부터 하나씩 꺼내며 출금 금액을 맞춰 나감
 * - 출금 후 남은 금액이 1원 이상이면 다시 push
 * - 출금액이 0이 되면 종료
 * 2. 모든 연산이 끝난 뒤 스택에 남은 금액을 배열로 변환하여 반환
 */
public class Deposit {
    public int[] solution(int[] deposit) {
        Stack<Integer> stack = new Stack<>();

        for (int money : deposit) {
            if (money > 0) { // 입금
                stack.push(money);
            } else { // 출금
                int withdraw = -money;
                while (withdraw > 0 && !stack.isEmpty()) {
                    int last = stack.pop();
                    if (last > withdraw) {
                        // 남은 금액이 있다면
                        stack.push(last - withdraw);
                        withdraw = 0;
                    } else {
                        // 출금액이 더 크면 남은 금액만큼 계속 차감
                        withdraw -= last;
                    }
                }
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
