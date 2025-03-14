package programmers.challenge.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddingDivisorTest {

    @DisplayName("약수의 개수와 덧셈 테스트")
    @Test
    void addingDivisorTest() {
        int left1 = 13;
        int right1 = 17;
        int left2 = 24;
        int right2 = 27;

        AddingDivisor ex4 = new AddingDivisor();

        assertEquals(43, ex4.solution(left1, right1));
        assertEquals(52, ex4.solution(left2, right2));
    }
}
