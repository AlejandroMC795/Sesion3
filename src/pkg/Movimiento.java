package pkg;

public class Movimiento {
	
	public enum Movimientos{D, H};
	
	private double importe;
	//private String detalle;
	private Movimientos TipoMovimiento;
	
	public Movimiento(double importe, Movimientos tipoMovimiento) {
		super();
		this.importe = importe;
		TipoMovimiento = tipoMovimiento;
	}
} 
