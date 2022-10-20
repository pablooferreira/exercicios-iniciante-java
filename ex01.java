//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números 

package exercicios_iniciantes_pt1;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.println("Digite o primeiro número inteiro: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.printf("A soma dos números é: " + soma);
		
		
		sc.close();
	}

}
