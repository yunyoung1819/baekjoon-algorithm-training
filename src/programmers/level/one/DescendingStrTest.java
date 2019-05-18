package programmers.level.one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// test code
class DescendingStrTest {
	
	DescendingStr descStr = new DescendingStr();
	
	@Test
	void test() {
		assertEquals("gfedcbZ", descStr.descendingStr("Zbcdefg"));
		assertEquals("kgfddbKCA", descStr.descendingStr("AbCdKkdfg"));
	}

}
