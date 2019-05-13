package programmers.level.one;

import static org.junit.Assert.*;

import org.junit.Test;

// test code
public class RunnerTest {

	Runner runner = new Runner();
	String[] participant1 = {"leo", "kiki", "eden"};
	String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
	String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
	
	String[] completion1 = {"eden", "kiki"};
	String[] completion2 = {"marina", "josipa", "nikola", "filipa"};
	String[] completion3 = {"stanko", "mislav", "ana"};
		
	@Test
	public void test() {
		assertEquals("leo", runner.solution(participant1, completion1));
		assertEquals("vinko", runner.solution(participant2, completion2));
		assertEquals("mislav", runner.solution(participant3, completion3));
	}

}
