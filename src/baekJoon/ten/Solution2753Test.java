package baekJoon.ten;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2753Test {
	Solution2753 solution = new Solution2753();
	int firstYear = 2012;
	int secondYear = 1900;
	int thirdYear = 2000;
	
	@Test
	public void test() {
		assertEquals(1, solution.getLeapYear(firstYear));
		assertEquals(0, solution.getLeapYear(secondYear));
		assertEquals(1, solution.getLeapYear(thirdYear));
	}
	
}
