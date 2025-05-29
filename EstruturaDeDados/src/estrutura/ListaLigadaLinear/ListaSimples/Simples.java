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

    public void Limpar(){
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
