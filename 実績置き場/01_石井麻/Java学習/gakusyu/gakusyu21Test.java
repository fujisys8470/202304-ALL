package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu21Test {

	@Test
	void test() {
		int result = gakusyu21.main();
		
		assertThat(result, is(15625));
	}
}
