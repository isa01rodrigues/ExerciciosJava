package HorasExtra;

import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
		 float salario, adcNorturno, horasExtr, desconto;
		 
		 System.out.print("Digite o salário: ");
	        salario = sc.nextFloat();

	        System.out.print("Digite o Adicional Noturno ");
	        adcNorturno = sc.nextFloat();

	        System.out.print("Digite o valor das Horas Extras: ");
	        horasExtr = sc.nextFloat();

	        System.out.print("Digite o valor do Desconto: ");
	        desconto = sc.nextFloat();
	        
	        float valorTotalSalario = salario + adcNorturno + (horasExtr * 5) - desconto ;
	        
	        System.out.println("Salário líquido: " + valorTotalSalario);

	        sc.close();
		 


	}

}
