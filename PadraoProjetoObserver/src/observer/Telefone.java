package observer;

import java.util.*;

public class Telefone {
    private Collection <TelefoneListener> telefoneListeners = new ArrayList<TelefoneListener>();

    // método de suporte para testar a solução
    public void tocaFone() {
        disparaTelefoneTocou();
    }

    // método de suporte para testar a solução
    public void atendeFone() {
        disparaTelefoneAtendido();
    }

    public synchronized void addTelefoneListener(TelefoneListener l) {
        if(!telefoneListeners.contains(l)) {
            telefoneListeners.add(l);
        }
    }

    public synchronized void 
            removeTelefoneListener(TelefoneListener l) {

        telefoneListeners.remove(l);
    }

    private void disparaTelefoneTocou() {
        Collection <TelefoneListener> tl;
        synchronized (this) {
            // Clonar para evitar problemas de sincronização
            // durante a propagação
            tl = (Collection)(((ArrayList)telefoneListeners).clone());
        }
        TelefoneEvent evento = new TelefoneEvent(this);                
        for (TelefoneListener t : tl) {
        	t.telefoneTocou(evento);
        }
    }
            

    // disparaTelefoneAtendido() é semelhante a disparaTelefoneTocou()
    // Exercício: Que design pattern poderia ser usado para fatorar
    // o código comum?
    private void disparaTelefoneAtendido() {
        Collection <TelefoneListener> tl;
        synchronized (this) {
            tl = (Collection)(((ArrayList)telefoneListeners).clone());
        }
        TelefoneEvent evento = new TelefoneEvent(this);
        for (TelefoneListener t : tl) {
        	t.telefoneAtendido(evento);
        }        
    }
}
