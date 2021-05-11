/**
* @author Tiago Jaconi
*/

public class No{

    /*------------------------
        ATRIBUTOS DA CLASSE
    -------------------------*/

    private Bloco bloco; // Váriavel para armazernar o endereço do bloco atual.
    private No referencia; // Referência do próximo bloco.

    /*------------------------
        CONSTRUTOR DA CLASSE
    --------------------------*/

    public No(int codigoBloco){

        Bloco novoBloco = new Bloco(codigoBloco); // Instância um novo Bloco, com o código fornecido.
        bloco = novoBloco; // Armazena o endereço do bloco instânciado na variável bloco.

    }

    /*------------------------
        MÉTODOS DA CLASSE
    --------------------------*/ 

    // Método para resgatar o endereço do bloco.
    public Bloco getBloco() {

        return bloco;

    }

    // Método para resgatar a referência do próximo bloco.
    public No getReferencia() {

        return referencia;

    }

    // Método para registrar a referência do próximo bloco.
    public void setReferencia(No referencia) {

        this.referencia = referencia;
        
    }
}