package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double salario = sc.nextDouble();
		Double imposto;
		if(salario > 0.00 && salario <= 2000.00 ) {
			System.out.println("Isento");
		}else if(salario <= 3000.00) {
			imposto  = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else if(salario <= 4500.00 ) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else{
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
	}

}
