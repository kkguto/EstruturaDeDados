package estrutura.ListaLigadaLinear.ListaDupla;

public class DNode {
    private DNode prox, ant;
    private int valor;

    public DNode(int valor) {
        this.prox = this.ant = null;
        this.valor = valor;
    }

    public DNode getProx() {
        return prox;
    }

    public DNode getAnt() {
        return ant;
    }

    public int getValor() {
        return valor;
    }

    public void setProx(DNode prox) {
        this.prox = prox;
    }

    public void setAnt(DNode ant) {
        this.ant = ant;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
