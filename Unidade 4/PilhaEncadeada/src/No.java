/**
 * 
 * @autor Tiago Jaconi
 */

public class No {

    /*-------------------------
       ATRIBUTOS DA CLASSE
    ------------------------ */

    private int codigoUsuario;
    private String nomeUsuario;

    private No proximo;

    /*-------------------------
       CONSTRUTOR DA CLASSE
    ------------------------ */

    public No(int codigoUsuario, String nomeUsuario){

        this.codigoUsuario = codigoUsuario;
        this.nomeUsuario = nomeUsuario;
    }
    
    /*-------------------------
       MÉTODOS DA CLASSE
    ------------------------ */

    // Método para retornar o código do usuário. 
    public int getCodigoUsuario(){
        
        return codigoUsuario;

    }

    // Método para retornar o nome do usuário
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public No getProximo(){

        return proximo;

    }

    public void setProximo(No proximo){

        this.proximo = proximo;

    }
    
    // Método para retornar o código e o nome do usuário. 
    public String toString(){

        return "[ Código: " + this.getCodigoUsuario() + " | " + "Nome: " + this.getNomeUsuario() + " ]\n";
    
    }
    
}
