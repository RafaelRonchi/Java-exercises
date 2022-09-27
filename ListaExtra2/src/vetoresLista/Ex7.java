/*Leia cinco palavras e armazene-as em um vetor. Exiba o vetor na ordem inversa do que foi
preenchido (ou seja, comece exibindo pela última palavra).
*/
package vetoresLista;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String vet[] = new String[5];
		System.out.println("Informe as palavras: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = ler.nextLine();
		}
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(vet[i]);
			
		}

		ler.close();
	}

}
