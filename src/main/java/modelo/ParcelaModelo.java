package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ParcelaModelo extends Conector{

	public ArrayList<Parcela> mostrarParcelas() {

		String selectparcelas = "SELECT * FROM parcelas";

		ArrayList<Parcela> parcelass = new ArrayList<>();

		try {

			PreparedStatement pst = super.conexion.prepareStatement(selectparcelas);
			ResultSet resultset = pst.executeQuery();

			while (resultset.next()) {

				Parcela parcela = new Parcela();

				parcela.setId(resultset.getInt("id"));
				parcela.setNumero(resultset.getInt("numero"));
				parcela.setmCuadrados(resultset.getInt("m_cuadrados"));
				parcela.setPrecio_dia(resultset.getInt("precio_dia"));

				parcelass.add(parcela);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return parcelass;
	}
	
	public void insertarParcela(Parcela parcela) {
	
		String insertarparcel = "INSERT INTO parcelas (numero, m_cuadrados, precio_dia) VALUES (?,?,?)";
		
		try {
			
			PreparedStatement prs = super.conexion.prepareStatement(insertarparcel);
			
			prs.setInt(1, parcela.getNumero());
			prs.setInt(2, parcela.getmCuadrados());
			prs.setInt(3, parcela.getPrecio_dia());
			
			prs.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteParcela(int id) {
		
		String deleteparcel = "DELETE * FROM parcelas WHERE id=?";
		
		try {
			
			PreparedStatement pst = super.conexion.prepareStatement(deleteparcel);
			
			pst.setInt(1, id);
			
			pst.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
