package LISTA_U1;
import java.util.Scanner;

import java.util.NoSuchElementException;

public class Q3_CalculadoraAritmetica 
{
    public static void main(String[] args) throws Exception 
    {
        
        try
        {
            Scanner entrada= new Scanner(System.in);
            int numero1= 0, numero2= 0, opcao= 0;
            
            do
            {
                System.out.println(" Escolha uma opção: 1 - Multiplicação de inteiros, 2 - Divisão de inteiros, 3 - Adição de inteiros, 4 - Subtração de inteiros e 5 – Sair do programa.");
                opcao = entrada.nextInt();

                if((opcao!= 5)&&(opcao>0 && opcao<6))
                {
                    System.out.println("Informe o primeiro número: ");
                    numero1 = entrada.nextInt();
                    System.out.println("Informe o segundo número: ");
                    numero2 = entrada.nextInt();

                    switch(opcao)
                    {
                        case 1:{System.out.println(numero1+"*"+numero2+"= "+(numero1*numero2)); break;}
                        case 2:
                        {
                            if(numero2!=0)
                            {
                                System.out.println(numero1+"/"+numero2+"= "+(numero1/numero2));
                            }
                            else
                            {
                                System.out.println("Divisão por zero, não é permitido!");
                            }
                            break;
                        }
                        case 3:{System.out.println(numero1+"+"+numero2+"= "+(numero1+numero2)); break;}
                        case 4:{System.out.println(numero1+"-"+numero2+"= "+(numero1-numero2)); break;}
                    }
                }
            }
            while(opcao!= 5);

            entrada.close();

        }
        catch(NoSuchElementException e)
        {
            System.err.println("Entrada inválida!");
            main(args);
        }
    }
}