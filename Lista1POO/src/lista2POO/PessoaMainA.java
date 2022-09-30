package lista2POO;

import java.util.Scanner;

public class PessoaMainA {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Scanner ler = new Scanner(System.in);

		pessoa1.nome = "Rafael";
		pessoa1.cpf = (long) 12345;
		pessoa1.dataNascimento = "01/01/2006";

		pessoa2.nome = "Eduardo";
		pessoa2.cpf = (long) 1234567;
		pessoa2.dataNascimento = "01/01/2006";

		pessoa3.nome = "Ronchi";
		pessoa3.cpf = (long) 123456789;
		pessoa3.dataNascimento = "01/01/2006";

		System.out.println("PESSOA 1: ");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Cpf: " + pessoa1.cpf);
		System.out.println("Data de nascimento: \n" + pessoa1.dataNascimento);
		System.out.println(" ");
		System.out.println("PESSOA 2: ");
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Cpf: " + pessoa2.cpf);
		System.out.println("Data de nascimento: " + pessoa2.dataNascimento);
		System.out.println(" ");
		System.out.println("PESSOA 3: ");
		System.out.println("Nome: " + pessoa3.nome);
		System.out.println("Cpf: " + pessoa3.cpf);
		System.out.println("Data de nascimento: " + pessoa3.dataNascimento);

		ler.close();
	}

}
