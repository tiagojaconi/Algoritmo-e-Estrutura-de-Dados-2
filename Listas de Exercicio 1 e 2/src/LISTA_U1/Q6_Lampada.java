package LISTA_U1;

class Lampada{
    private String estado;

    public Lampada(){}

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void Acender(){
        this.setEstado("Acessa");
    }

    public void Apagar(){
        this.setEstado("Apagada");
    }

    public void AcenderMeiaLuz(){
        this.setEstado("Meia-Luz");
    }

    public String toString(){
        return this.getEstado();
    }
}
public class Q6_Lampada{
    public static void main(String[] args){

        System.out.println("");

        Lampada lampada1 = new Lampada();
        lampada1.Apagar();
        System.out.println("Estado lampada 1: "+lampada1.toString());

        Lampada lampada2 = new Lampada();
        lampada2.Acender();
        System.out.println("Estado lampada 2: "+lampada2.toString());

        Lampada lampada3 = new Lampada();
        lampada3.AcenderMeiaLuz();
        System.out.println("Estado lampada 3: "+lampada3.toString());
    }
}