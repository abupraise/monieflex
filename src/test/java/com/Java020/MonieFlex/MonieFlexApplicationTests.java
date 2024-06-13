package com.Java020.MonieFlex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MonieFlexApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void sampleTest() {
		int expected = 42;
		int actual = 42;
		assertEquals(expected, actual);
	}
}
