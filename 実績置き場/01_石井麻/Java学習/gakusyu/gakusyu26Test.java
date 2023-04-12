package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu26Test {

	@Test
	void test() {
		int[] result = gakusyu26.main();
		
		assertThat(result[0], is(12));
		assertThat(result[1], is(18));
		assertThat(result[2], is(21));
		assertThat(result[3], is(24));
		assertThat(result[4], is(35));
	}
}
