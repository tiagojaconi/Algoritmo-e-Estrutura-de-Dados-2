package LISTA_U1;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Q1_NumerosNaturaisImpares {
    public static void main(String[] args) throws Exception {

        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("");
            
            System.out.println("Informe um numero inteiro positivo:");
            int numero= entrada.nextInt();
            int cont= 1;

            for(int i=0;i<numero;){
                
                if((cont%2) != 0){
                    System.out.print(cont+", ");
                    i++;
                }
                cont++;
            }
            entrada.close();
        }catch(NoSuchElementException e){
            System.err.println("Entrada inválida, o valor esperado é um numero inteiro!");
            System.exit(1);
        }
    }
}