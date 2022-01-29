package programmers.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonExistingNumberAdding_Ex2Test {

    @DisplayName("없는 숫자 더하기 테스트")
    @Test
    void nonExistingNumberAddingTest() {
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};

        NonExistingNumberAdding_Ex2 nonExistingNumberAdding_ex2 = new NonExistingNumberAdding_Ex2();
        assertEquals(14, nonExistingNumberAdding_ex2.solution(numbers1));
        assertEquals(6, nonExistingNumberAdding_ex2.solution(numbers2));
    }
}