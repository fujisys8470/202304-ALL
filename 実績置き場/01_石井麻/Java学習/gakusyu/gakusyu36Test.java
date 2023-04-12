package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu36Test {

	@Test
	void test() {
		String result = gakusyu36.main();
		
		assertThat(result, is("Apple-Grape-Melon"));
	}
}
