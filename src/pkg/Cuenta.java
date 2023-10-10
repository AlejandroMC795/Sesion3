package pkg;

public class Cuenta {
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void retirar(double i) {
		if((this.getSaldo()-i)>-500)
			this.setSaldo(this.getSaldo()-i);

	}

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	

}
