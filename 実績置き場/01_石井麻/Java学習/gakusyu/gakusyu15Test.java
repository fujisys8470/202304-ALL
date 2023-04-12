package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu15Test {

	@Test
	void test() {
		int result = gakusyu15.main();
		
		assertThat(result, is(-1));
	}
}
