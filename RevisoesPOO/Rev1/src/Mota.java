public class Mota extends Veiculo{
    public int getNumRodas() {
        return 2;
    }

    public Mota(String matricula, int preco, Data dataCompra) {
        super(matricula, preco, dataCompra);
    }

    @Override
    public String toString(){
        return "Mota | " + super.toString();
    }
}
