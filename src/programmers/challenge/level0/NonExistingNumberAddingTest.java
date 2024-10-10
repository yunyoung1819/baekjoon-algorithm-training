package programmers.challenge.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonExistingNumberAddingTest {

    @DisplayName("없는 숫자 더하기 테스트")
    @Test
    void nonExistingNumberAddingTest() {
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};

        NonExistingNumberAdding nonExistingNumberAdding_ = new NonExistingNumberAdding();
        assertEquals(14, nonExistingNumberAdding_.solution(numbers1));
        assertEquals(6, nonExistingNumberAdding_.solution(numbers2));
    }
}