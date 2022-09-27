/*Ler 6 números (digitados pelo usuário) e armazenar em um vetor. Você deve verificar qual o menor
número e qual o maior número armazenados no vetor.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Float vet[] = new Float[6];
		Float menor = (float) 999;
		Float maior = (float) 0;
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Float.valueOf(ler.nextLine());
		}
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i]>maior){
				maior = vet[i];
			} else if (vet[i]<menor) {
				menor = vet[i];
			}
		}
		
		System.out.println("Menor: "+ menor);
		System.out.println("Maior: "+maior);
		
		ler.close();
	}

}
