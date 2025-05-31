package estrutura.ListaLigadaCircular.ListaSimples;

public class SimplesCircular {
    private int tam;
    private Node inicio, fim;

    public SimplesCircular() {
        this.tam = 0;
        this.inicio = this.fim = null;
    }

    public void addInicio(int valor){
        Node novo_no = new Node(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
            novo_no.setProx(novo_no);
        }else{
            novo_no.setProx(inicio);
            this.fim.setProx(novo_no);
        }

        this.inicio = novo_no;
        this.tam++;
    }

    public void addFim(int valor){
        Node novo_no = new Node(valor);

        if(vazio()){
            this.inicio = this.fim = novo_no;
            novo_no.setProx(novo_no);
        }else{
            this.fim.setProx(novo_no);
            novo_no.setProx(inicio);
        }

        this.fim = novo_no;
        this.tam++;
    }

    public void removerInicio(){
        if(!vazio()){
            Node prox = this.inicio.getProx();

            this.inicio.setProx(null);
            this.fim.setProx(prox);

            this.inicio = prox;
            this.tam--;
        }
    }

    public void removerFim(){
        if(!vazio()){
            Node ant = this.inicio;

            for(int i = 0; i < tam - 2; i++){
                ant = ant.getProx();
            }

            ant.setProx(inicio);
            this.fim.setProx(null);

            this.fim = ant;
            this.tam--;
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
        builder.append(atual.getValor()).append(" -> ");

        for(int i = 0; i < this.tam; i++){
            builder.append(atual.getProx().getValor()).append(" -> ");
            atual = atual.getProx();
        }

        return builder.toString();
    }
}
