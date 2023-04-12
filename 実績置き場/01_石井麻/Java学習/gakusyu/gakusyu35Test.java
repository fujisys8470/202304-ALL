package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu35Test {

	@Test
	void test() {
		String result = gakusyu35.main();
		
		assertThat(result, is("東京都中央区"));
	}
}
