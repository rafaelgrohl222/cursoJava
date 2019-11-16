import java.util.Scanner;

public class lerTextoQuebraLinha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.print("Digite Nº: ");
		x = sc.nextInt();
		sc.nextLine();//digitar 1 sc.nextLine() p/ poupar a linha
		System.out.print("Digite texto 1: ");
		s1 = sc.nextLine(); //sc.nextLine(); guarda todo o texto
		System.out.print("Digite texto 2: ");
		s2 = sc.nextLine();
		System.out.print("Digite texto 3: ");
		s3 = sc.nextLine();
		
		System.out.println("");
		
		System.out.println("Dados Digitados:");
		System.out.println("Número: " + x);
		System.out.println("Texto 1: " + s1);
		System.out.println("Texto 2: " + s2);
		System.out.println("Texto 3: " + s3);
		
		sc.close();
	}

}
