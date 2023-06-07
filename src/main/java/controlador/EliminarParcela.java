package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ParcelaModelo;

@WebServlet("/EliminarParcela")
public class EliminarParcela extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EliminarParcela() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		ParcelaModelo bbddparcela = new ParcelaModelo();

		bbddparcela.deleteParcela(id);

		bbddparcela.cerrarConexion();
		
		response.sendRedirect("Inicio");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		

		
		*/
	}

}
