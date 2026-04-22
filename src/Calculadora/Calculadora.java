package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		float numero01, numero02; 
		int codigoOp;
		
		Scanner nm = new Scanner(System.in);
		
		System.out.println("Informe o Primeiro número: ");
		numero01 = nm.nextFloat();
		
		System.out.println("Informe o Segundo número: ");
		numero02 = nm.nextFloat();
		
		System.out.println("Informe o Código da Operação de 1 a 4: ");
		codigoOp = nm.nextInt();
		
		switch (codigoOp) {
        case 1:
            System.out.println("Resultado: " + (numero01 + numero02));
            break;

        case 2:
            System.out.println("Resultado: " + (numero01 - numero02));
            break;

        case 3:
            System.out.println("Resultado: " + (numero01 * numero02));
            break;

        case 4:
            System.out.println(numero01 / numero02);
           
        default:
            System.out.println("Operação inválida!");
    }

		
	}

}
