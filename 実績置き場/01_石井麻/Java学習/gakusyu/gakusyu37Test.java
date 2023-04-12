package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu37Test {

	@Test
	void test() {
		String result = gakusyu37.main();
		
		assertThat(result, is("不合格です"));
	}
}
