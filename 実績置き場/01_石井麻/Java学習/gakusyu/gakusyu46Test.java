package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu46Test {

	@Test
	void test() {
		String result = gakusyu46.main();
		
		assertThat(result, is("C:\\data\\image\\photo\\profile.jpg"));
	}
}
