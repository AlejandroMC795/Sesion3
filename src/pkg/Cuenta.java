package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.TipoMov;


public class Cuenta {
	
	private double saldo;
	private double numCuenta;
	private String titular;
	private List<Movimiento> movimientos = new ArrayList<Movimiento>();;

	public Cuenta(double numCuenta, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
	}

	public Cuenta(double numCuenta, String titular, double saldo, Movimiento m) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.movimientos.add(m);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(double numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public void ingresar(double i) {
		this.setSaldo(100);
		this.setNumCuenta(12345);
		this.setTitular("Pepe");
		this.movimientos.clear();
		this.movimientos.add(new Movimiento(100, TipoMov.H, " "));
	}

	public void retirar(int i) {
		this.setSaldo(-100);
		this.setNumCuenta(12345);
		this.setTitular("Pepe");
		this.movimientos.clear();
		this.movimientos.add(new Movimiento(100, TipoMov.D, " "));		
	}
	

	
	
	

	

}
