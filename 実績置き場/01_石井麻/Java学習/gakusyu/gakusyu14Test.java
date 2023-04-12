package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu14Test {

	@Test
	void test() {
		int result = gakusyu14.main();
		
		assertThat(result, is(16));
	}
}
