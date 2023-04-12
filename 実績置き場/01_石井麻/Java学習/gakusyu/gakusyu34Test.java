package gakusyu;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class gakusyu34Test {

	@Test
	void test() {
		List<String> result = gakusyu34.main();
		
		assertThat(result.get(0), is("東京都港区赤坂"));
		assertThat(result.get(1), is("東京都港区赤坂"));
	}
}
