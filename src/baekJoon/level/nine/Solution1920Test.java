package baekJoon.level.nine;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Solution1920Test {
	
	Solution1920 solution = new Solution1920();
	int[] arr = {1, 2, 3, 4, 5};
	int targetNumber = 0;
			
	@Test
	public void test() {
		assertEquals(1, solution.binarySearch(arr, 1));
		assertEquals(1, solution.binarySearch(arr, 3));
		assertEquals(0, solution.binarySearch(arr, 7));
		assertEquals(0, solution.binarySearch(arr, 9));
		assertEquals(1, solution.binarySearch(arr, 5));
	}

}
