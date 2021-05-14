package LISTA_U2;

import java.util.Scanner;

class Complexo{

    // z = x + yi
    private double real; // x
    private double imaginaria; // y.i

    public Complexo(){ }

    // _r = real
    // _i = imaginaria
    public Complexo(double _r, double _i){
        this.real = _r;
        this.imaginaria = _i;
    }

    // Métodos get e set
    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return this.imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public String toString(){
        
        // Operador pode ser:
        // + (soma)
        // - (subtração)
        String resultado;

        if( this.getImaginaria() > 0 ){
            resultado = this.getReal() + " + " + this.getImaginaria() + "i";
        }else{
            resultado = this.getReal() + " " + this.getImaginaria() + "i";
        }

        return resultado;

    }

}

class Operacoes{

    private Complexo z1;
    private Complexo z2;

    // Método construtor
    public Operacoes(Complexo _z1, Complexo _z2){
        this.z1 = _z1;
        this.z2 = _z2;
    }

    // Métodos get e set
    public Complexo getZ1() {
        return this.z1;
    }

    public void setZ1(Complexo z1) {
        this.z1 = z1;
    }

    public Complexo getZ2() {
        return this.z2;
    }

    public void setZ2(Complexo z2) {
        this.z2 = z2;
    }

    // Operações com números complexos

    public String somar(){

        // zr = complexo resultado
        Complexo zr = new Complexo();

        zr.setReal(this.getZ1().getReal()+this.getZ2().getReal());
        zr.setImaginaria(this.getZ1().getImaginaria()+this.getZ2().getImaginaria());
       
        return this.toString(zr);

    }

    public String subtrair(){

        // zr = complexo resultado
        Complexo zr = new Complexo();

        zr.setReal(this.getZ1().getReal()-this.getZ2().getReal());
        zr.setImaginaria(this.getZ1().getImaginaria()-this.getZ2().getImaginaria());
       
        return this.toString(zr);

    }

    public String multiplicar(){

        // zr = complexo resultado
        Complexo zr = new Complexo();

        zr.setReal(this.getZ1().getReal()*this.getZ2().getReal()+this.getZ1().getImaginaria()*this.getZ2().getImaginaria()*(-1));
        zr.setImaginaria(this.getZ1().getReal()*this.getZ2().getImaginaria()+this.getZ1().getImaginaria()*this.getZ2().getReal());

        return this.toString(zr);

    }

    // Implementar a operação de divisão e gerar o resultado.
    public String dividir(){

        // zr = complexo resultado
        Complexo zr = new Complexo();

        zr.setReal((this.getZ1().getReal()*this.getZ2().getReal()+this.getZ1().getImaginaria()*this.getZ2().getImaginaria())/((this.getZ2().getReal()*this.getZ2().getReal())-(this.getZ2().getImaginaria()*this.getZ2().getImaginaria()*(-1))));
        zr.setImaginaria((this.getZ1().getReal()*this.getZ2().getImaginaria()*(-1)+this.getZ1().getImaginaria()*this.getZ2().getReal())/((this.getZ2().getReal()*this.getZ2().getReal())-(this.getZ2().getImaginaria()*this.getZ2().getImaginaria()*(-1))));
       
        return this.toString(zr);

    }

    public String toString(Complexo _zr){
        
        String resultado;

        if( _zr.getImaginaria() > 0 ){
            resultado = String.format("%.2f",_zr.getReal()) + " + " + String.format("%.2f",_zr.getImaginaria()) + "i";
        }else{
            resultado = String.format("%.2f",_zr.getReal()) + " " + String.format("%.2f",_zr.getImaginaria()) + "i";
        }

        return resultado;

    }

}

public class Q5_NumerosComplexos{
 
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
        double real, imagiario;

        System.out.println("");

        System.out.print("Informe o primeiro numero complexo (parte real): ");
        real = entrada.nextDouble();
        System.out.print("Informe o primeiro numero complexo (parte imaginaria): ");
        imagiario = entrada.nextDouble();

        Complexo C1 = new Complexo(real,imagiario);
        System.out.println("z1 = " + C1.toString());

        System.out.println("");

        System.out.print("Informe o segundo numero complexo (parte real): ");
        real = entrada.nextDouble();
        System.out.print("Informe o segundo numero complexo (parte imaginaria): ");
        imagiario = entrada.nextDouble();

        Complexo C2 = new Complexo(real,imagiario);
        System.out.println("z2 = " + C2.toString());

        Operacoes O = new Operacoes(C1,C2);
        

        System.out.println("");

        System.out.println("Soma          -> zr = " + O.somar());       // zr = 7.0 + 1.0i
        System.out.println("Subtração     -> zr = " + O.subtrair());    // zr = -3.0 + 5.0i
        System.out.println("Multiplicação -> zr = " + O.multiplicar()); // zr = 16.0 + 11.0i
        System.out.println("Divisão       -> zr = " + O.dividir());     // zr = 0.13 + 0.65i

        System.out.println("");

        entrada.close();
    }
}
