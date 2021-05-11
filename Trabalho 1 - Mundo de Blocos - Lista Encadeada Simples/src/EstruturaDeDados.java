/**
* @author Tiago Jaconi
*/

public class EstruturaDeDados {

    /*------------------------
        ATRIBUTOS DA CLASSE
    -------------------------*/

    private No inicioDaLista; // Armazena o endereço do primeiro nó da lista.
    private No finalDaLista; // Armazena o endereço do último nó da lista. 
    private int quantidadeDeNos; // Armazena a quantidade de nós da lista.

    /*------------------------
        CONSTRUTOR DA CLASSE
    --------------------------*/

    public void criarLista(){

        inicializarLista(); // Chama o método para iniciar a lista.

    } 

    /*------------------------
        MÉTODOS DA CLASSE
    --------------------------*/ 

    // Método para iniciar a lista, definindo os valores iniciais dos atributos. 
    private void inicializarLista() {

        inicioDaLista = null;
        quantidadeDeNos = 0;
        finalDaLista = null;

    }

    // Método para resgatar a quantidade de nós da lista.
    public int getQuantidadeDeNos() {

        return quantidadeDeNos;

    }

    // Método para verificar se a lista está vazia.
    public boolean isEmpty(){
    
        // Se a quantidade de nós da lista estiver com o valor 0 quer dizer que a lista está vazia.
        return quantidadeDeNos == 0;

    }

    // Método para inserir um nó na lista, somente na última posição ou na primeira se a lista estiver vazia.
    public boolean inserir(int codigo, int posicao){
        
        // Se posição for negativa ou maior que a quantidade de nós
        if ((posicao < 0) || (posicao > quantidadeDeNos)){
            
            return false; // Quer dizer que não será possível inserir dados.
        
        }else{

            No novoNo = new No(codigo); // Instância um novo nó, passando o código para o bloco.

            // Caso 1: Lista está vazia.
            if ( isEmpty() ){

                novoNo.setReferencia(null); // Registra null como próxima referência.

                inicioDaLista = novoNo; // Armazena o endereço do inicio da lista.
                finalDaLista = novoNo; // Armazena o endereço do final da lista.
                
            }else{

                // Caso 2: posição = última posição válida.
                if (posicao == quantidadeDeNos){
                    
                    novoNo.setReferencia(null); // Registra null como próxima referência do novoNo.
                    finalDaLista.setReferencia(novoNo); // O último nó da lista recebe o endereço do novoNo como referência do próximo nó.
                    finalDaLista = novoNo; // Registra o novoNo como último nó da lista.
                    
                }
            }
        }
            
        // Atualiza a quantidade de nós da lista.
        quantidadeDeNos = quantidadeDeNos + 1;

        return true;

    }

    // Método para retornar o endereço do nó passado como entrada.
    private No pegaNo(int posicao){

        No atual = inicioDaLista; // Instância um nó com o endereço do início da lista.
        
        // Se a posição do nó for maior que 0 e menor que a quantidade de nós. A posição é válida para verificação.
        if(posicao>=0 && posicao<quantidadeDeNos){

            // A lista será varrida até a posição anterior ao nó, onde sempre atualizaremos a posição da váriavel atual.
            for(int i=0;i<posicao;i++){

                atual = atual.getReferencia(); // Quando chegar ao nó escolhido, a posição atual séra o no anterior. Pegamos a referência que informa a posição do nó passado como entrada.

            }

        }else{

            System.out.println("Posição não existe!");

        }
        return atual; 
    }

    // Método para remover o último nó da lista.
    public void remover(){

        // Caso1: Só há um bloco na lista.
        if(quantidadeDeNos==1){
            
            inicializarLista(); // Redefine a lista com valores iniciais, variável inicio e final da lista com valor null e quantidade de nós como 0;
            
         //Caso2: Há mais de um bloco na lista.
        }else if(this.quantidadeDeNos>1){

            No penultima = pegaNo(this.quantidadeDeNos-2); // Instância um nó com a posição do penultimo nó. 

            penultima.setReferencia(null); // Definimos a referência do penultimo nó com o valor null.
            this.finalDaLista = penultima; // Definimos o final da lista com o endereço do penultimo nó.
            this.quantidadeDeNos--; // Reduzimos o valor da quantidade de nós.
            
        }else{
            System.out.println("Posição não existe!");
        }
    }
   
    // Método para buscar um bloco na lista, se existir seu código retorna verdadeiro.
    public boolean buscaBloco(int codigo){

        No atual = inicioDaLista; // Instância um nó com o endereço do início da lista.
        
        // A verificação ocorre se houver blocos na lista.
        if(this.quantidadeDeNos>0){

            // Varremos a lista do início ao fim, caso encontre o bloco o processo é encerrado.
            for(int i=0;i<quantidadeDeNos;i++){

                // Se o bloco atual for o bloco procurado, retornamos verdadeiro. Encerra o processo.
                if(codigo==atual.getBloco().getCodigoBloco()){

                  return true;

                }
                else{
                    // Caso o bloco atual não seja o procurado, atualizamos o endereço do nó atual para o próximo nó da lista.
                    atual = atual.getReferencia();

                }
            }
        }

        // Se o bloco procurado não pertencer a lista, retornamos falso.
        return false;
    }
    
    // Método para retornar o código do último nó da lista.
    public int ultimoBloco(){

        No atual = inicioDaLista; // Instância um nó com o endereço do início da lista.
        int i = 0; // Variável para auxiliar ao varrer da lista.

        // Enquanto não chegarmos ao último nó, o endereço do nó atual será atualizado com o endereço do próximo nó.
        while( i < quantidadeDeNos-1){

            atual = atual.getReferencia();
            i++;

        }
        
        // O nó atual é o último da lista, retornamos o código do bloco.
        return atual.getBloco().getCodigoBloco();
    }
    
    // Método para retornar todos os códigos dos blocos presentes na lista.
    public String toString(){

        String saida = ""; // Variável auxiliar para armazenar a saída.

        // Se não há nós na lista, retorno um texto vazio. 
        if(this.quantidadeDeNos==0){

            saida = "";

        }else{

            No atual = inicioDaLista; // Instância um nó com o endereço do início da lista.

            // Percorro toda a lista, pegando o valor do código do bloco e adicionando a variável saida.
            for(int i=0;i<quantidadeDeNos;i++){

                saida+= atual.getBloco().getCodigoBloco()+" ";

                // Só vamos para o próximo nó se a referência do nó atual for diferente de null (pois representa que já estamos no último nó).
                if(atual.getReferencia()!=null){

                    atual = atual.getReferencia();

                }
            }
        }
        return saida; // Retorna o texto com todos os códigos dos blocos presentes na lista.
    }
}