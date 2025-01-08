package util;

public class Filme {

	private String titulo;
	private String genero;
	private int duracao;
	public Filme(String titulo, String genero, int duracao) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public int getDuracao() {
		return duracao;
	}
	@Override
	public String toString() {
		return "Filme titulo:" + titulo + ", genero:" + genero + ", duracao:" + duracao ;
	}
	
	
	
	
}
