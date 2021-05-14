/**
 * 
 * @autor Tiago Jaconi
 */

public class DescritorPilha {
    
    /*-------------------------
       ATRIBUTOS DA CLASSE
    ------------------------ */

    private No topo;
    int tamanhoPilha;

    /*-------------------------
       CONSTRUTOR DA CLASSE
    ------------------------ */

    public DescritorPilha(){

        topo = null;
        tamanhoPilha = 0;

    }
    
    /*-------------------------------------
       OPERAÇÕES DA TAD PILHA ENCADEADA
    -------------------------------------*/

    // Método para verificar se a pilha está vazia.
    public boolean isEmpty() {
        
        return topo == null;
        
    }

    // Método para apresentar os dados que está no topo.
    public String top(){

        // Se a pilha não estiver vazia, apresenta os dados do topo.
        if( !isEmpty() ){

            return topo.toString();

        }

        return "";

    }
    
    // Método para empilhar dados na pilha.
    public boolean push(int codigo, String nome) {

        No novoNo = new No(codigo, nome);

        if( isEmpty() ){

            topo = novoNo;
            novoNo.setProximo(null);
            topo = novoNo;

        }else{

            novoNo.setProximo(topo);
            topo = novoNo;
        }

        tamanhoPilha++;
        return true;
    
    }

    // Método para desempilhar dados da pilha. 
    public String pop(){

        
        String resultado = "";

        if( !isEmpty() ){

            resultado = top();

            No auxiliar = topo;

            topo = topo.getProximo();
            auxiliar.setProximo(null);

            tamanhoPilha--;

        }

        return resultado;

    }

    // Mostra a quantidade de nós da pilha.
    public int size(){
    
        return tamanhoPilha;

    }

    // Método para mostrar os valores da pilha.
    public String print(){

        String resultado = "";

        if( !isEmpty() ){

            No auxiliar = topo;

            // Percorre a pilha do topo até a posição 0.
            while (auxiliar != null){

                resultado = resultado + auxiliar.toString();
                auxiliar = auxiliar.getProximo();

            }

        }

        return resultado;

    }
    
}
