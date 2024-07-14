package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Problema numeros_pares

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdNumPar = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vectNum = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vectNum[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if (vectNum[i] % 2 == 0) {
				System.out.printf("%d ", vectNum[i]);
				qtdNumPar++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d",qtdNumPar);
		sc.close();

	}

}
