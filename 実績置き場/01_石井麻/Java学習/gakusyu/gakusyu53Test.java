package gakusyu;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu53Test {

	@Test
	void test() {
		String result = gakusyu53.main();
		
		assertThat(result, is("2023-04-18T14:06:23.314699200"));
	}
}
