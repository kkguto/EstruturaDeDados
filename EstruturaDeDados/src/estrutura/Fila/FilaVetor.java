package estrutura.Fila;

public class FilaVetor {

    private int inicio, fim, qtd_elementos;
    private int []lista;

    public FilaVetor(int tam) {
        this.lista = new int[tam];
        this.inicio = this.qtd_elementos = 0;
        this.fim = -1;
    }

    public void enfilerar(int valor){
        if(!cheio()){
            fim = (fim + 1) % lista.length;
            lista[fim] = valor;
            
            qtd_elementos ++;
        }
    }

    public int desenfilerar(){
        if(!vazio()){
            int valor = lista[inicio];
            inicio = (inicio + 1) % lista.length;
            qtd_elementos--;
            return valor;
        }else{
            System.out.println("Fila vazia");
            return -1;
        }
    }

    public int buscar(int valor){
        for(int i = 0; i < qtd_elementos; i++){
            int index = (inicio + i) % lista.length;
            if(lista[index] == valor){
                return i;
            }
        }

        return -1;
    }

    public FilaVetor clonar(){
        FilaVetor clone = new FilaVetor(this.lista.length);
        
        for(int i = 0; i < qtd_elementos; i++){
            clone.enfilerar(lista[i]);
        }

        return clone;
    }

    public void inverter(){
        int i, j;
        i = inicio;
        j = fim;

        while(i < j){
            int temp = lista[i];
            lista[i] = lista[j];
            lista[j] = temp;

            i++;
            j--;
        }
    }

    public void limpar(){
        inicio = qtd_elementos = 0;
        fim = -1;

        // while(!vazio()){
        //     desenfilerar();
        // }
    }

    public FilaVetor intercalar(FilaVetor f2){
        int tam = (this.qtd_elementos + f2.qtd_elementos);
        FilaVetor resultado = new FilaVetor(tam);

        int i = 0, j = 0;

        while(i < qtd_elementos || j < f2.qtd_elementos){
            if(i < this.qtd_elementos){
                int indice = (this.inicio + i) % lista.length;
                int valor = lista[indice];
                if(resultado.buscar(valor) == -1){
                    resultado.enfilerar(lista[indice]);
                }
                i++;
            }

            if(j < f2.qtd_elementos){
                int indice = (f2.inicio + j) % lista.length;
                int valor = f2.lista[indice];
                if(resultado.buscar(valor) == -1){
                    resultado.enfilerar(f2.lista[indice]);
                }  
                j++;
            }
            
        }
        

        return resultado;
    }

    public int primeiro(){
        if(!vazio()){
            return lista[inicio];
        }else{
            System.out.println("Fila vazia");
            return -1;
        }
    }

    public int tamanho(){
        return this.qtd_elementos;
    }

    public boolean vazio(){
        return  this.qtd_elementos == 0;
    }

    public boolean cheio(){
        return this.qtd_elementos == this.lista.length;
    }

    @Override
    public String toString(){
        if(vazio()){
            return "[]";
        }

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < qtd_elementos; i++){
            int index = (inicio + i) % lista.length;
            builder.append(lista[index]).append(" ");
        }

        return builder.toString();
    }
}
