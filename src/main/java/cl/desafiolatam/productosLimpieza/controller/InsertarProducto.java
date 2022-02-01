package cl.desafiolatam.productosLimpieza.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.productosLimpieza.facade.Facade;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;



@WebServlet("/insertarProductos")
public class InsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public InsertarProducto() {
        super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/insertarProducto.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Facade facade = new Facade();
		ProductoDTO producto = new ProductoDTO();
		producto.setIdProducto(facade.listarProductos().size()+1);
		producto.setNombreProducto(request.getParameter("nombreProducto"));
		producto.setPrecioProducto(Integer.parseInt(request.getParameter("precioProducto")));
		producto.setDescripcionProducto(request.getParameter("descripcionProducto"));
		producto.setIdCategoria(Integer.parseInt(request.getParameter("categoriaProducto")));
		facade.insertarProducto(producto);
		
		request.getRequestDispatcher("/Inicio").forward(request, response);
	}

}
