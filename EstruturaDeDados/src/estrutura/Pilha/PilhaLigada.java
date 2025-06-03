package estrutura.Pilha;

import estrutura.ListaLigadaLinear.ListaDupla.Dupla;

public class PilhaLigada extends Dupla{
    public PilhaLigada(){
        super();
    }

    public void empilhar(int valor){
        super.addFim(valor);
    }

    public void desenpilhar(){
        super.removerFim();
    }

    public String exibir(){
        return exibirAtual();
    }
}
