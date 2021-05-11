/**
* @author Tiago Jaconi
*/

class Bloco{

    /*------------------------
        ATRIBUTOS DA CLASSE
    -------------------------*/
    
    private int codigoBloco; // Código do bloco, é o número desse bloco.

    /*------------------------
        CONSTRUTOR DA CLASSE
    --------------------------*/  

    public Bloco(int codigoBloco){

        this.codigoBloco = codigoBloco;

    }

    /*------------------------
        MÉTODOS DA CLASSE
    --------------------------*/ 

    // Método para resgatar o código do bloco.
    public int getCodigoBloco(){

        return codigoBloco;
        
    }     
}