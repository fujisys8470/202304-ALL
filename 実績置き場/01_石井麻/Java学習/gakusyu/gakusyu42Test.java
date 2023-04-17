package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu42Test {

	@Test
	void test() {
		String[] hikisu = {"5", "kake", "9"};
		String result = gakusyu42.main(hikisu);
		
		assertThat(result, is("入力された式は 5 kake 9 です"));
	}
}
