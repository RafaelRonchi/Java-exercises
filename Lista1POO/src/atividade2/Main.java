/*Considere uma classe “Animal” sem método main com três atributos públicos: nomeCientifico
(String), familia (String) e reino (String). Se você quisesse definir na classe “Animal” uma variável
para armazenar cinco nomes populares deste animal, qual variável seria, de que tipo e por quê?
OBS: Você deve implementar este código para poder visualizar o problema.
*/
package atividade2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Scanner ler = new Scanner(System.in);
		System.out.println("Difina 5 nomes poplares para os animais: ");

		//teria de ser definido no nome como um arraylist de string no objeto
		ler.close();
	}

}
