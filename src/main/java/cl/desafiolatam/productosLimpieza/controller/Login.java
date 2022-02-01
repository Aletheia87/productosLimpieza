package cl.desafiolatam.productosLimpieza.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public Login() {
        super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="Admin";
		String pass="123456";
		String usuario=request.getParameter("user");
		String clave=request.getParameter("password");
		
		if (usuario.equals(user) && clave.equals(pass)) {
			request.getServletContext().getRequestDispatcher("/Inicio").forward(request, response);	
		}else {
			doGet(request, response);
		}

	}

}
