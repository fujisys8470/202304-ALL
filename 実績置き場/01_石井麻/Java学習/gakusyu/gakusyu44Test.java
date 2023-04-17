package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu44Test {

	@Test
	void test() {
		String[] hikisu = {"4", "kake", "9"};
		int result = gakusyu44.main(hikisu);
		
		assertThat(result, is(36));
	}
}
