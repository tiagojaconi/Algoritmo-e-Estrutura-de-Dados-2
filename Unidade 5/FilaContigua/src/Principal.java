/**
 * 
 * @autor Tiago Jaconi
 */

import java.io.File;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
       
        int opcao = -1; // Opção para sair do menu principal
        
        int    codigo;       // Código do usuário
        String nome;       // Nome do usuário
        
        // Objeto para trabalhar dados pelo teclado.
        Scanner entrada = new Scanner(System.in);
        
        // Instância da Fila.
        DescritorFila fila = new DescritorFila();

        // Variável para armazenar o resultado dos métodos.
        String resultado;

        // Variável para tratar a criação da Fila.
        boolean filaCriada = false;
        
        // Enquanto a opção for diferente de zero.
        while (opcao != 0){
            
            System.out.println(" ____________________________");
            System.out.println("| 1 - CRIAR FILA             |");
            System.out.println("| 2 - ENFILEIRAR  DADOS      |");
            System.out.println("| 3 - DESENFILEIRAR DADOS    |");
            System.out.println("| 4 - MOSTRAR FRENTE DA FILA |");
            System.out.println("| 5 - PERCORRER FILA         |");
            System.out.println("| 6 - QUANTIDADE DE NÓS      |");
            System.out.println("|____________________________|");
            System.out.println("| 0 - Sair da aplicação      |");
            System.out.println("|____________________________|");
            
            System.out.print("Escolha uma opção = ");
            opcao = entrada.nextInt();
            
            System.out.print("\n");
            
            switch (opcao){

                case 0:	
                    
                    System.out.println(" _____________________  ");
                    System.out.println("| SAINDO DA APLICAÇÃO | ");
                    System.out.println("|_____________________| ");

                    entrada.close();

                break;

                case 1:	
                    
                    if(!filaCriada){

                        System.out.print("Sua fila terá quantos nós? ");
                        int tamanhoFila = entrada.nextInt();
                        fila.queue(tamanhoFila);
                        filaCriada = true;
                        System.out.println("Fila criada com sucesso -> Fila["+tamanhoFila+"]");
                    
                    }else{

                        System.out.println("Fila já foi criada!");

                    }

                break;

                case 2:	
                
                    System.out.println(" _____________________  ");
                    System.out.println("|     ENFILEIRANDO    | ");
                    System.out.println("|_____________________| ");
                    
                    if(filaCriada){

                        System.out.print("Informe o nome: ");
                        nome = entrada.next();
                            
                        do{

                            System.out.print("Informe o código: ");
                            codigo = entrada.nextInt();

                        }while(codigo < 0); // Enquanto digitar um código negativo, solicita o código novamente.
                            
                        if(fila.enqueue(codigo, nome)){
                            
                            System.out.println("\nDados do usuário inserido com sucesso!");

                        }else{
                            
                            System.out.println("Aconteceu algo...");
                            
                        }

                    }else{

                        System.out.println("É necessário criar a fila primeiro...");

                    }

                    
                break;
                
                case 3:	
                
                    System.out.println(" _____________________  ");
                    System.out.println("|   DESENFILEIRANDO   | ");
                    System.out.println("|_____________________| ");

                    resultado = fila.dequeue();

                    if( !resultado.equals("") ){

                        System.out.println(resultado);

                    }else{

                        System.out.println("Pilha vazia...");
                    
                    }

                break;
                    
                case 4: 
                
                    System.out.println(" _____________________  ");
                    System.out.println("|    FRENTE DA FILA   | ");
                    System.out.println("|_____________________| ");

                    resultado = fila.front();

                    if( !resultado.equals("") ){

                        System.out.println(resultado);

                    }else{

                        System.out.println("Pilha vazia...");
                        
                    }
                    
                break;
                
                case 5: 
                
                    System.out.println(" _____________________  ");
                    System.out.println("|      PERCORRENDO    | ");
                    System.out.println("|_____________________| ");

                    System.out.println(fila.print());
                        
                break;
                
                case 6: 
                
                    System.out.println(" _________________________  ");
                    System.out.println("|     TOTAL DE PESSOAS    | ");
                    System.out.println("|_________________________| ");


                    System.out.print("Total de pessoas: ");
                    System.out.println(fila.size());
                        
                break;
                
                default: System.out.println("Entrada inválida!");
                
            }
            
            System.out.print("\n");
    
        }
        
    }
    
}