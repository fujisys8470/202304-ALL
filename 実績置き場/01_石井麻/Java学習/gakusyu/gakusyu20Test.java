package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu20Test {

	@Test
	void test() {
		int result = gakusyu20.main();
		
		assertThat(result, is(11));
	}
}
