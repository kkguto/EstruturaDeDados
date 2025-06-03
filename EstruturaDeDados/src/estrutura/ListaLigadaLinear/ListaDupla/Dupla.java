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

    public void addAntes(int valor, int pos) throws Exception{
        DNode alvo = buscarPorPosicao(pos);

        if(pos == 0){
            addInicio(valor);
        }else{
            DNode novo_no = new DNode(valor);

            alvo.getAnt().setProx(novo_no);
            novo_no.setAnt(alvo.getAnt());

            novo_no.setProx(alvo);
            alvo.setAnt(novo_no);

            this.tam++;
        }
    }

    public void addDepois(int valor, int pos) throws Exception{
        DNode alvo = buscarPorPosicao(pos);

        if(pos == this.tam - 1){
            addFim(valor);
        }else{
            DNode novo_no = new DNode(valor);

            novo_no.setProx(alvo.getProx());
            alvo.getProx().setAnt(novo_no);

            alvo.setProx(novo_no);
            novo_no.setAnt(alvo);

            this.tam++;
        }
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

    public void removerNode(int pos) throws Exception{
        DNode alvo = buscarPorPosicao(pos);

        if(pos == 0){
            removerInicio();
        }else if(pos == this.tam - 1){
            removerFim();
        }else{
            alvo.getAnt().setProx(alvo.getProx());
            alvo.getProx().setAnt(alvo.getAnt());

            alvo.setProx(null);
            alvo.setAnt(null);

            this.tam--;
        }
    }

    public DNode buscarPorElemento(int valor){
        DNode atual = this.inicio;

        while(atual != null){
            if(atual.getValor() == valor) return atual;
            atual = atual.getProx();
        }
        
        return null;
    }

    public DNode buscarPorPosicao(int pos) throws Exception{
        if(!(pos >= 0 && pos < this.tam)) throw new IllegalArgumentException("Posição invalida");

        DNode atual = this.inicio;

        for(int i = 0; i < pos; i++){
            atual = atual.getProx();
        }

        return atual;
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
            builder.append(atual.getValor());
            if(atual.getProx() != null){
                builder.append(" -> ");
            }
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
            builder.append(atual.getValor());
            if(atual.getAnt() != null){
                builder.append(" <- ");
            }
            atual = atual.getAnt();
        }

        return builder.toString();
    }
}
