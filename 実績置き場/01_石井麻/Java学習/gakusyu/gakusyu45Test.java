package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu45Test {

	@Test
	void test() {
		int result = gakusyu45.main();
		
		assertThat(result, is(5));
	}
}
