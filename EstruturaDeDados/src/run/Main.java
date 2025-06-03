package run;

import estrutura.Fila.FilaVetor;

public class Main {
    public static void main(String[] args) throws Exception {
        FilaVetor lista = new FilaVetor(5);

        lista.enfilerar(5);
        lista.enfilerar(6);
        lista.enfilerar(7);

        System.out.println(lista);

        FilaVetor clone = new FilaVetor(5);
        clone.enfilerar(4);
        clone.enfilerar(3);
        clone.enfilerar(2);

        FilaVetor intercalar = lista.intercalar(clone);

        System.out.println(intercalar);

    }
}
