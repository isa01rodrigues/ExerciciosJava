package AtividadeColletion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeCollectionSet {

	public static void main(String[] args) {
		
		int numero;
		
		//Permite a leitura dos dados que entra por teclado
		Scanner leia = new Scanner(System.in);

		 // Criação do Set (não permite repetidos)
        Set<Integer> numeros = new HashSet<>();


        // Entrada de 10 números
        while (numeros.size() < 10) {

            System.out.println("Digite um número inteiro: ");
            numero = leia.nextInt();

            // Adiciona no Set
            if (numeros.add(numero)) {
                System.out.println("Número adicionado!");
            } else {
                System.out.println("Número repetido! Digite outro.");
            }
        }

        // Exibição com Iterator
        System.out.println("\nElementos do Set:");

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		
	}

}
