package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu23Test {

	@Test
	void test() {
		String result = gakusyu23.main();
		
		assertThat(result, is("二等賞"));
	}
}
