package LISTA_U1;

import java.util.Scanner;

class Calculadora{
    private double numero1;
    private double numero2;
    private char operacao;

    public Calculadora(){}

    // _n1= numero1, _n2= numero2 e _op = operacao.
    public Calculadora(Double _n1, Double _n2, char _op){
        this.setNumero1(_n1);
        this.setNumero2(_n2);
        this.setOperacao(_op);
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double _n1) {
        this.numero1 = _n1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double _n2) {
        this.numero2 = _n2;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char _op) {
        this.operacao = _op;
    }

    public String calcular(){
        String resultado="";
        double calculo;

        switch(this.getOperacao()){

            case '+': { 
                calculo= this.getNumero1()+this.getNumero2();
                resultado = this.getNumero1()+" + "+this.getNumero2()+"= "+calculo;
                break;
            }
            case '-': { 
                calculo= this.getNumero1()-this.getNumero2();
                resultado = this.getNumero1()+" - "+this.getNumero2()+"= "+calculo;
                break;
            }
            case '*': { 
                calculo= this.getNumero1()*this.getNumero2();
                resultado = this.getNumero1()+" * "+this.getNumero2()+"= "+calculo;
                break;
            }
            case '/': { 
                calculo= this.getNumero1()/this.getNumero2();
                resultado = this.getNumero1()+" / "+this.getNumero2()+"= "+String.format("%.2f",calculo);
                break;
            }
            default: {break;}
        }
        return resultado;
    }
}
class Q7_Calculadora{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        char tipoDeCalculo;

        System.out.println("");
        System.out.print("Informe o primeiro numero: ");
        num1 = entrada.nextFloat();
        System.out.print("Informe o segundo numero: ");
        num2 = entrada.nextFloat();
        System.out.print("Informe o tipo de operacao (+, -, * ou /): ");
        tipoDeCalculo = entrada.next().charAt(0);

        // O = instanciando uma operação da calculadora.
        Calculadora O = new Calculadora(num1,num2, tipoDeCalculo);
        
        System.out.println("");
        System.out.println(O.calcular());

        entrada.close();
    }
}
