package cl.desafiolatam.productosLimpieza.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.productosLimpieza.conection.Conexion;
import cl.desafiolatam.productosLimpieza.modelo.dto.CategoriaDTO;


public class CategoriaDAO implements DAO<CategoriaDTO, Integer>{

	Conexion cnn = new Conexion();
	
	@Override
	public List<CategoriaDTO> listar() {
		List<CategoriaDTO> categorias = new ArrayList<CategoriaDTO>();
		Connection conexion = null;
		String consultaSql = "SELECT * FROM categoria";
		
		try {
			conexion = cnn.getConexion();
			PreparedStatement ps = conexion.prepareStatement(consultaSql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CategoriaDTO categoria = new CategoriaDTO();
				categoria.setIdCategoria(rs.getInt("id_categoria"));
				categoria.setNombreCategoria(rs.getString("nombre_categoria"));
				categorias.add(categoria);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categorias;
	}

	@Override
	public CategoriaDTO buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CategoriaDTO objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CategoriaDTO objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
