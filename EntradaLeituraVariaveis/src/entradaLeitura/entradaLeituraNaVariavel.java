package entradaLeitura;

import java.util.Locale;
import java.util.Scanner;

public class entradaLeituraNaVariavel {
	
	public static void main(String[] args) {
	
	System.out.println("Aplica��o: Entrada e leitura de dados em vari�veis");
	System.out.println("");
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	String nome;
	int idade;
	char sexo;
	double salario; 
	
	System.out.print("Inserir Nome: ");
	nome = sc.next(); //guarda dados string
	
	System.out.print("Inserir Idade: ");
	idade = sc.nextInt(); //guarda dados inteiro
	
	System.out.print("Inserir Sexo: M=Masculino e F=Feminino: ");
	sexo = sc.next().charAt(0);//guarda o 1� caracter .charAt(0);
	
	System.out.println(" Inserir Sal�rio");
	salario = sc.nextDouble(); //guarda dados double
	
	System.out.println("");//espa�o
	
	
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Sexo:" + sexo);
	System.out.printf("Sal�rio: %.2f%n", + salario);
	//printf "%.2f" = 0,00 2 casas decimais
	//printf "%n" = pula linha
	
	
	sc.close();
	}
}
