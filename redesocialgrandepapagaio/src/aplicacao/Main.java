package aplicacao;

import java.util.Scanner;

import classes.Usuario;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = "Leandro";
		Usuario usuario = new Usuario(nome);
		usuario.postar("Eu queria um carro, agora eu posso ter dez ta faltando vaga!");

		Usuario usuario2 = new Usuario("Thaissa");
		usuario2.postar("To bombando no top 10 dominando a area");

		System.out.println(usuario.getNome() + " -> " + usuario.getMural());
		System.out.println(usuario2.getNome() + " -> " + usuario2.getMural());

		usuario.seguir(usuario2);

		System.out.println(usuario2.leitura(usuario));
	}
}
