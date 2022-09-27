/*Ler 5 números (digitados pelo usuário) e armazenar em um vetor. Você deve verificar quantos
números armazenados no vetor são pares.
*/
package vetoresLista;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer vetor[] = new Integer[5];
		Integer par = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(ler.nextLine());
			if (vetor[i]%2==0) {
				par++;
			}
		}
		
		System.out.println("Valores pares: " + par);
		
		
		ler.close();
	}

}
