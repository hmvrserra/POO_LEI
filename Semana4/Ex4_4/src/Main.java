public class Main {
    public static void main(String[] args) {
        ListaClientes lista = new ListaClientes();
        Cliente c1 = new Cliente("João", 1, 1000);
        ClienteVIP c2 = new ClienteVIP("Maria", 2, 1500);
        ClienteVIP c3 = new ClienteVIP("Pedro", 3, 2000);
        lista.adicionaCliente(c1);
        lista.adicionaCliente(c2);
        lista.adicionaCliente(c3);

        System.out.println(lista);

        System.out.println("Clientes VIP:");
        for (Cliente c : lista.getClientesVIP()) {
            System.out.println(c);
        }
    }
}