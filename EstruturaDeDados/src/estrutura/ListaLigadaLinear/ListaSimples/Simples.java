package estrutura.ListaLigadaLinear.ListaSimples;

public class Simples {
    private Node inicio, fim;
    private int tam;
    
    public Simples(){
        this.tam = 0;
        this.inicio = this.fim = null;
    }

    public void addInicio(int valor){
        Node novo_no = new Node(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
        }else{
            novo_no.setProx(inicio);
        }

        this.inicio = novo_no;
        this.tam++;
    }

    public void addFim(int valor){
        Node novo_no = new Node(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
        }else{
            this.fim.setProx(novo_no);
        }

        this.fim = novo_no;
        this.tam++;
    }

    public void addAntes(int valor, int pos) throws Exception{
        Node alvo_ant = buscarPorPosicao(pos - 1);

        if(pos == 0){
            addInicio(valor);
        }else{
            Node novo_no = new Node(valor);
            novo_no.setProx(alvo_ant.getProx());
            alvo_ant.setProx(novo_no);

            this.tam ++;
        }
    
    }

    public void addDepois(int valor, int pos) throws Exception{
        Node alvo = buscarPorPosicao(pos);
        
        if(pos == this.tam - 1){
            addFim(valor);
        }else{
            Node novo_no = new Node(valor);

            novo_no.setProx(alvo.getProx());
            alvo.setProx(novo_no);

            this.tam ++;
        }
    }

    public void removerInicio(){
        if(!vazio()){
            Node prox = this.inicio.getProx();

            this.inicio.setProx(null);

            this.inicio = prox;
            this.tam--;
        }
    }

    public void removerFim(){
        if(!vazio()){
            Node ant = this.inicio;

            for(int i = 0; i < this.tam - 2; i++){
                ant = ant.getProx();
            }

            ant.setProx(null);

            this.fim = ant;
            this.tam--;
        }
    }

    public void removerNode(int pos) throws Exception{
        if(!vazio()){

            if(pos == 0){
                removerInicio();
            }else if(pos == this.tam - 1){
                removerFim();
            }else{
                Node alvo = buscarPorPosicao(pos);
                Node ant_alvo = buscarPorPosicao(pos - 1);
                
                ant_alvo.setProx(alvo.getProx());
                alvo.setProx(null); //Desconecta da lista 

                this.tam--;
            }

        }
    }

    public Node buscarPorElemento(int valor){
        Node atual = this.inicio;

        for(int i = 0; i < this.tam; i++){
            if(atual.getValor() == valor){
                return atual;
            }
            
            atual = atual.getProx();
        }

        return null;
    }

    public Node buscarPorPosicao(int pos) throws Exception{
        if(!(pos >= 0 && pos < this.tam)) throw new IllegalArgumentException("Posição invalida");

        Node atual = this.inicio;

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

    public String exibir(){
        if(vazio()){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        Node atual = this.inicio;

        while(atual != null){
            builder.append(atual.getValor()).append(" -> ");
            atual = atual.getProx();
        }

        return builder.toString();
    }

}
