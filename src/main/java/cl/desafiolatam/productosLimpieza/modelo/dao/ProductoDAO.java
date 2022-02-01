package cl.desafiolatam.productosLimpieza.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.productosLimpieza.conection.Conexion;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;


public class ProductoDAO implements DAO<ProductoDTO, Integer> {

	Conexion cnn = new Conexion();
	
	@Override
	public List<ProductoDTO> listar() {
		
		List<ProductoDTO> productos = new ArrayList<ProductoDTO>();
		Connection conexion = null;
		String consultaSql ="SELECT id_producto, nombre_producto, precio_producto, descripcion_producto, nombre_categoria FROM producto JOIN categoria ON producto.id_categoria=categoria.id_categoria";
				
		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductoDTO producto = new ProductoDTO();
				producto.setIdProducto(rs.getInt("id_producto"));
				producto.setNombreProducto(rs.getString("nombre_producto"));
				producto.setPrecioProducto(rs.getInt("precio_producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_producto"));
				producto.setNombreCategoria(rs.getString("nombre_categoria"));
				productos.add(producto);
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productos;

	}

	@Override
	public ProductoDTO buscarPorId(Integer id) {
		ProductoDTO producto = new ProductoDTO();
		Connection conexion = null;
		int registrosAfectados = 0;
		String consultaSql = "SELECT * FROM  producto WHERE id_producto=?";

		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				producto.setIdProducto(rs.getInt("id_producto"));
				producto.setNombreProducto(rs.getString("nombre_producto"));
				producto.setPrecioProducto(rs.getInt("precio_producto"));
				producto.setDescripcionProducto(rs.getString("descripcion_producto"));
				producto.setIdCategoria(rs.getInt("id_categoria"));
			}
			if (registrosAfectados != 1) {
				throw new Exception("Error al actualizar el producto");
			}
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return producto;

	}

	@Override
	public int insert(ProductoDTO objeto) {
		Connection conexion = null;
		int registros = 0;
		String consultaSql = "INSERT INTO producto (id_producto, nombre_producto, precio_producto, descripcion_producto, id_categoria)" + "VALUES(?,?,?,?,?)";

		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ps.setInt(1, objeto.getIdProducto());
			ps.setString(2, objeto.getNombreProducto());
			ps.setInt(3, objeto.getPrecioProducto());
			ps.setString(4, objeto.getDescripcionProducto());
			ps.setInt(5, objeto.getIdCategoria());
			registros = ps.executeUpdate();

			if (registros != 1) {
				throw new Exception("Error al insertar el producto");
			}
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public int update(ProductoDTO objeto) {
		Connection conexion = null;
		int registros = 0;
		String consultaSql = "UPDATE producto SET nombre_producto=?, precio_producto=?, descripcion_producto=?, id_categoria=? WHERE id_producto=?";

		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ps.setString(1, objeto.getNombreProducto());
			ps.setInt(2, objeto.getPrecioProducto());
			ps.setString(3, objeto.getDescripcionProducto());
			ps.setInt(4, objeto.getIdCategoria());
			ps.setInt(5, objeto.getIdProducto());
			registros = ps.executeUpdate();

			if (registros != 1) {
				throw new Exception("Error al actualizar el producto");
			}
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return registros;

	}

	@Override
	public int delete(Integer id) {
		Connection conexion = null;
		int registros = 0;
		String consultaSql = "DELETE FROM producto WHERE id_producto=?";

		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ps.setInt(1, id);
			registros = ps.executeUpdate();

			if (registros != 1) {
				throw new Exception("Error al eliminar el producto");
			}
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registros;

	}

}
