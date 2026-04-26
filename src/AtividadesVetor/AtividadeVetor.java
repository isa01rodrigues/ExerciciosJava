package AtividadesVetor;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		
		//Declaração das Variaveis 
		int numero;
		  boolean encontrado;

		//Permite a leitura dos dados que entra por teclado

		Scanner leia = new Scanner(System.in);
		
		//Criação do vetor e atribuição de informações 10 números não sequenciais
		int vetorNumero[] = {10, 5, 8, 20, 15, 3, 7, 12, 25, 18};
		
		System.out.println("\n\n Digite um número para buscar: ");
		  numero = leia.nextInt();
		
		 encontrado = false;
		 
		 // Percorre todas as posições
	        for (int i = 0; i < vetorNumero.length; i++) {
	        	//Faz a vereficação dos valores 
	        	if (vetorNumero[i] == numero) {
	                System.out.println("Número encontrado na posição: " + i);
	                encontrado = true;
	                break; // para o loop
	            }
	        } //  // Caso não encontre
	        if (!encontrado) {
	            System.out.println("Não foi encontrado!");
	        }
		  
		// Exibe o tamanho da lista (numero de elementos)
	        System.out.println("\nO vetor possui " + vetorNumero.length + " posições.");
	}

}
