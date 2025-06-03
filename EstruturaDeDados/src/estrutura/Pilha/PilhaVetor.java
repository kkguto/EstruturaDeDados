package estrutura.Pilha;

public class PilhaVetor {
    private int topo, qtd_elementos;
    private int []lista;

    public PilhaVetor(int tam) {
        this.lista = new int[tam];
        this.qtd_elementos = 0;
        this.topo = -1;
    }

    public void empilhar(int valor){
        if(!cheio()){
            this.lista[++topo] = valor; //Aqui incrementa antes adicionar o valor
            
            qtd_elementos++;
        }
    }

    public int desempilhar(){
        if(!vazio()){
            int valor = this.lista[topo--]; 
            qtd_elementos--;
            
            return valor;
        }else{
            System.out.println("Lista ta vazio");
            return -1;
        }
    }

    public void inverterPilha(){
        if(!vazio()){
            int i, j;
            i = 0;
            j = topo;

            while(i < j){
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;

                i++;
                j--;
            }

        }
    }

    public int buscar(int valor){
        for(int i = 0; i < qtd_elementos; i++){
            if(lista[i] == valor){
                return i;
            }
        }

        return -1;
    } 

    public boolean igual(PilhaVetor outra){
        if(this.qtd_elementos != outra.qtd_elementos) {
            return false;
        }

        for(int i = 0; i < qtd_elementos; i++){
            if(lista[i] != outra.lista[i]){
                return false;
            }
        }

        return true;
    }

    public void popNBase(int n){
        if(!vazio() && n <= qtd_elementos){
            int tam = qtd_elementos - n;
            PilhaVetor aux = new PilhaVetor(tam);

            for(int i = 0; i < tam; i++){
                aux.empilhar(desempilhar());
            }

            for(int i = 0; i < n; i++){
                desempilhar();
            }

            for(int i = 0; i < tam; i++){
                empilhar(aux.desempilhar());
            }
        }else {
            System.out.println("Valor de n inválido ou pilha vazia.");
        }
    }

    public void limpar(){
        while(!vazio()){
            desempilhar();
        }
    }

    public PilhaVetor clonar(){
        PilhaVetor clone = new PilhaVetor(lista.length);
        PilhaVetor aux = new PilhaVetor(lista.length);

        for(int i = 0; i <= topo; i++){
            aux.empilhar(lista[i]);
        }

        for(int i = aux.topo; i >= 0; i--){
            clone.empilhar(aux.lista[i]);
        }
        return clone;
    }


    public int topo(){
        if(!vazio()){
            return lista[topo];
        }else{
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    public int tamanho(){
        return this.qtd_elementos;
    }

    public boolean vazio(){
        return this.qtd_elementos == 0;
    }

    public boolean cheio(){
        return this.qtd_elementos == this.lista.length;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = topo; i >= 0; i--){
            builder.append(lista[i]).append("\n");
        }
        return builder.toString();
    }
}
