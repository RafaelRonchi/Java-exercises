/* Ler 3 números (digitados pelo usuário) e armazenar em um vetor. Em seguida, exiba no console
todos os números armazenados.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Float vet[] = new Float[3];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Float.valueOf(ler.nextLine());
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("\n" + vet[i]);

		}

		ler.close();
	}

}
