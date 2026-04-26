package ExerciciosLacos;

import java.util.Scanner;

public class ExercicioZeroDW {

	public static void main(String[] args) {
		
		//Declaração das Variaveis 
		int numero, contador = 0, soma = 0;
		double media;
		
		//Permite a leitura dos dados que entra por teclado
		 Scanner leia = new Scanner(System.in);

	        do {
	    		//Entrada de dados
	            System.out.println("Digite um número (0 para parar): ");
	            numero = leia.nextInt(); // lê o número digitado

	            // verifica se é múltiplo de 3 e diferente de zero
	            if (numero != 0 && numero % 3 == 0) {
	                soma += numero; // Responsavel por soma os valores
	                contador++; // Responsavel po conta quantos números válidos existem
	            }

	            //Loop continua até o usuário digitar 0
	        } while (numero != 0);

	        // cálculo da média
	        if (contador > 0) {
	            media = (double) soma / contador; // double é responsavel força o resultado a ter casas decimais
	            System.out.println("Média dos múltiplos de 3: " + media); // mostra o resultado final com
	        } else {
	            System.out.println("Nenhum múltiplo de 3 foi digitado.");
	        }

       
    
     
            
	}
}

