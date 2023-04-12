package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class gakusyu41Test {

	@Test
	void test() {
		String[] hikisu = {"4", "kake", "9"};
		String result = gakusyu41.main(hikisu);
		
		assertThat(result, is("入力された式は 4 kake 9 です"));
	}
}
