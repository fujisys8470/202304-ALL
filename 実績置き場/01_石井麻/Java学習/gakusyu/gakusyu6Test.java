package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu6Test {

	@Test
	void test() {
		String result = gakusyu6.main();
		
		assertThat(result, is("XT3140-Y2"));
	}
}
