public class App {
    public static void main(String[] args) throws Exception {
        
        //System.out.println(fatorialIterativo(5));
        System.out.println(fatorialRecursivo(5));
        System.out.println(potencial(2, 5));
        

    }

    public static int fatorialIterativo(int n){

        int f = 1;
        while(n > 0){
        
            f = f * n;
            n = n-1;
        }
        return f;
    }

    public static int fatorialRecursivo(int n){

        if(n==1){

            return 1;

        }else{

            return n*fatorialRecursivo(n-1);

        }
    }

    public static int potencial( int base, int exponecial){

        if( exponecial == 0){

            return 1;

        }

        return (base* potencial(base, (exponecial-1)));

    }
    
    
}
