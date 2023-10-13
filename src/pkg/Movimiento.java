package pkg;

public class Movimiento {

	public enum TipoMov{H,D}
	
	private TipoMov tipoMovimiento;
	private String detalle;
	private double importe;
	
	public Movimiento(double importe ,TipoMov tipoMovimiento, String detalle) {
		super();
		this.tipoMovimiento = tipoMovimiento;
		this.detalle = detalle;
		this.importe = importe;
	}
	
	public TipoMov getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMov tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
} 
