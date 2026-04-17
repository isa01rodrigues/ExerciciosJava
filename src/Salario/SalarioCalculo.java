package Salario;

import java.util.Scanner;

public class SalarioCalculo {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        float salario, abono;

	        System.out.print("Digite o salário: ");
	        salario = sc.nextFloat();

	        System.out.print("Digite o abono: ");
	        abono = sc.nextFloat();

	        float novoSalario = salario + abono;

	        System.out.println("Novo salário: " + novoSalario);

	        sc.close();
	    
	}

}
