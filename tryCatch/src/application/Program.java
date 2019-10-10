package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] vetor = sc.nextLine().split(" ");
		int position = sc.nextInt();	
		System.out.println(vetor[position]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		
		catch (InputMismatchException e) {
			System.out.println("Input errorn!");
		}
		
		System.out.println("End of program");
		
		sc.close();

	}

}
