package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu13Test {

	@Test
	void test() {
		int result = gakusyu13.main();
		
		assertThat(result, is(128));
	}
}
