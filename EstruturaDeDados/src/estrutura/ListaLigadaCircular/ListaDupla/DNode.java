package estrutura.ListaLigadaCircular.ListaDupla;

public class DNode {
    private DNode prox, ant;
    private int valor;

    public DNode(int valor){
        this.valor = valor;
        this.prox = this.ant = null;
    }


    public void setAnt(DNode ant) {
        this.ant = ant;
    }
    public void setProx(DNode prox) {
        this.prox = prox;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public DNode getAnt() {
        return ant;
    }
    public DNode getProx() {
        return prox;
    }
    public int getValor() {
        return valor;
    }
}



