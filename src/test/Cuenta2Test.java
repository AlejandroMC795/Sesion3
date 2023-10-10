package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta2;

class Cuenta2Test {
	
	static Cuenta2 ctaPrueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPrueba=new Cuenta2(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPrueba.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		assertEquals(ctaPrueba, ctaPrueba);
	}
	
	@Test
	void testIngresar() {
		
	}
	

}
