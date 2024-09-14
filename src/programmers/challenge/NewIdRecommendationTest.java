package programmers.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NewIdRecommendationTest {

    @Test
    @DisplayName("카카오 신규 아이디 테스트")
    void idTest() {
        NewIdRecommendation ex5 = new NewIdRecommendation();
        String testId01 = "...!@BaT#*..y.abcdefghijklim";
        String testId02 = "z-+.^.";
        String testId03 = "=.=";
        String testId04 = "123_.def";
        String testId05 = "abcdefghijklmn.p";

        assertThat(ex5.solution(testId01), is("bat.y.abcdefghi"));
        assertThat(ex5.solution(testId02), is("z--"));
        assertThat(ex5.solution(testId03), is("aaa"));
        assertThat(ex5.solution(testId04), is("123_.def"));
        assertThat(ex5.solution(testId05), is("abcdefghijklmn"));
    }

}
