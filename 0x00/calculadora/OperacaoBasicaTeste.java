public class OperacaoBasicaTeste {

    static OperacaoBasica opbasica;

    public static boolean testar_soma(){
        opbasica = new OperacaoBasica();

       double resultado = opbasica.somar(5,3);
        if(resultado == 8){
            return true;
        }
        return false;
    }

    public static boolean testar_subtracao(){
        double resultado = opbasica.subtrair(5,3);
        if(resultado == 2){
            return true;
        }
        return false;
    }

    public static boolean testar_multiplicacao(){
        double resultado = opbasica.multiplicar(5,3);
        if(resultado == 15){
            return true;
        }
        return false;
    }

    public static boolean testar_divisao(){
        double resultado = opbasica.dividir(9,3);
        if(resultado == 3){
            return true;
        }
        return false;
    }


}
