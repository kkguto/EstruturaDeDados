package estrutura.ListaLigadaCircular.ListaSimples;

public class Node {
    private Node prox;
    private int valor;

    public Node(int valor) {
        this.prox = null;
        this.valor = valor;
    }

    public Node getProx() {
        return prox;
    }
    public int getValor() {
        return valor;
    }
    
    public void setProx(Node prox) {
        this.prox = prox;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
