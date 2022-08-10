package program;

/*
beecrowd | 1042 - Sort Simples

Leia 3 valores inteiros e ordene-os em ordem crescente. No final,
mostre os valores em ordem crescente, uma linha em branco e em seguida,
os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a < b & a < c) {
			System.out.println(a);
			if(b < c) System.out.printf("%d\n%d\n", b, c);
			else System.out.printf("%d\n%d\n", c, b);
		}
		
		if(b < a & b < c) {
			System.out.println(b);
			if(a < c) System.out.printf("%d\n%d\n", a, c);
			else System.out.printf("%d\n%d\n", c, a);
		}
		
		if(c < b & c < a) {
			System.out.println(c);
			if(a < b) System.out.printf("%d\n%d\n", a, b);
			else System.out.printf("%d\n%d\n", b, a);
		}
		System.out.printf("\n%d\n%d\n%d\n", a, b, c);
		sc.close();
	}
}
