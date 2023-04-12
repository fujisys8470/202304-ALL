package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu18Test {

	@Test
	void test() {
		String[] result = gakusyu18.main();
		
		assertThat(result[0], is("北海道"));
		assertThat(result[1], is("東京都"));
		assertThat(result[2], is("神奈川県"));
	}
}
