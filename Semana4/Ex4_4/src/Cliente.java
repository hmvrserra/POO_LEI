public class Cliente {
    private String nome;
    private int id;
    protected double valorMedioCompras;
    public Cliente(String nome, int identificacao, double valorMedioCompras) {
        this.nome = nome;
        this.id = identificacao;
        this.valorMedioCompras = valorMedioCompras;
    }
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double valorAPagarComDesconto() {
        return valorMedioCompras;
    }

    public double getValorMedioCompras() {
        return valorMedioCompras;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (ID: " + id + "), Valor Médio de Compras: " + valorMedioCompras;
    }
}

