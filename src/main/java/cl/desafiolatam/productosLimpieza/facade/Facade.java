package cl.desafiolatam.productosLimpieza.facade;

import java.util.List;

import cl.desafiolatam.productosLimpieza.modelo.dao.CategoriaDAO;
import cl.desafiolatam.productosLimpieza.modelo.dao.ProductoDAO;
import cl.desafiolatam.productosLimpieza.modelo.dto.CategoriaDTO;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;

public class Facade {

	ProductoDAO productoDao = new ProductoDAO();
	CategoriaDAO categoriaDao = new CategoriaDAO();
	
	public List<ProductoDTO> listarProductos() {
		return productoDao.listar();

	}

	public List<CategoriaDTO> listarCategoria() {
		return categoriaDao.listar();

	}

	public ProductoDTO buscarPorIdProducto(int id) {
		return productoDao.buscarPorId(id);

	}

	public int insertarProducto(ProductoDTO objeto) {
		return productoDao.insert(objeto);
		
	}

	public int eliminarProducto(Integer id) {
		return productoDao.delete(id);
		
	}

	public int actualizarProducto(ProductoDTO objeto) {
		return productoDao.update(objeto);
		
	}
}
