package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu9Test {

	@Test
	void test() {
		int result = gakusyu9.main();
		
		assertThat(result, is(243));
	}
}
