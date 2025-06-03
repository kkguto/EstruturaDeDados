package estrutura.Fila;

import estrutura.Deque.Deque;

public class Fila_Deque extends Deque{

    public Fila_Deque(int capacidade) {
        super(capacidade);  // chamada explícita ao construtor da superclasse
    }

    public void enfilerar(int valor){
        super.addFim(valor);
    }

    public int desenfilerar(){
        return super.removerInicio();
    }

}
