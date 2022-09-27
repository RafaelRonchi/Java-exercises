/*Ler 5 números (digitados pelo usuário) e armazenar em um vetor. Você deve verificar quantos
números armazenados no vetor são ímpares.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Float vet[] = new Float[5];
		Integer impar = 0;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Float.valueOf(ler.nextLine());
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				impar++;
			}
		}

		System.out.println("Impares: " + impar);
		ler.close();
	}

}
