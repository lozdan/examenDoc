package examenDocumentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Clase TestCCuenta. Utiliza funcionalidad de la clase CCuenta,
 * mediante la consola.
 * 
 * @author Daniel Gutiérrez Lozano
 * @version 1.0
 *
 */
public class TestCCuenta {
	/**	Buffer de entrada para la lectura de datos */
	private static BufferedReader dato;

	/**
	 * Método main
	 * @param args Argumentos
	 */
	public static void main(String[] args) {
		dato = new BufferedReader(new InputStreamReader(
				System.in));
		CCuenta d13gulod;

		int opcion = 0;
		d13gulod = new CCuenta("Rigoberta Piedra", "0000-6523-85-678912345",
				2500, 0);
		do {
			try {
				mostrarMenu();
				opcion = recogerOpcion(dato);

				switch (opcion) {
				case 1:
					ingresar(dato, d13gulod);
					break;
				case 2:
					retirar(dato, d13gulod);
					break;
				case 3:
					System.out.println("Aaaaaaaaaadios");
				}
			} catch (IOException ex) {
				Logger.getLogger(TestCCuenta.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		} while (opcion != 3);
		System.out.println("Saldo actual: " + d13gulod.estado());
	}

	/**
	 * Retirar dinero de una cuenta
	 * 
	 * @param dato Buffer de entrada de datos
	 * @param cuenta1 Cuenta de la que se retira el dinero
	 * @throws IOException Lanza excepción si da fallo al retirar el dinero
	 */
	private static void retirar(BufferedReader dato, CCuenta cuenta1)
			throws IOException {
		System.out.println("Indica cantidad a retirar: ");
		float retirar = Integer.parseInt(dato.readLine());
		try {
			cuenta1.retirar(retirar);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
	}

	/**
	 * Ingresa dinero en una cuenta
	 * 
	 * @param dato Buffer de entrada de datos
	 * @param cuenta1 Cuenta a la que se ingresará el dinero
	 * @throws IOException Lanza una excepción si falla al ingresar el dinero
	 */
	private static void ingresar(BufferedReader dato, CCuenta cuenta1)
			throws IOException {
		System.out.println("Indica cantidad a ingresar: ");
		float ingresar = Integer.parseInt(dato.readLine());
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(ingresar);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

	/**
	 * Recoge una opción del menú
	 * @param dato Buffer de entrada de datos
	 * @return La opción elegida
	 * @throws IOException Lanza excepción si falla al leer el buffer de entrada
	 */
	private static int recogerOpcion(BufferedReader dato) throws IOException {
		int opcion;
		opcion = Integer.parseInt(dato.readLine());
		return opcion;
	}

	/**
	 * Muestra un menú
	 */
	private static void mostrarMenu() {
		System.out.println("MENU DE OPERACIONES");
		System.out.println("-------------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Retirar");
		System.out.println("3 - Salir");
	}
}
