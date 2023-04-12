package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu16Test {

	@Test
	void test() {
		int result = gakusyu16.main();
		
		assertThat(result, is(6));
	}
}
