package modelo;

import java.util.Date;

public class Reserva {

	private int idReserva;
	private String nombreUser;
	private String apellidoUser;
	private String DNIUser;
	private int numerPersonas;
	private Date inicioReserva;
	private Date finReserva;
	private Date fechaReserva;
	private Boolean luz;
	private int idParcela;

	public Reserva(int idReserva, String nombreUser, String apellidoUser, String dNIUser, int numerPersonas,
			Date inicioReserva, Date finReserva, Date fechaReserva, Boolean luz, int idParcela) {
		super();
		this.idReserva = idReserva;
		this.nombreUser = nombreUser;
		this.apellidoUser = apellidoUser;
		DNIUser = dNIUser;
		this.numerPersonas = numerPersonas;
		this.inicioReserva = inicioReserva;
		this.finReserva = finReserva;
		this.fechaReserva = fechaReserva;
		this.luz = luz;
		this.idParcela = idParcela;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreUser() {
		return nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	public String getApellidoUser() {
		return apellidoUser;
	}

	public void setApellidoUser(String apellidoUser) {
		this.apellidoUser = apellidoUser;
	}

	public String getDNIUser() {
		return DNIUser;
	}

	public void setDNIUser(String dNIUser) {
		DNIUser = dNIUser;
	}

	public int getNumerPersonas() {
		return numerPersonas;
	}

	public void setNumerPersonas(int numerPersonas) {
		this.numerPersonas = numerPersonas;
	}

	public Date getInicioReserva() {
		return inicioReserva;
	}

	public void setInicioReserva(Date inicioReserva) {
		this.inicioReserva = inicioReserva;
	}

	public Date getFinReserva() {
		return finReserva;
	}

	public void setFinReserva(Date finReserva) {
		this.finReserva = finReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Boolean getLuz() {
		return luz;
	}

	public void setLuz(Boolean luz) {
		this.luz = luz;
	}

	public int getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(int idParcela) {
		this.idParcela = idParcela;
	}

}
