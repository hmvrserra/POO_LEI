import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Stand stand = new Stand("Stand Maravilhoso");
        stand.lerVeiculos("RevisoesPOO/Rev1/veiculos.txt");
        System.out.println(stand);

        System.out.println("\nApenas os veiculos com preco inferior a 1000 €:");
        List<Veiculo> veiculosBaratos = stand.filtrarVeiculos(v -> v.getPreco() < 1000);
        veiculosBaratos.forEach(v -> System.out.println(v));
    }
}