package cl.desafiolatam.productosLimpieza.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.productosLimpieza.facade.Facade;
import cl.desafiolatam.productosLimpieza.modelo.dto.CategoriaDTO;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;


@WebServlet("/EditarProducto")
public class EditarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditarProducto() {
        super();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Facade facade= new Facade();
		Integer idProducto=Integer.parseInt(request.getParameter("idProducto"));
		ProductoDTO producto=facade.buscarPorIdProducto(idProducto);
		List<CategoriaDTO> categorias=facade.listarCategoria();
		request.setAttribute("producto", producto);
		request.setAttribute("categorias", categorias);
		
		request.getServletContext().getRequestDispatcher("/editarProducto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
