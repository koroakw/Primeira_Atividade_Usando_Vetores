package program;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos números você vai digitar? " );
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0;i<vect.length;i++) {
			vect[i] = sc.nextDouble();
			
		}
		double num = 0;
		System.out.println("Números Negativos: ");
		for (int i=0;i<vect.length; i++) {
			num = vect[i];
			if (num<0) {	
				System.out.println(num);
			
			}
			}
		
		
		
		
		
		
		sc.close();
		}

}
