package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

	private String texto;
	private LocalDateTime data = LocalDateTime.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public Post(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	@Override
	public String toString() {
		return texto + " (" + data.format(formatter) + ")";
	}
}
