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
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas=new Cuenta(12345, "Pepe", 0);
		ctaPrueba1=new Cuenta(12345, "Pepe", 0, new Movimiento(100, TipoMov.D, " "));
		ctaPrueba2=new Cuenta(12345, "Pepe", 100, new Movimiento(100, TipoMov.H, " "));
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

}
