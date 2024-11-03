public class Musica {

	private final String titulo; 
	private final String autor;
	private final Time duracao;
	
	public Musica(String titulo, String autor, Time duracao) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracao = duracao;
	}
	
	// getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public Time getDuracao() {
		return duracao;
	}
	
	// verifica se o autor dado no argumento e� autor da musica
	public boolean contemAutor(String nome) {
		return nome.equals(autor);
	}
	
	// sobreposicao do toString()
	@Override
	public String toString() {
		return titulo + ", " + duracao + ", " + getAutor();
	}
}
