package pkg;

import java.util.List;

public class Cuenta2 {
	
	private String numero;
	private String titular;
	private List<Movimiento> mMovimientos;
	private double saldo;
	
	public Cuenta2(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	
	public Cuenta2(String numero, String titular, List<Movimiento> mMovimientos, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.mMovimientos = mMovimientos;
		this.saldo = saldo;
	}




	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}
	
	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void ingresar(double i) {
		this.saldo=300;		
	}


	public void retirar(double i) {
		this.saldo=0;
	}


	
}
