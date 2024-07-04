package Evaluacion_Navarrete;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Eva_nav {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int contra = 1;
		int cont;

		List<String> nombres = new ArrayList<>();

		nombres.add("juli");
		nombres.add("lolo");
		nombres.add("lala");
		nombres.add("queso");
		nombres.add("mol");

		List<Integer> numeros = new ArrayList<>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		while (!datos.equals(contra)) {

			System.out.println("Ingrese la contraseña: ");
			contra = datos.nextInt();
		}

		for (int i = 0; i < 5; i++) {

		}
		for (Integer Integer : numeros) {

		}
		System.out.println("Programa no finalizado");

	}
}
