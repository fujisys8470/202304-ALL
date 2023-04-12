package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu11Test {

	@Test
	void test() {
		double result = gakusyu11.main();
		
		assertThat(result, is(2.9000000000000004));
	}
}
