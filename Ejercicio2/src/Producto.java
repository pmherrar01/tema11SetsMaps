import java.util.Scanner;

public class Producto {

	private String nombreProducto;
	private float precio;
	private int stock;
	
	public Producto() {
		this.nombreProducto = "";
		this.precio = 0;
		this.stock = 0;
	}
	
	public Producto(String nombreProducto, float precio, int stock) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
