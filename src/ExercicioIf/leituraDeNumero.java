package ExercicioIf;

import java.util.Scanner;

public class leituraDeNumero {

	public static void main(String[] args) {
	
		int numero;
		Scanner numb = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = numb.nextInt();
		
		String tipoNumero;
		if (numero % 2 == 0) {
			tipoNumero = "par";
		}else {
			tipoNumero = "impar";
		}
		
		String sinalOp;
		if(numero >= 0) {
			sinalOp = "positivo";
		}else {
			sinalOp = "Negativo";
		}
		
		System.out.println("O Número " + numero + " é " + tipoNumero + " e " + sinalOp + "!");

	}
	}


