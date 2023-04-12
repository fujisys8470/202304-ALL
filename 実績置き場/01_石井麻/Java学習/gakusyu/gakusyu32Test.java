package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu32Test {

	@Test
	void test() {
		int result = gakusyu32.main();
		
		assertThat(result, is(7));
	}
}
