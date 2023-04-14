package classes;

import java.util.ArrayList;
import java.util.List;

public class GrandePapagaio {
	private List<Usuario> usuarios = new ArrayList<>();
	
	public GrandePapagaio() {

	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
