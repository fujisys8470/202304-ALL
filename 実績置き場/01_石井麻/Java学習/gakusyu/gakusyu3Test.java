package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu3Test {

	@Test
	void test() {
		int result = gakusyu3.main();
		
		assertThat(result, is(32));
	}
}
