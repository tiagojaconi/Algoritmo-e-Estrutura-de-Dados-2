/**
* @author Tiago Jaconi
*/

// Bibliotecas para manipulação de arquivos e exceções. 
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) throws Exception {

        int quantidadeDeLista; // Armazena a quantidade de listas encadeadas, informação da primeira linha do arquivo.
        int quantidadeDeLinha = 0; // Armazena a quantidade de linhas, da segunda linha até o quit (contabiliza o número de comandos no arquivo).
        int listaDoNumero1, listaDoNumero2, blocoRemovido, numero1, numero2, quantidadeDeBlocosRemovidos, listaDisponivel1, listaDisponivel2; // Variáveis necessárias para execução dos comandos.
        String comando1, comando2; // Armazena o comando 1 e 2 presente no arquivo.

        // Variáveis necessárias para leitura do arquivo.
        FileReader fr = null;
        BufferedReader br = null;
        String arquivo = "src\\entrada.txt"; // Caminho do arquivo de entrada. 
        String linha;

        // Variáveis necessárias para escrita do arquivo de saida.
        String caminhoArquivoSaida= "src\\saida.txt"; // Caminho do arquivo de saída. 
        File arquivoSaida = new File(caminhoArquivoSaida);
        FileWriter fw = null;
        PrintWriter escrita = null;
    
        // O projeto possui manipulação de arquivo para leitura e escrita, usamos o try para evitar erros e trata-los caso ocorra.
        try{

            // Instânciando a leitura de arquivo.
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            linha = br.readLine(); // Faço a leitura da primeira linha do arquivo. 

            // Verificação do número de linhas de comandos presentes no arquivo;
            // Desconsiderando a primeira linha, que é a quantidade de lista.
            // Desconsiderando a última linha, que é o comando para sair.
            while (linha != null && !linha.equals("quit")){
                linha = br.readLine();
                quantidadeDeLinha++; 
            }

            // Fechamento do arquivo, para iníciar uma de nova leitura do arquivo.
            br.close();
            fr.close();

            // Instânciando uma nova leitura de arquivo.
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);

            // Com a informação da quantidade de comandos, crio o vetor para armazena-los.
            String [] comandos = new String[quantidadeDeLinha];

            // Guardo a quantidade de listas necessárias, presente na primeira linha do arquivo.
            quantidadeDeLista = Integer.parseInt(br.readLine());

            // Armazeno os comandos no vetor.
            for(int i =0; i<(quantidadeDeLinha-1); i++){
                comandos[i] = br.readLine();
            }

            // Crio um vetor de listas encadeadas.
            EstruturaDeDados[] listaEncadeada = new EstruturaDeDados[quantidadeDeLista];

            // Crio a quantidade de listas necessárias.
            for(int i =0; i<quantidadeDeLista; i++){
                EstruturaDeDados lista = new EstruturaDeDados(); // Instâncio a lista.
                lista.inserir(i, 0); // Insiro o primeiro bloco, com o número correspondente a lista.
                listaEncadeada[i] = lista; // Salvo a lista no vetor. 
            }
            
            // Mostro na tela o mundo de blocos inicial.
            System.out.println(" ");
            System.out.println("Mundo dos blocos estado inicial!\n");
            for(int i =0; i<(quantidadeDeLista); i++){

                System.out.println(i+": "+listaEncadeada[i].toString());
            }

            // Para cada comando do arquivo executamos os procedimentos abaixo. 
            for(int aux=0;aux<(comandos.length-1);aux++){

                String [] comando= comandos[aux].split(" ", 7); // Separa o comando em um vetor de 4 posições.
                // Posição: comando[0]= move ou pile. Posição: comando[1]= número do primeiro bloco. 
                // Posição: comando[2]= onto ou over. Posição: comando[3]= número do segundo bloco.

                // Inicio as variáveis para cada atualização de comandos.
                listaDoNumero1=-1;
                listaDoNumero2=-1; 
                quantidadeDeBlocosRemovidos=0; 
                listaDisponivel1=-1;
                listaDisponivel2=-1;
                
                numero1= Integer.parseInt(comando[1]); // Armazeno o valor inteiro do primeiro bloco presente no comando.
                numero2= Integer.parseInt(comando[3]); // Armazeno o valor inteiro do segundo bloco presente no comando.
                comando1= comando[0]; // Armazeno o primeiro comando.
                comando2= comando[2]; // Armazeno o segundo comando.

                // Faço a varredura de todas as listas para encontar em qual lista cada bloco está.
                for(int i =0; i<quantidadeDeLista; i++){

                    if(listaEncadeada[i].buscaBloco(numero1)){

                        listaDoNumero1=i; // Se o bloco 1 pertencer a lista armazeno o número da lista.

                    }else{
                        // Se o bloco não for encontrado, armazeno a lista como disponível para movimentação de blocos, caso não seja a lista inicial do bloco 2.
                        if(listaDisponivel1==-1 && i!=numero2){
                            listaDisponivel1=i;
                        }
                    }
                    if(listaEncadeada[i].buscaBloco(numero2)){

                        listaDoNumero2=i; // Se o bloco 2 pertencer a lista armazeno o número da lista.

                    }else{
                        // Se o bloco não for encontrado, armazeno a lista como disponível para movimentação de blocos, caso não seja a lista inicial do bloco 1.
                        if(listaDisponivel2==-1 && i!=numero2)
                        listaDisponivel2=i;
                    }
                }

                // Os comandos serão verificados e executados se a lista do bloco 1 for diferente da lista do bloco 2. E bocos do comando forem diferentes.
                if((listaDoNumero1!=listaDoNumero2)&&(numero1!=numero2)){

                    // Executamos as verificações e movimentos se os comandos estiverem corretos.
                    if(comando1.equals("move")||comando1.equals("pile")){

                        // Ajustando os blocos para liberar o espaço para movimentação final (comando 2).
                        if(comando2.equals("onto")){

                            // Para o comando onto, tenho que remover todos os blocos após o bloco número 2. 
                            // Executo somente, se a lista do bloco número 2 possuir mais que um bloco.
                            if(listaEncadeada[listaDoNumero2].getQuantidadeDeNos()>0){
                                
                                // Enquanto o último bloco não for o bloco número 2 faço movimentações. 
                                while(listaEncadeada[listaDoNumero2].ultimoBloco()!=numero2){ 
                                    
                                    blocoRemovido= listaEncadeada[listaDoNumero2].ultimoBloco(); // Pego o último bloco da lista.
                                    listaEncadeada[listaDoNumero2].remover(); // Removo o último bloco da lista.
                                    // Retorno o bloco removido para a posição final da lista inicial. 
                                    listaEncadeada[blocoRemovido].inserir(blocoRemovido, listaEncadeada[blocoRemovido].getQuantidadeDeNos());
                                    
                                }
                            }
                        }

                        if(comando1.equals("move")){  
                                
                            // Para o comando move, tenho que remover todos os blocos após o bloco número 1. 
                            // Executo somente, se a lista do bloco número 1 possuir mais que um bloco.
                            if(listaEncadeada[listaDoNumero1].getQuantidadeDeNos()>0){
                                
                                // Enquanto o último bloco não for o bloco número 1 faço movimentações. 
                                while(listaEncadeada[listaDoNumero1].ultimoBloco()!=numero1){ 

                                    blocoRemovido= listaEncadeada[listaDoNumero1].ultimoBloco(); // Pego o último bloco da lista.
                                    listaEncadeada[listaDoNumero1].remover(); // Removo o último bloco da lista.
                                    // Retorno o bloco removido para a posição final da lista inicial. 
                                    listaEncadeada[blocoRemovido].inserir(blocoRemovido, listaEncadeada[blocoRemovido].getQuantidadeDeNos());
                                    
                                }

                            }

                            
                        }else if (comando1.equals("pile")){
                            
                            // Para o comando pile, tenho que remover todos os blocos da lista do bloco número 1 e armazena-los em outra lista disponivel. 
                            // Executo somente, se a lista do bloco número 1 possuir mais que um bloco.
                            if(listaEncadeada[listaDoNumero1].getQuantidadeDeNos()>0){

                                // Enquanto o último bloco não for o bloco número 1 faço movimentações. 
                                while(listaEncadeada[listaDoNumero1].ultimoBloco()!=numero1){ 

                                    quantidadeDeBlocosRemovidos++; // Armazeno a quantidade de blocos removidos.
                                    // Pego o bloco e insiro em outra lista disponivel. 
                                    listaEncadeada[listaDisponivel1].inserir(listaEncadeada[listaDoNumero1].ultimoBloco(), listaEncadeada[listaDisponivel1].getQuantidadeDeNos());
                                    listaEncadeada[listaDoNumero1].remover(); // Removo o bloco da lista em que estava anteriormente.   
                        
                                }

                                // Removo o bloco numero 1 e insiro na lista disponivel. (Mesma lista dos blocos anteriores)
                                if(listaEncadeada[listaDoNumero1].ultimoBloco()==numero1){

                                    quantidadeDeBlocosRemovidos++; // Armazeno a quantidade de blocos removidos. 
                                    listaEncadeada[listaDisponivel1].inserir(listaEncadeada[listaDoNumero1].ultimoBloco(), listaEncadeada[listaDisponivel1].getQuantidadeDeNos());
                                    // Pego o bloco e insiro em outra lista disponivel.
                                    listaEncadeada[listaDoNumero1].remover();// Removo o bloco da lista em que estava anteriormente.

                                }
                            }
                        }
                       
                        // Movendo os blocos para as posições solicitadas.
                        if(comando1.equals("move")){

                            // Se o comando número 1 for move, pego o bloco número 1.
                            blocoRemovido= listaEncadeada[listaDoNumero1].ultimoBloco();
                            listaEncadeada[listaDoNumero1].remover(); // Removo o bloco número 1 da lista em que estava.
                            // Insiro o bloco número 1 na lista do bloco número 2. 
                            listaEncadeada[listaDoNumero2].inserir(blocoRemovido, listaEncadeada[listaDoNumero2].getQuantidadeDeNos());
                        
                        }else{

                            // Se o comando número 1 for pile, pego os blocos removidos e inseridos na lista disponivel. 
                            for(int i=0;i<quantidadeDeBlocosRemovidos;i++){

                                // Insiro o bloco removido na lista do bloco número 2. 
                                listaEncadeada[listaDoNumero2].inserir(listaEncadeada[listaDisponivel1].ultimoBloco(), listaEncadeada[listaDoNumero2].getQuantidadeDeNos());
                                listaEncadeada[listaDisponivel1].remover(); // Removo o bloco da lista em que estava.

                            }
                        }
                        
                        // Informo na tela cada um dos comandos realizados e como ficou a lista após o comando.
                        System.out.println(" ");
                        System.out.println("\nComando "+(aux+1)+": "+comando1+" "+numero1+" "+comando2+" "+numero2);

                        for(int i =0; i<(quantidadeDeLista); i++){

                            System.out.println(i+": "+listaEncadeada[i].toString());
                        }
                        
                    }else{

                        // Se o comando do arquivo estiver errado apresento na tela a mensagem.
                        System.out.println("Arquivo com dados no formato inválido!");

                    }  
                }
            }

            // Verifico se o arquivo de saida existe, caso não, crio o mesmo.
            if(!arquivoSaida.isFile()){

                try{

                    arquivoSaida.createNewFile();
                    
                }catch(IOException ioe){
                    System.err.println("Erro ao criar o arquivo!");
                }
            }

            // Informo na tela como ficou a lista final e gravo no arquivo de saida.
            System.out.println(" ");
            System.out.println("Mundo dos blocos saida final!!!\n");

            fw = new FileWriter(arquivoSaida);
            escrita = new PrintWriter(fw);

            for(int i =0; i<(quantidadeDeLista); i++){

                escrita.println(i+": "+listaEncadeada[i].toString()); // Gravo no arquivo.
                System.out.println(i+": "+listaEncadeada[i].toString()); // Informo na tela.

            }
            
        }catch (FileNotFoundException e){

        System.out.println("\"" + arquivo + "\" não existe."); // Captura de exceção, caso o arquivo não exista. 

        }catch (IOException e){

        System.out.println("Erro na leitura ou escrita do arquivo."); // Captura de exceção, caso não seja possivel ler ou escrever no arquivo.
        }finally{

            // Fechamento dos arquivos, entrada e saida. 
            br.close();
            fr.close();
            escrita.close();
            fw.close();
            
        }
    }
}