import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("POO");
        palavras.add("PO");
        palavras.add("class");
        palavras.add("cl");

        List<String> palavrasComPrefixo = Filtro.filterWords(palavras, palavra -> palavra.startsWith("c"));
        System.out.println("Palavras que começam com 'c': " + palavrasComPrefixo);

        List<String> palavrasPequenas = Filtro.filterWords(palavras, palavra -> palavra.length() < 3);
        System.out.println("Palavras com tamanho menor que 3: " + palavrasPequenas);
    }
}