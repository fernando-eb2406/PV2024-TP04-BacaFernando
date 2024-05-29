package ar.edu.unju.fi.model;

public class Carrera {

	private String  codigo;
	private String  nombre;
	private Integer cantidadAños;
	private Byte estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(String codigo, String nombre, Integer cantidadAños, Byte estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAños = cantidadAños;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadAños() {
		return cantidadAños;
	}

	public void setCantidadAños(Integer cantidadAños) {
		this.cantidadAños = cantidadAños;
	}

	public Byte getEstado() {
		return estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombre=" + nombre + ", cantidadAños=" + cantidadAños + ", estado="
				+ estado + "]";
	}
	
}
