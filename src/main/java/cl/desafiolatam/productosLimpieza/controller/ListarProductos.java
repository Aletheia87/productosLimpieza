package cl.desafiolatam.productosLimpieza.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.productosLimpieza.facade.Facade;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;


@WebServlet("/Inicio")
public class ListarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public ListarProductos() {
        super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Facade facade = new Facade();
		List<ProductoDTO> productos = facade.listarProductos();
		request.setAttribute("productos", productos);
		request.getServletContext().getRequestDispatcher("/listarProductos.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
