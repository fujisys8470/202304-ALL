package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu29Test {

	@Test
	void test() {
		String result = gakusyu29.main();
		
		assertThat(result, is("7.82"));
	}
}
