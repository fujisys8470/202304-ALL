package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu5Test {

	@Test
	void test() {
		String result = gakusyu5.main();
		
		assertThat(result, is("OK"));
	}
}
