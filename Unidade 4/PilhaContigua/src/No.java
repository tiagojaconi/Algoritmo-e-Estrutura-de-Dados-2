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

    // Método para registrar o código do usuário.
    public void setCodigoUsuario(int codigoUsuario){

        this.codigoUsuario = codigoUsuario;

    }

    // Método para retornar o nome do usuário
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    // Método para registrar o nome do usuário.
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    // Método para retornar o código e o nome do usuário. 
    public String toString(){

        return "[ Código: " + this.getCodigoUsuario() + " | " + "Nome: " + this.getNomeUsuario() + " ]\n";
    
    }
    
}
