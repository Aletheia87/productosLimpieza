package cl.desafiolatam.productosLimpieza.modelo.dto;

public class ProductoDTO {

	private Integer idProducto;
	private String nombreProducto;
	private Integer precioProducto;
	private String descripcionProducto;
	private Integer idCategoria;
	private String nombreCategoria;
	
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Integer getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	
}
