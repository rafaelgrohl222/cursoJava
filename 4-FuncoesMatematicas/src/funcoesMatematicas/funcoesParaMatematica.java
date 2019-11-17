package funcoesMatematicas;

public class funcoesParaMatematica {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		System.out.println("------Raiz Quadrada------");
		A = Math.sqrt(x);// Math.sqrt = raiz quadrada
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de: " + x + " = " + A);
		System.out.println("Raiz quadrada de: " + y + " = " + B);
		System.out.println("Raiz quadrada de 25: " + C);
		
		System.out.println("");//espaço
		
		System.out.println("------Potênciação------");
		A = Math.pow(x, y);// Math.pow = potenciação (x, y)x elevado a y
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado é " + B);
		System.out.println("5 elevado ao quadrado é " + C);
		
		System.out.println("");
		
		System.out.println("------Valor Absoluto------");
		A = Math.abs(y);// Math.abs = retira o valor negativo
		B = Math.abs(z);
		System.out.println("Valor Absoluto de " + y + " = " + A);
		System.out.println("Valor Absoluto de " + z + " = " + B);
		
		System.out.println("");
		/*
		System.out.println("------Funções em Epressões Maiores------");
		System.out.println("mais informações de expressões: java.lang.Math");
		double x1 = 2.0;
		double a = 3;
		double b = 1;
		x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		System.out.println(x1);
		*/
	}

}
