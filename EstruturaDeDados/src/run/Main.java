package run;

import estrutura.Pilha.PilhaVetor;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaVetor lista = new PilhaVetor(5);
        
        lista.empilhar(10);
        lista.empilhar(20);
        lista.empilhar(30);
        lista.empilhar(40);
        lista.empilhar(50);

        System.out.println("Topo: " + lista.topo());
        System.out.println("Pilha atual:\n" + lista);

        lista.inverterPilha();
        PilhaVetor clone = lista.clonar();

        System.out.println("Topo: " + clone.topo());
        System.out.println("Pilha clone:\n" + clone);
    }
}
