package run;

import estrutura.ListaLigadaLinear.ListaDupla.Dupla;

public class Main {
    public static void main(String[] args) throws Exception {
        Dupla lista = new Dupla();

        lista.addInicio(5);
        lista.addInicio(6);
        lista.addInicio(7);

        System.out.println(lista.exibirAtual());

        lista.addAntes(4, 1);

        System.out.println(lista.exibirAtual());

        lista.removerNode(2);
        System.out.println(lista.exibirAtual());

    }
}
