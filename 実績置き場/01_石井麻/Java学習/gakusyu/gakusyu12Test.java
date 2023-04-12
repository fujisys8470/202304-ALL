package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu12Test {

	@Test
	void test() {
		int result = gakusyu12.main();
		
		assertThat(result, is(8));
	}
}
