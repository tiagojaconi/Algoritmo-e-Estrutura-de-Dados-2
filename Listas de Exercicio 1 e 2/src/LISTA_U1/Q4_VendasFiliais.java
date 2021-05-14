package LISTA_U1;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


class Q4_VendasFiliais{
    public static void main(String args[]) throws IOException{

        FileReader fr = null;
        BufferedReader br = null;
        String arquivo = "src\\LISTA_U1\\Q4_VendasFiliais.txt";

        int codigoFilial=0, quantidadeVendasFilial1=0, quantidadeVendasFilial2=0, quantidadeVendasFilial3=0, quantidadeVendasFilial4=0;
        double vendas=0, vendasFilial1=0, vendasFilial2=0, vendasFilial3=0, vendasFilial4=0;
        String[] entrada= new String[2];


        try{
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        String linha = br.readLine();
        
        while (linha != null){
            
            entrada = linha.split(",");

            codigoFilial= Integer.parseInt(entrada[0]);
            vendas= Double.parseDouble(entrada[1]);

            switch(codigoFilial){
                case 1: {
                    vendasFilial1+=vendas;
                    quantidadeVendasFilial1++;
                    break;
                }
                case 2: {
                    vendasFilial2+=vendas;
                    quantidadeVendasFilial2++;
                    break;
                }
                case 3: {
                    vendasFilial3+=vendas;
                    quantidadeVendasFilial3++;
                    break;
                }
                case 4: {
                    vendasFilial4+=vendas;
                    quantidadeVendasFilial4++;
                    break;
                }
                default: {break;}
            }
            linha = br.readLine();
        }
        System.out.println("");
        
        if(quantidadeVendasFilial1!=0){
            System.out.println("Filial 1: Total de Vendas= R$"+String.format("%.2f",vendasFilial1)+" | Média de vendas= R$"+String.format("%.2f",(vendasFilial1/2)));
        }else{
            System.out.println("Filial 1: Sem vendas!");
        }
        if(quantidadeVendasFilial2!=0){
            System.out.println("Filial 2: Total de Vendas= R$"+String.format("%.2f",vendasFilial2)+" | Média de vendas= R$"+String.format("%.2f",(vendasFilial2/2)));
        }else{
            System.out.println("Filial 2: Sem vendas!");
        }
        if(quantidadeVendasFilial3!=0){
            System.out.println("Filial 3: Total de Vendas= R$"+String.format("%.2f",vendasFilial3)+" | Média de vendas= R$"+String.format("%.2f",(vendasFilial3/2)));
        }else{
            System.out.println("Filial 3: Sem vendas!");
        }
        if(quantidadeVendasFilial4!=0){
            System.out.println("Filial 4: Total de Vendas= R$"+String.format("%.2f",vendasFilial4)+" | Média de vendas= R$"+String.format("%.2f",(vendasFilial4/2)));
        }else{
            System.out.println("Filial 4: Sem vendas!");
        }

        }catch (FileNotFoundException e){
            System.err.println("\"" + arquivo + "\" não existe.");
        }catch (IOException e){
            System.err.println("Erro na leitura do arquivo.");
        }finally{
            br.close();
            fr.close();
        }
    }
}