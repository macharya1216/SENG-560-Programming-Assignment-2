package com.mohit.calculator;

import com.generic.arithmetic.Arithmetic;
import static org.junit.Assert.*;

public class App {
	public static void main(String[] args) {
		// Testing https://github.com/macharya1216/SENG_560_Software_Reuse
		Arithmetic calculator = new Arithmetic();

		// ADDITION (BASIC INTEGER)

		assertTrue(calculator.addition("100", "200").equals("300"));

		// SUBSTRACTION (BASIC INTEGER)
		assertTrue(calculator.subtraction("100", "200").equals("-100"));

		// MULTIPLICATION (BASIC INTEGER)
		assertTrue(calculator.multiplication("100", "200").equals("20000"));

		// DIVISION (BASIC INTEGER)
		try {
			assertTrue(calculator.division("100", "200").equals("0.5"));
		} catch (AssertionError e) {
			System.err
					.println("Division Failed , the result of 100 / 200 should be 0.5");
		}
		// POWER (BASIC INTEGER)
		assertTrue(calculator.power("2", "2").equals("4"));

		// SQRT (BASIC INTEGER)
		assertTrue(calculator.sqrt("4").equals("2.0"));

	}
}
