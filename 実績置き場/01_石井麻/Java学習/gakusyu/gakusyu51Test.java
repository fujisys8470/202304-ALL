package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu51Test {

	@Test
	void test() {
		String result = gakusyu51.main();
		
		assertThat(result, is("ファイルです"));
	}
}
