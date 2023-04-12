package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu25Test {

	@Test
	void test() {
		int[] result = gakusyu25.main();
		
		assertThat(result[0], is(17));
		assertThat(result[1], is(31));
		assertThat(result[2], is(18));
		assertThat(result[3], is(24));
		assertThat(result[4], is(12));
	}
}
