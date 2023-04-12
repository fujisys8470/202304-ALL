package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu17Test {

	@Test
	void test() {
		int result = gakusyu17.main();
		
		assertThat(result, is(-1));
	}
}
