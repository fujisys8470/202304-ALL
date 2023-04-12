package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu22Test {

	@Test
	void test() {
		int result = gakusyu22.main();
		
		assertThat(result, is(9));
	}
}
