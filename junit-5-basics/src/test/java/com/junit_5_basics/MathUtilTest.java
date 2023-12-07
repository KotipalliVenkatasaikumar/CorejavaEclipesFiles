package com.junit_5_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilTest {

	MathUtil mathUtil;

	@BeforeEach
	void init() {
		mathUtil = new MathUtil();
	}

	@AfterEach
	void cleaning() {
		System.out.println("clenning done...");
	}

	@BeforeAll
	static void beforeAllInt() {
		System.out.println("this needs to run before all");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("this method to run after all");
	}
	
	@Test
	@EnabledOnOs
//	@Disabled
	@DisplayName("this method is not run")
	void EnabledOnOs() {
		System.out.println("this should be disabled");
	}
	

	@Test
	@Tag("math")
	void test() {
		System.out.println(" start from test");

		int a = mathUtil.add(0, 1);
		if (a != 1) {
			System.err.println("failed");
		} else {
			System.err.println(a);
		}
	}

	@Test
	@Tag("math")
	void test2() {
		System.out.println("start from test2");

		int b = mathUtil.mult(5, 20);
		System.err.println(b);
	}

	@Test
	@Tag("radius")
	void testComputeCircleRadius() {

		assertEquals(314.1592653589793, mathUtil.computeCircleArea(10), "should return the right circle area");

	}

	@Test
	@DisplayName("testing add method")
	@Tag("divide")
	void testDivide() {

		assertThrows(ArithmeticException.class, () -> mathUtil.divide(10, 0), "ivide by zero should throw ");

	}
}
