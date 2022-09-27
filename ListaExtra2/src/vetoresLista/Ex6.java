/*Leia uma palavra (String) e transforme-a em um vetor de char (char[]) usando o método
.toCharArray(). Verifique quantas vogais existem neste vetor.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a palavra: ");
		String palavra = ler.nextLine();
		ler.close();

		char vet[] = palavra.toCharArray();
		Integer vogais = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if ( vet[i]=='a' || vet[i]== 'e' || vet[i]== 'i' || vet[i]=='o' || vet[i]=='u') {
				vogais++;
			}
		}
		
		System.out.println("Vogais: "+vogais);
	}
	
}
