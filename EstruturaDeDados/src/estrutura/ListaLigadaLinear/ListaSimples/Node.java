package estrutura.ListaLigadaLinear.ListaSimples;

public class Node {
    private int valor;
    private Node prox;

    public Node(int valor) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor(){
        return valor;
    }

    public Node getProx(){
        return prox;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setProx(Node prox){
        this.prox = prox;
    }

}
