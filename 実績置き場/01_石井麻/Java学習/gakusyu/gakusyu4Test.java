package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu4Test {

	@Test
	void test() {
		int result = gakusyu4.main();
		
		assertThat(result, is(5));
	}
}
