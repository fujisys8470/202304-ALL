package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu28Test {

	@Test
	void test() {
		String result = gakusyu28.main();
		
		assertThat(result, is("12"));
	}
}
