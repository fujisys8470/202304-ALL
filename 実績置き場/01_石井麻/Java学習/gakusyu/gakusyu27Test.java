package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu27Test {

	@Test
	void test() {
		String result = gakusyu27.main();
		
		assertThat(result, is("10"));
	}
}
