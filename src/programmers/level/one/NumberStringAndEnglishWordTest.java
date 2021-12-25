package programmers.level.one;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// test code
class NumberStringAndEnglishWordTest {

    @Test
    @DisplayName("프로그래머스 숫자 문자열과 영단어 테스트")
    void test() {
        NumberStringAndEnglishWord numberStringAndEnglishWord = new NumberStringAndEnglishWord();
        String test1 = "one4seveneight";
        String test2 = "23four5six7";
        String test3 = "1zerotwozero3";

        assertEquals(numberStringAndEnglishWord.solution(test1), 1478);
        assertEquals(numberStringAndEnglishWord.solution(test2), 234567);
        assertEquals(numberStringAndEnglishWord.solution(test3), 10203);
    }
}