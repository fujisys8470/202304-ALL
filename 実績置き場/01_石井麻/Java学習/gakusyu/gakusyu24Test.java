package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu24Test {

	@Test
	void test() {
		int[] result = gakusyu24.main();
		
		assertThat(result[0], is(10));
		assertThat(result[1], is(10));
		assertThat(result[2], is(10));
	}
}
