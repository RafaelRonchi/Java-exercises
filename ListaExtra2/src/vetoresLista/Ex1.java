//Ler 3 nomes (digitados pelo usuário) e exibir no console todos eles.
package vetoresLista;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String vet[] = new String[3];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = ler.nextLine();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("\n" + vet[i]);

		}

		ler.close();

	}

}
