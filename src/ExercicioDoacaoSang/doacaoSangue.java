package ExercicioDoacaoSang;

import java.util.Scanner;

public class doacaoSangue {

	public static void main(String[] args) {

		String nome ;
		int idade;
		
		Scanner dc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?: ");
		nome = dc.nextLine();
		
		System.out.println("Qual sua idade?: ");
		idade = dc.nextInt();
		
		System.out.println("É a sua Primeira doação de sangue? : ");
		boolean primeiraDoacao = dc.nextBoolean(); // método responsável por ler um valor booleano (true/false)
		
	
        if (idade < 18 || idade > 69) {
            System.out.println(nome + " não está apto para doar sangue!");
        } 
        else if (idade >= 60 && primeiraDoacao) {
            System.out.println(nome + " não está apto para doar sangue!");
        } 
        else {
            System.out.println(nome + " está apto para doar sangue!");
        }

		
	}

}
