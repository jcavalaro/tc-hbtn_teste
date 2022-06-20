public class TesteEmail {

    static Pessoa pessoa;

    public static boolean testar_email_com_arroba(){
        boolean resultado = pessoa.emailValid("email_teste@dominio.com.br");
        return resultado;
    }

    public static boolean testar_email_sem_arroba(){
        boolean resultado = pessoa.emailValid("email_testedominio.com.br");
        return resultado;
    }

    public static boolean testar_email_mais_50_caracteres(){
        boolean resultado = pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        return resultado;
    }

}
