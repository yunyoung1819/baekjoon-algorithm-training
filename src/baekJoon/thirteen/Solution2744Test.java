package baekJoon.thirteen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Test Code
public class Solution2744Test {

    Solution2744 solution = new Solution2744();
    String testWord1 = "WrongAnswer";
    String testWord2 = "ILoveYou";

    @Test
    public void changeWordCase() {
        assertEquals("wRONGaNSWER", solution.changeWordCase(testWord1));
        assertEquals("ilOVEyOU", solution.changeWordCase(testWord2));
    }

}
