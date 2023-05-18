import java.util.HashSet;
import java.util.Set;

public class Conta {
    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente (Cliente cliente){
        clientes.add(cliente);
    }

    public void mostraInfos(){
        for (Cliente infos: clientes) {
            try {
                System.out.println(infos.getNome());
                System.out.println(infos.getCpf());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
