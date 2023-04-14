package classes;

import java.util.ArrayList;
import java.util.List;

import aplicacao.Main;

public class Usuario {
	private String nome;
	private Mural mural = new Mural();
	private List<Usuario> listaSeguidos = new ArrayList<Usuario>();

	public Usuario() {

	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public List<Usuario> getSeguidos() {
		return listaSeguidos;
	}

	public void setSeguidos(List<Usuario> seguidos) {
		this.listaSeguidos = seguidos;
	}

	public void postar(String texto) {
		mural.getPosts().add(new Post(texto));
		System.out.println("Post realizado com sucesso no mural de " + nome);

	}

	public void seguir(Usuario outroUsuario) {
		listaSeguidos.add(outroUsuario);
		System.out.println(nome + " segue " + outroUsuario.getNome());
	}

	public String leitura(Usuario outroUsuario) {
		return nome + " --> " + outroUsuario.getMural();
	}

	@Override
	public String toString() {
		return nome + " --> " + mural;
	}
}
