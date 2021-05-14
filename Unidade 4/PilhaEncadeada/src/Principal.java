/**
 * 
 * @autor Tiago Jaconi
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
       
        int opcao = -1; // Opção para sair do menu principal
        
        int    codigo;       // Código do usuário
        String nome;       // Nome do usuário
        
        // Objeto para trabalhar dados pelo teclado.
        Scanner entrada = new Scanner(System.in);
        
        // Instância da PilhaContigua.
        DescritorPilha pilha = new DescritorPilha();

        // Variável para armazenar o resultado dos métodos pop() e top().
        String resultado;
        
        // Enquanto a opção for diferente de zero.
        while (opcao != 0){
            
            System.out.println(" ___________________________ ");
            System.out.println("| 1 - EMPILHAR DADOS        |");
            System.out.println("| 2 - DESEMPILHAR DADOS     |");
            System.out.println("| 3 - MOSTRAR DADOS DO TOPO |");
            System.out.println("| 4 - PERCORRER PILHA       |");
            System.out.println("| 5 - QUANTIDADE DE NÓS     |");
            System.out.println("|___________________________|");
            System.out.println("| 0 - Sair da aplicação     |");
            System.out.println("|___________________________|");
            
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
                
                    System.out.println(" _____________________  ");
                    System.out.println("|      EMPILHANDO     | ");
                    System.out.println("|_____________________| ");
                    
                    System.out.print("Informe o nome: ");
                    nome = entrada.next();
                        
                    do{

                        System.out.print("Informe o código: ");
                        codigo = entrada.nextInt();

                    }while(codigo < 0); // Enquanto digitar um código negativo, solicita o código novamente.
                        
                    if(pilha.push(codigo, nome)){
                        
                        System.out.println("\nDados do usuário inserido com sucesso!");

                    }else{
                        
                        System.out.println("Aconteceu algo...");
                        
                    }
                    
                break;
                
                case 2:	
                
                    System.out.println(" _____________________  ");
                    System.out.println("|    DESEMPILHANDO    | ");
                    System.out.println("|_____________________| ");

                    resultado = pilha.pop();

                    if( !resultado.equals("") ){

                        System.out.println(resultado);

                    }else{

                        System.out.println("Pilha vazia...");
                    
                    }

                break;
                    
                case 3: 
                
                    System.out.println(" _____________________  ");
                    System.out.println("|    DADOS DO TOPO    | ");
                    System.out.println("|_____________________| ");

                    resultado = pilha.top();

                    if( !resultado.equals("") ){

                        System.out.println(resultado);

                    }else{

                        System.out.println("Pilha vazia...");
                        
                    }
                    
                break;
                
                case 4: 
                
                    System.out.println(" _____________________  ");
                    System.out.println("|      PERCORRENDO    | ");
                    System.out.println("|_____________________| ");

                    System.out.println(pilha.print());
                        
                break;
                
                case 5: 
                
                    System.out.println(" _________________________  ");
                    System.out.println("|     TOTAL DE PESSOAS    | ");
                    System.out.println("|_________________________| ");


                    System.out.print("Total de pessoas: ");
                    System.out.println(pilha.size());
                        
                break;
                
                default: System.out.println("Entrada inválida!");
                
            }
            
            System.out.print("\n");
    
        }
        
    }
    
}
