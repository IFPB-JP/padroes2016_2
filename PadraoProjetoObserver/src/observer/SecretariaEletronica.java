package observer;

public class SecretariaEletronica
implements TelefoneListener {

public void telefoneTocou(TelefoneEvent e) {
    System.out.println("Secretaria escuta o telefone tocando.");
}

public void telefoneAtendido(TelefoneEvent e) {
    System.out.println("Secretaria sabe que o telefone foi atendido.");
}
}
