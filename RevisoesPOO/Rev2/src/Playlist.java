import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Playlist extends ComparadorDeMusicas{

	private List<Musica> musicas;
	private final String nome;

	public Playlist(String nome) {
		this.nome = nome;
		musicas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	 
	public void adicionar(Musica musica){
		musicas.add(musica);
	}

	public void lerMusicas(String path){

		File file = new File(path);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()){
				String line = scanner.nextLine();
				String[] parts = line.split(";");

				String nome = parts[0];
				Time tempo = new Time(parts[1]);

				String autores = scanner.nextLine();
				String[] autoresArray = autores.split(";");

				if (autoresArray.length == 1){
					Musica m = new Musica(nome, autoresArray[0], tempo);
					adicionar(m);
				}
				else {
					MusicaComVariosAutores m = new MusicaComVariosAutores(nome, autoresArray, tempo);
					adicionar(m);
				}
			}
		}
		catch (FileNotFoundException e){
			System.err.println("File not found");
		}
	}

	public void ordenarMusicas(){
		musicas.sort(new ComparadorDeMusicas());
	}

	public List<Musica> musicasDoAutor (String autor){
		List<Musica> musicaAutor = new ArrayList<>();
		for (Musica m: musicas){
			if (m.contemAutor(autor))
				musicaAutor.add(m);
		}
		return musicaAutor;
	}

	@Override

	public String toString(){
		String res = "Playlist: " + this.nome + "\n";
		int index = 0;

		for (Musica m: musicas)
			res += m + "\n";

		return res;
	}
}
