package ExerciciosLacos;

import java.util.Scanner;

public class ExercicioZeroDW {

	public static void main(String[] args) {
		
		int numero, contador = 0, soma = 0;
		double media;
		
		 Scanner leia = new Scanner(System.in);

	        do {
	            System.out.println("Digite um número (0 para parar): ");
	            numero = leia.nextInt();

	            // verifica se é múltiplo de 3 e diferente de zero
	            if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                contador++;
	            }

	        } while (numero != 0);

	        // cálculo da média
	        if (contador > 0) {
	            media = (double) soma / contador;
	            System.out.println("Média dos múltiplos de 3: " + media);
	        } else {
	            System.out.println("Nenhum múltiplo de 3 foi digitado.");
	        }

       
    
     
            
	}
}

