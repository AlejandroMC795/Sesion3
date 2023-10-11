package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	Cuenta ctaPruebas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas=new Cuenta(12345, "Pepe", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPruebas.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		ctaPruebas.ingresar(100);
		assertEquals(new Cuenta(12345, "Pepe", 100, new Movimiento(100, TipoMov.H, " ")), ctaPruebas);
	}

	@Test
	void testRetirar() {
		ctaPruebas.retirar(100);
		assertEquals(new Cuenta(12345, "Pepe", -100, new Movimiento(100, TipoMov.D, " ")), ctaPruebas);

	}
}
