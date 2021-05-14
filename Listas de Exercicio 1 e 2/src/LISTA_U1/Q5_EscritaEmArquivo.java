package LISTA_U1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q5_EscritaEmArquivo {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String nomeArquivo, sequenciaPalavras, caminhoArquivo;
        System.out.println("");

        System.out.println("Informe o nome do arquivo: ");
        nomeArquivo = entrada.nextLine();

        System.out.println("Informe a sequencia de palavras para registrar no arquivo: ");
        sequenciaPalavras = entrada.nextLine();

        System.out.println("");

        caminhoArquivo= "src//LISTA_U1//"+nomeArquivo+".txt";

        File arquivo = new File(caminhoArquivo);
        FileWriter fw = null;
        PrintWriter escrita = null;

        if(!arquivo.isFile()){
            System.out.println("Arquivo não existe!");

            try{
                arquivo.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            }catch(IOException ioe){
                System.err.println("Erro ao criar o arquivo!");
            }
        }
        try{
            fw = new FileWriter(arquivo);
            escrita = new PrintWriter(fw);
            escrita.println(sequenciaPalavras);

            System.out.println("Sequencia de palavras salvas com sucesso!");
        }catch(IOException ioe){
            System.err.println("Erro ao savar sequencia de palavras!");
        }finally{
           try{
            escrita.close();
            fw.close();
           }catch(IOException ioe){
               System.err.println("Erro no fechamento dos arquivos!");
           }
        }
        entrada.close();
    }

    
}
