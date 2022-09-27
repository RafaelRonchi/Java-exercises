/*Ler 3 números positivos (digitados pelo usuário) e armazenar em um vetor. Faça a soma de todos os
elementos armazenados e exiba.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Float vet[] = new Float[3];
		Float soma=(float) 0;
		for (int i = 0; i < vet.length; i++) {
		vet[i] = Float.valueOf(ler.nextLine());
		}
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i]; 
		}
		
		System.out.printf("Soma: %.2f",soma);
		ler.close();

	}

}
