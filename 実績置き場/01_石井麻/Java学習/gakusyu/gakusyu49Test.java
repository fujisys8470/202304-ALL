package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu49Test {

	@Test
	void test() {
		String result = gakusyu49.main();
		
		assertThat(result, is("0"));
	}
}
