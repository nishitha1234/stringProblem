package com.string.problem;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProblemTest {

	@Test
	public void test() {
		String str = "nishitha";
		char ch = 'i';
		StringProblem sptest = new StringProblem();
		String s= sptest.removeChar(str, ch);
		assertEquals("nshtha", s);
		assertEquals("nshtha", sptest.removeCharUsingReplace(str, String.valueOf(ch)));
	}
}
