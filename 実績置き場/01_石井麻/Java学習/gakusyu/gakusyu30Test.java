package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu30Test {

	@Test
	void test() {
		int result = gakusyu30.main();
		
		assertThat(result, is(42));
	}
}
