package examenDocumentacion;

/**
 * Clase CCuenta que permite gestionar una cuenta bancaria
 * 
 * @author Daniel Gutiérrez Lozano
 * @version 1.0
 *
 */
public class CCuenta {
	/** Nombre del titular de la cuenta */
	private String nombre;
	
	/** Número de cuenta */
	private String cuenta;
	
	/** Saldo de la cuenta */
	private double saldo;
	
	/** Tipo de interés de la cuenta */
	private double tipoInteres;

	/**
	 * Crea una instancia de CCuenta
	 * 
	 * @param nom Nombre del titular
	 * @param cue Numero de cuenta
	 * @param sal Saldo
	 * @param tipo Tipo de interés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
		setTipoInteres(tipo);
	}

	/**
	 * Obtiene el estado de la cuenta
	 * @return El estado (saldo)
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Ingresa una cantidad en cuenta
	 * 
	 * @param cantidad La cantidad a ingresar
	 * @throws Exception Si la cantidad es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Retira una cantidad de la cuenta
	 * 
	 * @param cantidad La cantidad a retirar
	 * @throws Exception Si la cantidad es negativa
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Modifica el saldo
	 * 
	 * @param saldo Saldo nuevo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el nombre del titular
	 * @return el nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del titular
	 * @param nombre el nombre
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el número de cuenta
	 * @return el número de cuenta
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * Modifica el número de cuenta
	 * @param cuenta El número nuevo
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtiene el saldo actual de la cuenta
	 * @return el saldo
	 */
	double getSaldo() {
		return saldo;
	}

	/**
	 * Obtiene el tipo de interés actual de la cuenta
	 * @return el tipo de interés
	 */
	double getTipoInteres() {
		return tipoInteres;
	}

	/** Modifica el tipo de interés de la cuenta
	 * @param tipoInteres El tipo nuevo
	 */
	void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
