package programmers.level.one;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Test code
public class BudgetTest {
	
	Budget budget = new Budget();
	int[] team1 = {1,3,2,5,4};
	int budget1 = 9;
	
	int[] team2 = {2,2,3,3};
	int budget2 = 10;
	
	@Test
	public void test() {
		assertEquals(3, budget.solution(team1, budget1));
		assertEquals(4, budget.solution(team2, budget2));
	}
}
