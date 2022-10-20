//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package exercicios_iniciantes_pt1;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dife;
		
		System.out.println("Digite o valor de A, B, C e D para calcular a diferença: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dife = (a * b) - (c * d);
		
		System.out.println("A diferença é: " + dife);
		
		sc.close();

	}

}
