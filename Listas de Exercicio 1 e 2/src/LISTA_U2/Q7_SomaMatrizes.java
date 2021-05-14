package LISTA_U2;

import java.util.Scanner;

public class Q7_SomaMatrizes {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("");

        int tamanhoMatriz = 0;

        System.out.print("Informe o tamanho da matriz (NxN): ");
        tamanhoMatriz = entrada.nextInt();

        int matriz1[][] = new int[tamanhoMatriz][tamanhoMatriz];
        int matriz2[][] = new int[tamanhoMatriz][tamanhoMatriz];
        int matriz3[][] = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("");

        // Informar dados da matriz 1.
        for (int i = 0; i < tamanhoMatriz; i++){

            for (int j = 0; j < tamanhoMatriz; j++){

                System.out.print("Informe o valor para matriz 1 posicao ["+i+"]["+j+"] = ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");

        // Informar dados da matriz 2.
        for (int i = 0; i < tamanhoMatriz; i++){

            for (int j = 0; j < tamanhoMatriz; j++){

                System.out.print("Informe o valor para matriz 2 ["+i+"]["+j+"] = ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        System.out.println("");
        System.out.println("Resultado da soma da matriz 1 e da matriz 2 => matriz 3: ");
        for (int i = 0; i < tamanhoMatriz; i++){

            for (int j = 0; j < tamanhoMatriz; j++){

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.println("Matriz 3 posicao ["+i+"]["+j+"] = "+ matriz3[i][j]);    
            }
        }
        entrada.close();
    }
}
