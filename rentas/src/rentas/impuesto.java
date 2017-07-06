package rentas;

public class impuesto {

	private int id;
	private String descripcion;
	private double alicuota;
	
	public int getId() {
		return id;
	}
	public double getAlicuota() {
		return alicuota;
	}
	public void setAlicuota(double alicuota) {
		this.alicuota = alicuota;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
