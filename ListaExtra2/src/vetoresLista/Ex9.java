/*Ler 3 números positivos (digitados pelo usuário) e armazenar em um vetor. Faça a multiplicação de todos os
elementos armazenados e exiba.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Float vet[] = new Float[3];
	
		for (int i = 0; i < vet.length; i++) {
		vet[i] = Float.valueOf(ler.nextLine());
		}
			Float multi = vet[0];
		for (int i = 1; i < vet.length; i++) {
			multi = vet[i] * multi; 
		}
		
		System.out.printf("Soma: %.2f",multi);
		ler.close();

	}

}