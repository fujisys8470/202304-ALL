package gakusyu;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

class gakusyu1Test {

	@Test
	void test() {
		int result = gakusyu1.main();
		
		assertThat(result, is(220));
	}

}
