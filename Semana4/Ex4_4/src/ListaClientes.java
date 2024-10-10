import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<Cliente> clientes;

    public ListaClientes() {
        this.clientes = new ArrayList<>();
    }

    public void adicionaCliente(Cliente c) {
        clientes.add(c);
    }

    public ArrayList<Cliente> getClientesVIP() {
        ArrayList<Cliente> clientesVIP = new ArrayList<>();
        for (Cliente c : clientes) {
            if (c instanceof ClienteVIP) {
                clientesVIP.add(c);
            }
        }
        return clientesVIP;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cliente c : clientes) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}
