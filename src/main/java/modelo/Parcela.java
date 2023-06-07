package modelo;

public class Parcela {

	private int id;
	private int numero;
	private int mCuadrados;
	private int precio_dia;

	public Parcela(int id, int numero, int mCuadrados, int precio_dia) {
		super();
		this.id = id;
		this.numero = numero;
		this.mCuadrados = mCuadrados;
		this.precio_dia = precio_dia;
	}

	public Parcela() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(int mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public int getPrecio_dia() {
		return precio_dia;
	}

	public void setPrecio_dia(int precio_dia) {
		this.precio_dia = precio_dia;
	}
	

}
