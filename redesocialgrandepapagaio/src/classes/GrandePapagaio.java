package classes;

import java.util.ArrayList;
import java.util.List;

public class GrandePapagaio {
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private List<String> listaNomeUsuarios = new ArrayList<String>();

	public GrandePapagaio() {

	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<String> getListaNomeUsuarios() {
		for (Usuario usuario : listaUsuarios) {
			listaNomeUsuarios.add(usuario.getNome());
		}
		return listaNomeUsuarios;
	}

	public void setListaNomeUsuarios(List<String> listaNomeUsuarios) {
		this.listaNomeUsuarios = listaNomeUsuarios;
	}

	public Usuario usuarioDeNome(String nome) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNome().equalsIgnoreCase(nome)) {
				return usuario; /* me retorna o usuari que tem esse nome digitado la no programa */

			}
		}
		return null;

	}
}
