package junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class PatternMatchTest {

	@Test
	void test() {
		Pattern p = Pattern.compile("g..d");// 最初はg最後はdで間に2文字
		String a = "good";
		Matcher m = p.matcher(a);
		boolean[] list = new boolean[3];

		assertTrue(m.matches());
		String[] go = { "good", "goal", "goad" };
		for (int i = 0; i < 4; i++) {
			try {
				m = p.matcher(go[i]);
				list[i] = m.matches();
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}

		assertTrue(list[2]);// goad
		assertFalse(list[1]);// goal

		String regex = "A.B.C.D";
		Pattern p2 = Pattern.compile(regex);
		Matcher m1 = p2.matcher("AABBCCD");
		assertTrue(m1.matches());
		String regex2 = Pattern.quote("A.B.C.D");
		Pattern p3 = Pattern.compile(regex2);
		Matcher m2 = p3.matcher("A.B.C.D");
		assertTrue(m2.matches());

		String regex3 = "jpg$";
		Pattern p4 = Pattern.compile(regex3);
		Matcher m3 = p4.matcher("profile.jpg");
		if (m3.find()) {
			assertEquals(m3.group(), "jpg");
		}
	}

}
