package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu8Test {

	@Test
	void test() {
		int result = gakusyu8.main();
		
		assertThat(result, is(6));
	}
}
