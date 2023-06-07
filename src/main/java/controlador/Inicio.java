package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Parcela;
import modelo.ParcelaModelo;


@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Inicio() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ParcelaModelo bbddparcela = new ParcelaModelo();
		
		ArrayList<Parcela> parcelas = bbddparcela.mostrarParcelas();
		
		bbddparcela.cerrarConexion();
		
		request.setAttribute("parcelas", parcelas);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ParcelaModelo bbddparcela = new ParcelaModelo();
		
		int numero = Integer.parseInt(request.getParameter("nparcela"));
		int metros = Integer.parseInt(request.getParameter("mparcela"));
		int precio = Integer.parseInt(request.getParameter("pparcela"));
		
		Parcela parcela = new Parcela();
		
		parcela.setNumero(numero);
		parcela.setmCuadrados(metros);
		parcela.setPrecio_dia(precio);
		
		bbddparcela.insertarParcela(parcela);
		
		bbddparcela.cerrarConexion();
		
		response.sendRedirect("Inicio");
		
	}

}
