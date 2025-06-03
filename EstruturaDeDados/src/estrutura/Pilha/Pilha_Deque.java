package estrutura.Pilha;

import estrutura.Deque.Deque;

public class Pilha_Deque extends Deque{
    public Pilha_Deque(int tam){
        super(tam);
    }

    public void empilhar(int valor){
        super.addFim(valor);
    }

    public int desemplihar(){
        return super.removerFim();
    }
}
