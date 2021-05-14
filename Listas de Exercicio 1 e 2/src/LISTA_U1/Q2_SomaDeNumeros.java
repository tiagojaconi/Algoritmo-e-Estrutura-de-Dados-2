package LISTA_U1;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Q2_SomaDeNumeros {
    public static void main(String[] args) throws Exception {
        
        try{
            Scanner entrada= new Scanner(System.in);
            float soma= 0, numero= 0;
            
            do{
                System.out.println("Informe um numero: (\"-1\" para sair e exibir a soma.) ");
                numero = entrada.nextFloat();
                if(numero!= -1){
                    soma+=numero;
                }
            }while(numero!= -1);

            System.out.println("Soma: "+soma);
            entrada.close();

        }catch(NoSuchElementException e){
            System.err.println("Entrada inválida!");
            System.exit(1);
        } 
    }
}