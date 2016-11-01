package observer;

public class Pessoa {
    public void escutaTelefone(Telefone t) {
        t.addTelefoneListener(
            new TelefoneAdapter() {
                public void telefoneTocou(TelefoneEvent e) {
                    System.out.println("Eu pego!");
                    ((Telefone)(e.getSource())).atendeFone();
                }
            }
        );
    }
}
