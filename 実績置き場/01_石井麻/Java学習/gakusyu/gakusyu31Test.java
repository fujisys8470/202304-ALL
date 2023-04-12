package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu31Test {

	@Test
	void test() {
		double result = gakusyu31.main();
		
		assertThat(result, is(2.84));
	}
}
