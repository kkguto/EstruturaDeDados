package run;

import estrutura.ListaLigadaCircular.ListaDupla.DuplaCircular;

public class Main {
    public static void main(String[] args) throws Exception {
        DuplaCircular lista = new DuplaCircular();

        lista.addInicio(5);
        lista.addInicio(4);
        lista.addInicio(3);
        lista.addInicio(2);

        System.out.println(lista.exibirAtual());

        lista.RemoverInicio();
        lista.RemoverFim();

        System.out.println(lista.exibirAtual());

        lista.addFim(6);
        lista.addFim(7);

        System.out.println(lista.exibirAtual());
    }
}
