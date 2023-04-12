package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu33Test {

	@Test
	void test() {
		String result = gakusyu33.main();
		
		assertThat(result, is("港区"));
	}
}
