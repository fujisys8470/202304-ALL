package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu47Test {

	@Test
	void test() {
		String result = gakusyu47.main();
		
		assertThat(result, is("C:\\Users\\520-255\\eclipse-workspace\\gakusyu"));
	}
}
