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




@WebServlet("/Categorias")
public class ListarCategorias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public ListarCategorias() {
        super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Facade facade =new Facade();
		List<CategoriaDTO> categorias = facade.listarCategoria();	
		request.setAttribute("categorias", categorias);
		request.getServletContext().getRequestDispatcher("/listarCategorias.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
