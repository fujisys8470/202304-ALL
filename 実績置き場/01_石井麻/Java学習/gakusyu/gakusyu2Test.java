package gakusyu;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

class gakusyu2Test {

	@Test
	void test() {
		int result = gakusyu2.main();
		
		assertThat(result, is(20));
	}
}
