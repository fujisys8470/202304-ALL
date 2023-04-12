package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu19Test {

	@Test
	void test() {
		int result = gakusyu19.main();
		
		assertThat(result, is(16384));
	}
}
