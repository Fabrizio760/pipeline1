
public class Vehiculo {
	
	private String modelo;
	private Tipo tipo;
	private String color;
	private int kilometraje;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setPrecio(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public Vehiculo(String modelo, Tipo tipo, String color, int kilometraje) {
		
		this.modelo = modelo;
		this.tipo = tipo;
		this.color = color;
		this.kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", kilometraje=" + kilometraje + "]";
	}
	
	
	

}
