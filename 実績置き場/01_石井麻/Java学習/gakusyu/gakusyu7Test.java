package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu7Test {

	@Test
	void test() {
		int result = gakusyu7.main();
		
		assertThat(result, is(15));
	}
}
