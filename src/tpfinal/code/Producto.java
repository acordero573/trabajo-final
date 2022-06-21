package tpfinal.code;

import java.sql.Date;

public class Producto<Date> {
	private Integer id;
    private String nombre;
    private Date f_venc;
    private Double precio;
    private Integer stock;
    
  //Codigo que soluciona la implementación de la clase "Producto"
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getF_venc() {
		return f_venc;
	}
	public void setF_venc(Date f_venc) {
		this.f_venc = f_venc;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
    
    
    
	
    
    
    
    
}
