package LISTA_U2;

import java.util.Scanner;

public class Q8_SequenciaSemNumerosRepetidos {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");

        System.out.print("Informe a quantidade de números reais: ");
        int quantidadeNumeros = entrada.nextInt();

        float numeros[] = new float[quantidadeNumeros];

        System.out.println("");

        float numero;

        for (int i = 0; i < quantidadeNumeros;){

            System.out.print("Informe o valor " + (i+1) + ": ");
            numero = entrada.nextFloat();

            if ( pesquisar(numeros,quantidadeNumeros,numero) == -1 ){
                numeros[i] = numero;
                i++;
            }
        }
        
        System.out.println("");
        System.out.println("Valores do vetor: ");


        for (int i = 0; i < quantidadeNumeros; i++){

            System.out.println("numeros[" + (i+1) + "] = " + numeros[i]);
            
        }
        entrada.close();

    }

    public static int pesquisar(float novoNumeros[], int novaQuantidadeDeNumeros, float novoNumero){

        for(int j = 0;j < novoNumeros.length;j++){
            if(novoNumero==novoNumeros[j]){
                return 1;
            }
        }
        return -1;
    }
}