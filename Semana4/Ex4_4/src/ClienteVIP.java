public class ClienteVIP extends Cliente {
    private static final double LIMIAR_VIP = 1000;
    private static final int desconto = 10; //Assumimos que era uma percentagem de desconto e não um valor fixo

    public ClienteVIP(String nome, int identificacao, double valorMedioCompras) {
        super(nome, identificacao, valorMedioCompras);
    }

    @Override
    public double valorAPagarComDesconto() {
        return valorMedioCompras - (valorMedioCompras * desconto / 100);
    }

    public static double getLimiarVip() {
        return LIMIAR_VIP;
    }

    @Override
    public String toString() {
        return "ClienteVIP: " + super.toString() + ", Desconto: " + desconto + "%";
    }
}

