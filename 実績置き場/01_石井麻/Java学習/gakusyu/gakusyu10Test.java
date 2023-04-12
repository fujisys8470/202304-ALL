package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu10Test {

	@Test
	void test() {
		int result = gakusyu10.main();
		
		assertThat(result, is(243));
	}

}
