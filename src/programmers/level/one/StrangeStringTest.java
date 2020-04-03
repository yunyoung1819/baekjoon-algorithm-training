package programmers.level.one;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class StrangeStringTest {

	@Test
	public void convertStringTest() {
		StrangeString ssr = new StrangeString();
		String expectedValue = "TrY HeLlO WoRlD";
		String realValue = ssr.convertString("try hello world");
		assertThat(expectedValue, is(realValue));
	}

}
