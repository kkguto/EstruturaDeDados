package estrutura.Deque;

public class Deque {
    
    private int []lista;
    private int inicio, fim, qtd_elementos;

    public Deque(int tam) {
        this.lista = new int[tam];
        this.inicio = this.qtd_elementos = 0;
        this.fim = -1;
    }

    public void addInicio(int valor){
        if(!cheio()){
            this.inicio = (inicio - 1 + lista.length) % lista.length;
            this.lista[inicio] = valor;
            this.qtd_elementos++;
        }
    }
    
    public void addFim(int valor){
        if(!cheio()){
            this.fim = (fim + 1) % lista.length;
            this.lista[fim] = valor;
            
            this.qtd_elementos++;
        }
    }

    public int removerInicio(){
        if(!vazio()){
            int valor = lista[inicio];
            this.inicio = (inicio + 1) % lista.length;

            this.qtd_elementos --;
            return valor;
        }

        return -1;
    }

    public int removerFim(){
        if(!vazio()){
            int valor = lista[fim];
            this.fim = (fim - 1 + lista.length) % lista.length;

            this.qtd_elementos--;
            return valor;
        }

        return -1;
    }

    public boolean vazio(){
        return qtd_elementos == 0;
    }

    public boolean cheio(){
        return lista.length == qtd_elementos;
    }

    public void exibir(){
        if(!vazio()){
            int indice = inicio;

            for(int i = 0; i < this.qtd_elementos; i++){
                System.out.print(lista[indice] + " | ");
                indice = (indice + 1) % lista.length;
            }
        }
    }
}
