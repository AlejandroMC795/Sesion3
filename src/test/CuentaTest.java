package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;
import pkg.Movimiento.TipoMov;

class CuentaTest {
	
	static Cuenta ctaPruebas;
	static Cuenta ctaPrueba1;
	static Cuenta ctaPrueba2;
	static Cuenta ctaTest1;
	static Cuenta ctaTest2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaTest1=new Cuenta(12345, "Ale", 50);
		ctaTest2=new Cuenta(67890, "Jose", 0);
		ctaPruebas=new Cuenta(1234, "Pepe", 0);
		ctaPrueba1=new Cuenta(1234, "Pepe", -100, new Movimiento(100, TipoMov.D, " "));
		ctaPrueba2=new Cuenta(1234, "Pepe", 100, new Movimiento(100, TipoMov.H, " "));
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
	void testRetirar() {
		ctaPruebas.retirar(100);
		List<Movimiento> mov1=ctaPrueba1.getMovimientos();
		List<Movimiento> mov2=ctaPrueba1.getMovimientos();
		Movimiento m1;
		Movimiento m2;
		assertEquals(ctaPrueba1.getSaldo(), ctaPruebas.getSaldo());
		assertEquals(ctaPrueba1.getNumCuenta(), ctaPruebas.getNumCuenta());
		assertEquals(ctaPrueba1.getTitular(), ctaPruebas.getTitular());
		if(mov1.size()==mov2.size()) {
			for(int i=0; i<mov1.size(); i++) {
				m1=mov1.get(i);
				m2=mov2.get(i);
				assertEquals(m1.getDetalle(), m2.getDetalle());
				assertEquals(m1.getImporte(), m2.getImporte());
				assertEquals(m1.getTipoMovimiento(), m2.getTipoMovimiento());
			}
		}
	}
	
	
	@Test
	void testIngresar() {
		ctaPruebas.ingresar(100);
		List<Movimiento> mov1=ctaPrueba2.getMovimientos();
		List<Movimiento> mov2=ctaPruebas.getMovimientos();
		Movimiento m1;
		Movimiento m2;
		assertEquals(ctaPrueba2.getSaldo(), ctaPruebas.getSaldo());
		assertEquals(ctaPrueba2.getNumCuenta(), ctaPruebas.getNumCuenta());
		assertEquals(ctaPrueba2.getTitular(), ctaPruebas.getTitular());
		if(mov1.size()==mov2.size()) {
			for(int i=0; i<mov1.size(); i++) {
				m1=mov1.get(i);
				m2=mov2.get(i);
				assertEquals(m1.getDetalle(), m2.getDetalle());
				assertEquals(m1.getImporte(), m2.getImporte());
				assertEquals(m1.getTipoMovimiento(), m2.getTipoMovimiento());
			}
		}
	}
	
	
	@Test
	void test0014() {
		ctaTest1.retirar(200);
		ctaTest2.retirar(350);
		ctaTest1.ingresar(100);
		//ctaTest2.retirar(200);
		ctaTest2.retirar(150);
		ctaTest1.retirar(200);
		ctaTest2.ingresar(50);
		//ctaTest2.retirar(100);
		assertEquals(-250, ctaTest1.getSaldo());
		assertEquals(-450, ctaTest2.getSaldo());
	}

}
