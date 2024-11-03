public class Carro extends Veiculo{
    public int getNumRodas(){
        return 4;
    }

    public Carro (String matricula, int preco, Data dataCompra){
        super(matricula,preco,dataCompra);
    }

    @Override
    public String toString(){
        return "Carro | " + super.toString();
    }
}
