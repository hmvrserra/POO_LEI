abstract public class Veiculo {

    private String matricula;
    private int preco;
    private Data dataCompra;

    public Veiculo (String matricula, int preco, Data dataCompra){
        this.matricula = matricula;
        this.preco = preco;
        this.dataCompra = dataCompra;
    }

    //Getters
    public String getMatricula(){
        return this.matricula;
    }

    public int getPreco(){
        return this.preco;
    }

    public Data getDataCompra(){
        return this.dataCompra;
    }

    public abstract int getNumRodas();

    @Override
    public String toString(){
        return "Matrícula: " + this.matricula + " | Preço: " + this.preco + "€" + " | Data de Compra: " + this.dataCompra + " | Número de Rodas: " + getNumRodas();
    }
}
