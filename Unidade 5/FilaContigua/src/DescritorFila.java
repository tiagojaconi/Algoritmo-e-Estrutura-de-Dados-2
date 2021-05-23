/**
 * 
 * @autor Tiago Jaconi
 */

public class DescritorFila {
    
    /*-------------------------
       ATRIBUTOS DA CLASSE
    ------------------------ */

    private No Fila[];
    int finalFila= -1;

    /*-------------------------
       CONSTRUTOR DA CLASSE
    ------------------------ */

    public DescritorFila(){}

    public void queue(int tamanhoFila){

        Fila = new No[tamanhoFila];
        finalFila= -1;

    }
    
    /*-------------------------------------
       OPERAÇÕES DA TAD FILA CONTÍGUA
    -------------------------------------*/

    // Método para verificar se a fila está vazia.
    public boolean isEmpty() {
        
        return finalFila == -1;
        
    }

    // Método para verificar se a fila está cheia.
    public boolean isFull(){

        return finalFila == (Fila.length-1);
    }

    // Método para inserir um elemento na fila.
    public boolean enqueue(int codigo, String nome){

        if(!isFull()){

            No novNo = new No(codigo, nome);

            finalFila++;
            Fila[finalFila]= novNo;

            return true;

        }

        return false; // Se a fila estiver cheia.
    }

    // Método para remover um elemento da fila.
    public String dequeue(){

        String resultado = front();

        if(!resultado.equals("")){

            for(int i = 0; i<finalFila; i++){

                Fila[i] = Fila[i+1];

            }

            finalFila--;

        }

        return resultado;

    }

    // Método para mostrar o primeiro elemento da fila.
    public String front(){

        if(!isEmpty()){

            return Fila[0].toString();

        }

        return "";

    }

    // Mostra a quantidade de nós da fila.
    public int size(){
    
        if(!isEmpty()){
            return (finalFila+1);
        }
        
       return 0; 

    }

    // Método para esvaziar a fila.
    public void clear (){

        finalFila= -1;

    }

    // Método para mostrar os valores da fila.
    public String print(){

        String resultado = "";

        if( !isEmpty() ){

            for(int i =0; i <= finalFila; i++){

                resultado = resultado + Fila[i].toString();

            }

        }

        return resultado;

    }
    
}