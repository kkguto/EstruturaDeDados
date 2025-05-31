package estrutura.ListaLigadaCircular.ListaDupla;

public class DuplaCircular {
    private DNode inicio, fim;
    private int tam;

    public DuplaCircular() {
        this.inicio = this.fim = null;
        this.tam = 0;
    }

    public void addInicio(int valor){
        DNode novo_no = new DNode(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
            novo_no.setProx(novo_no);
            novo_no.setAnt(novo_no);
        }else{
            this.inicio.setAnt(novo_no);
            novo_no.setProx(inicio);
            novo_no.setAnt(fim);
        }

        this.inicio = novo_no;
        this.fim.setProx(novo_no);

        this.tam++;
    }

    public void addFim(int valor){
        DNode novo_no = new DNode(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
            novo_no.setProx(novo_no);
            novo_no.setAnt(novo_no);

        }else{
            this.fim.setProx(novo_no);
            novo_no.setAnt(fim);
            novo_no.setProx(inicio);
        }

        this.fim = novo_no;
        this.inicio.setAnt(fim);

        this.tam++;
    }

    public void RemoverInicio(){
        if(!vazio()){
            DNode prox = this.inicio.getProx();

            this.fim.setProx(prox);
            prox.setAnt(fim);

            this.inicio.setProx(null);
            this.inicio.setAnt(null);

            this.inicio = prox;
            this.tam --;
        }
    }

    public void RemoverFim(){
        if(!vazio()){
            DNode ant = this.fim.getAnt();

            ant.setProx(inicio);
            this.inicio.setAnt(ant);

            this.fim.setProx(null);
            this.fim.setAnt(null);

            this.fim = ant;
            this.tam--;
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
        builder.append(atual.getValor()).append(" -> ");
        for(int i = 0; i < tam; i++){
            builder.append(atual.getProx().getValor()).append(" -> ");
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

        builder.append(atual.getValor()).append(" <- ");
        for(int i = 0; i < tam; i++){
            builder.append(atual.getAnt().getValor()).append(" <- ");
            atual = atual.getAnt();
        }

        return builder.toString();
    }

}
