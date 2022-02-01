package cl.desafiolatam.productosLimpieza.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.productosLimpieza.facade.Facade;
import cl.desafiolatam.productosLimpieza.modelo.dto.ProductoDTO;


@WebServlet("/ActualizarProducto")
public class ActualizarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ActualizarProducto() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Facade facade = new Facade();
		int idProducto= Integer.parseInt(request.getParameter("idProducto"));
		String nombreProducto= request.getParameter("nombreProducto");
		int precioProducto= Integer.parseInt(request.getParameter("precioProducto"));
		String descripcionProducto= request.getParameter("descripcionProducto");
		int categoriaProducto= Integer.parseInt(request.getParameter("categoriaProducto"));
		ProductoDTO producto= new ProductoDTO();
		producto.setIdProducto(idProducto);
		producto.setNombreProducto(nombreProducto);
		producto.setPrecioProducto(precioProducto);
		producto.setDescripcionProducto(descripcionProducto);
		producto.setIdCategoria(categoriaProducto);
		facade.actualizarProducto(producto);
		
		request.getServletContext().getRequestDispatcher("/Inicio").forward(request, response);
	}

}
