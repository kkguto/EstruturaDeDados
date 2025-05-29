package run;

import estrutura.ListaLigadaLinear.ListaSimples.Simples;

public class Main {
    public static void main(String[] args) throws Exception {
        Simples novaLista = new Simples();

        novaLista.addFim(5);
        novaLista.addFim(4);
        novaLista.addFim(3);
        novaLista.addFim(2);

        System.out.println(novaLista.exibir());

        novaLista.Limpar();

        System.out.println(novaLista.exibir());

        novaLista.addInicio(0);
        novaLista.addInicio(1);
        novaLista.addInicio(2);
        novaLista.addInicio(3);

        System.out.println(novaLista.exibir());

        novaLista.removerInicio();
        novaLista.removerFim();

        System.out.println(novaLista.exibir());
    }
}
