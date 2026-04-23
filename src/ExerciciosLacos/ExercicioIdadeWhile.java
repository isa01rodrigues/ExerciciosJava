package ExerciciosLacos;

import java.util.Scanner;

public class ExercicioIdadeWhile {

	public static void main(String[] args) {
		
		//Declaração das Variaveis 
		int idade, idade1 = 0, idade2 =0;
		
		//Permite a leitura dos dados que entra por teclado
        Scanner ide = new Scanner(System.in);
        
        
        System.out.println("Digite sua idade: ");
        idade = ide.nextInt();  // lê o número digitado

        // Loop executa enquanto a idade for maior ou igual a 0
        while (idade >= 0) {

            // Contagem de pessoas menores de 21 anos
            if (idade < 21) {
                idade1++;
            }
            // Contagem de pessoas maiores de 50 anos
            if (idade > 50) {
                idade2++;
            }

            System.out.println("Digite sua idade: ");
            idade = ide.nextInt();
        }
        // Exibe o total de pessoas em cada faixa etária
        System.out.println("Menores de 21: " + idade1);
        System.out.println("Maiores de 50: " + idade2);

	}

}


