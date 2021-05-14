package LISTA_U2;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Q6_VetorOrdenado {
    public static void main(String[] args) throws Exception {
        
        try{
            Scanner entrada= new Scanner(System.in);

            int [] numeros = new int[10];
            int [] numerosOrdenados = new int[10];
            int auxiliar= 0;
            
            for(int i=0;i<10;i++){
                System.out.print("Informe o numero "+(i+1)+": ");
                numeros[i] = entrada.nextInt();
            }
            for(int i=0;i<10;i++){
                numerosOrdenados[i] = numeros[i];
            }

            for(int i=0;i<10;i++){
                for(int j=i+1;j<10;j++){
                    if(numerosOrdenados[i]>numerosOrdenados[j]){
                        auxiliar = numerosOrdenados[i];
                        numerosOrdenados[i]= numerosOrdenados [j];
                        numerosOrdenados[j]= auxiliar;
                    }
                }
            }

            System.out.print("\n Vetor:");
            for(int i=0;i<10;i++){
                System.out.print(numeros[i]+" ");
            }
            System.out.print("\n Vetor Ordenado:");
            for(int i=0;i<10;i++){
                System.out.print(numerosOrdenados[i]+" ");
            }
            entrada.close();

        }catch(NoSuchElementException e){
            System.err.println("Entrada inválida!");
            System.exit(1);
        }
    }
}