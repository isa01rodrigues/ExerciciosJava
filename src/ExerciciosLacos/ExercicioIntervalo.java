package ExerciciosLacos;

import java.util.Scanner;

public class ExercicioIntervalo {

	public static void main(String[] args) {

		//Declaração das Variaveis 
		int contador, numero ,numero1 = 0, numero2 = 0, i ;
		
		//Permite a leitura dos dados que entra por teclado
        Scanner in = new Scanner(System.in);
        
        // Solicita a entrada de dois números 
        for (contador = 1;  contador <= 2; contador++) {
        	
            System.out.println("\nDigite um número inteiro: "); 
            numero = in.nextInt(); // lê o número digitado
            
            
            if (contador == 1) {
                numero1 = numero; // armazena o primeiro número
            } else {
                numero2 = numero;  // armazena o segundo número
            }
            
        }
        
        // o primeiro número deve ser menor que o segundo
        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido!"); // Mensage de Erro 
            in.close();
            return;
        }

        // O i  Percorre o intervalo entre numero1 e numero2
        for ( i = numero1; i <= numero2; i++) {
        	//responsável de  verifica se o número é múltiplo de 15 (3 e 5)
            if (i % 15 == 0) {
                System.out.println(i);
            }

	}

	}
}
