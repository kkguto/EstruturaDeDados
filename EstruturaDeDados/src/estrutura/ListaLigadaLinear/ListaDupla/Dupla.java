package estrutura.ListaLigadaLinear.ListaDupla;

public class Dupla {
    private DNode inicio, fim;
    private int tam;

    public Dupla() {
        this.inicio = this.fim = null;
        this.tam = 0;
    }

    public void addInicio(int valor){
        DNode novo_no = new DNode(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
        }else{
            this.inicio.setAnt(novo_no);
            novo_no.setProx(inicio);
        }

        this.inicio = novo_no;
        this.tam++;
    }

    public void addFim(int valor){
        DNode novo_no = new DNode(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
        }else{
            this.fim.setProx(novo_no);
            novo_no.setAnt(fim);
        }

        this.fim = novo_no;
        this.tam++;
    }

    public void removerInicio(){
        if(!vazio()){
            DNode prox = this.inicio.getProx();

            prox.setAnt(null);
            this.inicio.setProx(null);

            this.inicio = prox;
            this.tam--;
        }
    }

    public void removerFim(){
        if(!vazio()){
            DNode ant = this.fim.getAnt();

            this.fim.setAnt(null);
            ant.setProx(null);

            this.fim = ant;
            this.tam--;
        }
    }

    public void limpar(){
        while(!vazio()){
            removerInicio();
        }
    }

    public boolean vazio(){
        return this.tam == 0;
    }

    public String exibirAtual(){
        if(vazio()){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        DNode atual = this.inicio;

        while(atual != null){
            builder.append(atual.getValor()).append(" -> ");
            atual = atual.getProx();
        }

        return builder.toString();
    }

    public String exibirInvertido(){
        if(vazio()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        DNode atual = this.fim;

        while(atual != null){
            builder.append(atual.getValor()).append(" <- ");
            atual = atual.getAnt();
        }

        return builder.toString();
    }
}
