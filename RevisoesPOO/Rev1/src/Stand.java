import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.function.Predicate;

public class Stand {

    private String nome;
    private List<Veiculo> veiculos;

    //Constructors
    public Stand (String nome){
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    //Getters
    public String getNomeStand (){
        return this.nome;
    }

    public List<Veiculo> getVeiculos(){
        return this.veiculos;
    }

    public void lerVeiculos(String path){

        File file = new File(path);
        try{
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] parts = line.split(";");
                String matricula = parts[0];
                int preco = Integer.parseInt(parts[1]);
                Data dataCompra = new Data(parts[2]);
                int numRodas = Integer.parseInt(parts[3]);

                if (numRodas == 2){;
                    this.veiculos.add(new Mota(matricula,preco,dataCompra));
                }
                else if (numRodas == 4){
                    this.veiculos.add(new Carro(matricula,preco,dataCompra));
                }
            }
        }
        catch(FileNotFoundException e){
            System.err.println("File not found");
        }
    }

    public int totalValor(){
        int total  = 0;

        for (Veiculo v: veiculos)
            total += v.getPreco();

        return total;
    }

    public List<Veiculo> filtrarVeiculos(Predicate<Veiculo> predicate){
        List<Veiculo> res = new ArrayList<>();

        for (Veiculo v: veiculos)
            if (predicate.test(v))
                res.add(v);

        return res;
    }

    @Override

    public String toString(){
        String string = this.nome + "\n";

        for (Veiculo v: veiculos)
            string += v + "\n";

        string += "Valor total do stand: " + totalValor() + "€";

        return string;
    }
}
