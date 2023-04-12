package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu38Test {

	@Test
	void test() {
		int result = gakusyu38.main();
		
		assertThat(result, is(18));
	}
}
