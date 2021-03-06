package sintaxeBasica;

import java.util.Locale;

public class SintaxeBasica {

	public static void main(String[] args) {
		
		System.out.println("Nome Aplica��o: Sintaxe Basica");
		
		System.out.println("----------");	
		int soma = 2 + 3;
		System.out.println(soma);
		
		System.out.println("----------");
		double valor = 10.35784;
		System.out.println(valor);

		System.out.println("----------");
		System.out.println("Sintaxe de mascara de formata��o delimitar casas decimais!");
		System.out.println(" %.2f = 2 casas decimais, " + " %n ou \n = pula linha");
		System.out.printf("%.2f%n", valor);
		
		System.out.println("----------");
		System.out.println("Formatar outra lingua do teclado");
		Locale.setDefault(Locale.US);
		System.out.println("Sintaxe de mascara de formata��o delimitar casas decimais!");
		System.out.println("A separa��o � com (.)");
		System.out.printf("%.4f%n", valor);
		
		System.out.println("----------");
		System.out.println("Sintaxe de mascara de formata��o delimitar casas decimais + concatena��o!");
		System.out.printf("Resultado: %.2f mts%n", valor);
		
		System.out.println("----------");
		System.out.println("Concatena��o: ");
		System.out.println("Valor �: " + valor + "mts");
		
		System.out.println("----------");
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		System.out.println("%s = texto, %d = inteiro, %f = ponto flutuante, %n = pula linha");
		System.out.println("As vari�veis em ordem da formata��o f");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);	
	}

}
