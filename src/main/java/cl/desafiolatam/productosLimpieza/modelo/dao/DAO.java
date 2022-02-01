package cl.desafiolatam.productosLimpieza.modelo.dao;

import java.util.List;

public interface DAO <Clase, tipoID>{

	public List<Clase> listar();
	public Clase buscarPorId(tipoID id);
	public int insert(Clase objeto);
	public int update(Clase objeto);
	public int delete(tipoID id);
	
}
