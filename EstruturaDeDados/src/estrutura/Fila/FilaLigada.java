package estrutura.Fila;

import estrutura.ListaLigadaLinear.ListaDupla.Dupla;

public class FilaLigada extends Dupla{

    public FilaLigada(){
        super();
    }

    public void enfilerar(int valor){
        super.addFim(valor);
    }

    public void desenfilerar(){
        super.removerInicio();
    }

    public String exibir(){
        return exibirAtual();
    }
}
