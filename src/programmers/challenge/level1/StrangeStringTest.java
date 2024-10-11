package programmers.challenge.level1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


class StrangeStringTest {

	@Test
	public void convertStringTest() {
		StrangeString ssr = new StrangeString();
		String expectedValue = "TrY HeLlO WoRlD";
		String realValue = ssr.convertString("try hello world");
		assertThat(expectedValue, is(realValue));
	}

}
