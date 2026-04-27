package AtividadeColletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeArrayList {

	public static void main(String[] args) {

		String Cor;

		// Cria a Collection, Lista com o tipo String com o nome cores
		ArrayList<String> cores = new ArrayList<String>();

		//
		Scanner leia = new Scanner(System.in);

		// Loop responsavel para pedir as cincocores

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite a " + i + "ª cor: ");
			Cor = leia.next(); // lê a palavra digitada
			cores.add(Cor);
		}

		// Responsavel por Mostrar as cores
		System.out.println("\nLista de cores:");
		for (String c : cores) {
			System.out.println("- " + c);
		}

		// Responsavel de Ordenar a lista
		Collections.sort(cores);

		System.out.println("\nLista em ordem crescente:");
		for (String c : cores) {
			System.out.println("- " + c);
		}
	}

}
