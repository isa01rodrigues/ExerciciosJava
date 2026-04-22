package ExercicioLanchonete;

import java.util.Scanner;

public class exercicioLanche {

	public static void main(String[] args) {
		
		int codigoProdut, quantidadeProdut;
		
		String produto = "";
		double preco = 0;

		Scanner pr = new Scanner(System.in);
		
		System.out.println("Informe a Quantidade: ");
		quantidadeProdut = pr.nextInt();
		
		System.out.println("Informe o Código: ");
		codigoProdut = pr.nextInt();
		
		switch (codigoProdut) {
        case 1:
            produto = "Cachorro Quente";
            preco = 10.00;
            break;

        case 2:
            produto = "X-Salada";
            preco = 15.00;
            break;

        case 3:
            produto = "X-Bacon";
            preco = 18.00;
            break;

        case 4:
            produto = "Bauru";
            preco = 12.00;
            break;

        case 5:
            produto = "Refrigerante";
            preco = 8.00;
            break;

        case 6:
            produto = "Suco de laranja";
            preco = 13.00;
            break;

        default:
            System.out.println("Código inválido!");
            return; 
    }

		
    double total = quantidadeProdut * preco;

 
    System.out.println("Produto: " + produto);
    System.out.printf("Valor total: R$ %.2f%n", total);

		
		
	}

}
