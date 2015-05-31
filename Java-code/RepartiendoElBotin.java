package aceptaElReto;

import java.util.Scanner;

public class RepartiendoElBotin {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int billetes = in.nextInt();
		int personas = in.nextInt();
		while (billetes != 0 && personas != 0) {
			int[] billetesValor = new int[billetes];
			for (int i = 0; i < billetes; i++) {
				billetesValor[i] = in.nextInt();
			}
			String res = "";
			int suma = 0;
			for (int j = 0; j < personas; j++) {
				suma = 0;
				String sumas = "";
				for (int i = j; i < billetesValor.length; i += personas) {
					suma += billetesValor[i];
					sumas += " " + billetesValor[i];
				}
				System.out.println(suma + ":" + sumas);
			}
			System.out.print(res);
			System.out.println("---");
			billetes = in.nextInt();
			personas = in.nextInt();
		}
	}
}
