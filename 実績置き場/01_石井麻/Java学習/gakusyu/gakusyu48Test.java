package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu48Test {

	@Test
	void test() {
		String result = gakusyu48.main();
		
		assertThat(result, is("0"));
	}
}
