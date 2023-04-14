package aplicacao;

import java.util.Scanner;

import classes.GrandePapagaio;
import classes.Post;
import classes.Usuario;

public class Main {

	public static void main(String[] args) {

		/* Comandos aqui */
		final String SINTAXE_COMANDO_POSTAR = " -> "; /* nomeDoUsuario -> Post */
		final String SINTAXE_COMANDO_LISTAR = "mural "; /* mural nomeDoUsuario */
		final String SINTAXE_COMANDO_SEGUIR = " segue "; /* nomeDoUsuario segue nomeOutroUsuario */

		Scanner sc = new Scanner(System.in);
		GrandePapagaio grandePapagaio = new GrandePapagaio();

		/* Aqui eu peço o comando do usuario */
		for (int i = 1; i <= 3; i++) {
			System.out.println("O que você está pensando? ");
			String entradaTerminal = sc.nextLine();

			/* Tenho que saber qual comando tem na entrada do usuario */

			if (entradaTerminal.contains(SINTAXE_COMANDO_POSTAR)) {

				String[] listaDePostar = entradaTerminal.split(SINTAXE_COMANDO_POSTAR);
				String nome = listaDePostar[0];
				String texto = listaDePostar[1];

				if (!grandePapagaio.getListaNomeUsuarios().contains(nome)) {
					Usuario usuario = new Usuario(nome);
					usuario.postar(texto);
					grandePapagaio.getListaUsuarios().add(usuario);
				} else {
					grandePapagaio.usuarioDeNome(nome).postar(texto);

				}

			} else if (entradaTerminal.contains(SINTAXE_COMANDO_LISTAR)) {
				String[] listaDeListar = entradaTerminal.split(SINTAXE_COMANDO_LISTAR);
				String nome = listaDeListar[1];
				System.out.println(grandePapagaio.usuarioDeNome(nome));

			} else if (entradaTerminal.contains(SINTAXE_COMANDO_SEGUIR)) {
				String[] listaDeSeguir = entradaTerminal.split(SINTAXE_COMANDO_SEGUIR);
				/*
				 * falta criar esse aida e transformar tudo em metodo de papagaio pra deixar
				 * mais limpo
				 */
			}
		}

	}
}
