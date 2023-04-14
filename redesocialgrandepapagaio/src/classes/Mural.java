package classes;

import java.util.ArrayList;
import java.util.List;

public class Mural {
	private List<Post> posts = new ArrayList<Post>();

	public Mural() {

	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return posts + "";
	}
}
