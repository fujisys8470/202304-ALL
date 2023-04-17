package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu50Test {

	@Test
	void test() {
		String result = gakusyu50.main();
		
		assertThat(result, is("存在しません"));
	}
}
