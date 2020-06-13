package programmers.level.one;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

// test code
class DescendingStrTest {
	
	DescendingStr descStr = new DescendingStr();
	
	@Test
	void test() {
		assertEquals("gfedcbZ", descStr.descendingStr("Zbcdefg"));
		assertEquals("kgfddbKCA", descStr.descendingStr("AbCdKkdfg"));
	}

}
