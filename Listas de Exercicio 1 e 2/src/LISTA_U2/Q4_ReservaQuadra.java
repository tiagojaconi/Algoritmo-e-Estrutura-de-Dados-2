package LISTA_U2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Quadra{

    private String responsavel;
    private String data;
    private String horario;
    private String dataReserva;
    private String horarioReserva;
    
    public Quadra(){ }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String novoResponsavel) {
        this.responsavel = novoResponsavel;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String novaData) {
        this.data = novaData;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String novoHorario) {
        this.horario = novoHorario;
    }

    public String getDataReserva() {
        return this.dataReserva;
    }

    public void setDataReserva(String novaData) {
        this.dataReserva = novaData;
    }

    public String getHorarioReserva() {
        return this.horarioReserva;
    }

    public void setHorarioReserva(String novoHorario) {
        this.horarioReserva = novoHorario;
    }
    
    public void reservarQuadra(String novoResponsavel, String novaData, String novoHorario){
        this.setResponsavel(novoResponsavel);
        this.setDataReserva(novaData);
        this.setHorarioReserva(novoHorario);;
        Date diaLocado = new Date();

        this.setData(new SimpleDateFormat("dd/MM/yyyy").format(diaLocado));
        this.setHorario(new SimpleDateFormat("HH:mm:ss").format(diaLocado));
    }

    public String getRelatorio(){
        System.out.println("");
        return "\nResponsável: " + this.getResponsavel() + "\nData: " + this.getData() + "\nHorário: " + this.getHorario()+"\nData Reservada: " + this.getDataReserva() + "\nHorário Reservado: " + this.getHorarioReserva();
    }

}

public class Q4_ReservaQuadra {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        
        Quadra reserva = new Quadra();

        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Informe a data para reserva (dd/mm/aaaa): ");
        String data = entrada.nextLine();
        System.out.print("Informe o horario para reserva (hh:mm:ss): ");
        String horario = entrada.nextLine();

        reserva.reservarQuadra(nome, data, horario);
        System.out.print(reserva.getRelatorio());

        entrada.close();
    }
}