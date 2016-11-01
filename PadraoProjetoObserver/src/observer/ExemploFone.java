package observer;

public class ExemploFone {
    public static void main(String[] args) { 
        Telefone fone = new Telefone();
        Pessoa fulano = new Pessoa();
        SecretariaEletronica se = new SecretariaEletronica();

        fone.addTelefoneListener(se);
        fulano.escutaTelefone(fone);

        fone.tocaFone(); // começa a brincadeira
    }
}
