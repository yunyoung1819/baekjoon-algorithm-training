package programmers.challenge.level1;

import java.util.Arrays;

/**
 * 문제제목 : 예산 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12982
 * 작 성 일 : 2019.06.29
 * 작 성 자 : YUN YOUNG
 * 
 * 문제설명 : S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 
 * 필요한 금액을 조사했습니다. 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 
 * 구매해줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해줄 수 있도록 하려고 합니다.
 * 
 * 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해줘야 합니다. 
 * 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며 
 * 1,000보다 적은 금액을 지원해 줄 수는 없습니다.
 * 
 * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budge이 매개변수로 주어질 때, 
 * 최대 몇개의 부서에 물품을 지원할 수 있는지 return하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
 * d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
 * budget은 예산을 나타내며 1이상 10,000,000 이하의 자연수입니다.
 *
 */
public class Budget {
	public static void main(String[] args) {
		Budget budget = new Budget();
		System.out.println(budget.solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(budget.solution(new int[] {2,2,3,3}, 10));
	}

	public int solution(int[] d, int b) {
		Arrays.sort(d);	// 배열을 오름차순으로 정렬한 뒤 cost가 budget보다 작거나 같을 때까지 더한다. 
		int budget = b;
		int cost = 0;
		int count = 0;
		
		for (int i = 0; i < d.length; i++) {
			cost += d[i];
			if (cost > budget) {
				count = i;
				break;
			}
			count = i + 1;
		}		
		
		return count;
	}
}
