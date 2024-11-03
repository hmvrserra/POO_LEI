import java.util.List;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("Jolas e Bola", "Serafim", new Time("3:35"));
        Musica m2 = new Musica("Amor de Mae", "Rubi", new Time("4:35"));

        String[] autores_m3= {"Quim da Bairrada", "Nando"};
        Musica m3 = new MusicaComVariosAutores("De Burrico para Lisboa", autores_m3, new Time("6:05"));

        Playlist p1 = new Playlist("Pimbalhada");

        // Testar o codigo desenvolvido em todas as questoes

        // Exerc 1
        Playlist p2 = new Playlist("Mambos");
        p2.adicionar(m1);
        p2.adicionar(m2);

        System.out.println(p2);
        // Exerc 2
        p2.adicionar(m3);

        System.out.println(p2);
        // Exerc 3
        Playlist p3 = new Playlist("TXT FILE");

        p3.lerMusicas("RevisoesPOO/Rev2/musicas.txt");

        System.out.println(p3);
        // Exerc 4
        System.out.println(p3.musicasDoAutor("Julio Bandeiras"));
        // Exerc 5
        // TODO

        // Exerc 6
        // TODO
    }
}