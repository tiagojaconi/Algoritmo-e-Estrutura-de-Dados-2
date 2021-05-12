/**
 * 
 * @autor Tiago Jaconi
 */

public class DescritorPilha {
    
    /*-------------------------
       ATRIBUTOS DA CLASSE
    ------------------------ */

    private No pilha[];
    int topo;

    /*-------------------------
       CONSTRUTOR DA CLASSE
    ------------------------ */

    public DescritorPilha(){}
    
    /*-------------------------
       MÉTODOS DA CLASSE
    ------------------------ */

    // Método para acessar o topo da pilha.
    public int getTopo(){
        
        return topo;

    }

    /*-----------------------------------
       OPERAÇÕES DA TAD PILHA CONTIGUA
    -----------------------------------*/

    // Método para criar a pilha
    public void criarPilha(int tamanhoPilha){

        this.topo = -1;
        pilha = new No[tamanhoPilha];

    }

    // Método para verificar se a pilha está cheia.
    public boolean isFull() {

        return topo == (pilha.length-1);
    
    }

    // Método para verificar se a pilha está vazia.
    public boolean isEmpty() {
        
        return topo == -1;
        
    }

    // Método para apresentar os dados que está no topo.
    public String top(){

        // Se a pilha não estiver vazia, apresenta os dados do topo.
        if( !isEmpty() ){

            return pilha[topo].toString();

        }

        return "";

    }
    
    // Método para empilhar dados na pilha.
    public boolean push(int codigo, String nome) {

        // Se a pilha não estiver cheia.
        if( !isFull() ){

            topo += 1; // Atualiza o topo.
            No novoNo = new No(codigo, nome); // Cria um novo nó e insere os dados do usuário.
            pilha[topo] = novoNo; // Insere o nó criado na posição topo.

            return true;

        }

        return false;
    
    }

    // Método para desempilhar dados da pilha. 
    public String pop(){

        // Tentamos acessar o topo da pilha.
        String auxiliar = top();

        // Se o resultado for diferente de vazio, atualizamos o topo.
        if( !auxiliar.equals("") ){

            topo -= 1;

        }

        return auxiliar;

    }

    // Mostra a quantidade de nós da pilha.
    public int size(){
    
        return (topo + 1);

    }


    // Método para esvaziar a pilha.
    public void clear(){

        // Se a pilha não estiver vazia, atualiza o valor do "topo".
        if( !isEmpty() ){

            topo = -1;
        }
    }

    // Método para mostrar os valores da pilha.
    public void print(){

        if( !this.isEmpty() ){

            // Percorre a pilha do topo até a posição 0.
            for (int i = this.getTopo(); i >= 0; i--){

                System.out.println(pilha[i].toString());

            }

        }else{

            System.out.println("Pilha vazia.");
            
        }

    }
    
}
