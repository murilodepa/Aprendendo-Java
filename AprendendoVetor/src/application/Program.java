package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		System.out.println("");
		
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite uma altura: ");
			vetor[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vetor[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}
}