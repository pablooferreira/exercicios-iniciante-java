//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

package exercicios_iniciantes_pt1;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double vh, s;
		
		System.out.println("Digite o seu número: ");
		n = sc.nextInt();
		System.out.println("Digite suas horas trabalhadas: ");
		h = sc.nextInt();
		System.out.println("Digite quanto vale a sua hora: ");
		vh = sc.nextDouble();
		
		s = vh * h;
		
		System.out.printf("Seu número é %d, e o seu salário é %.2f%n", n, s);
		
		
		sc.close();
	}

}
