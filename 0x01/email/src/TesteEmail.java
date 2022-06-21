import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteEmail {

    static Pessoa pessoa;

    @Test
    public void testar_email_com_arroba(){
        assertTrue(pessoa.emailValid("email_teste@dominio.com.br"));
        // boolean resultado = pessoa.emailValid("email_teste@dominio.com.br");

        //utilizar assertTrue
        //return resultado;
    }

    @Test
    public void testar_email_sem_arroba(){
        assertFalse(pessoa.emailValid("email_testedominio.com.br"));
        //boolean resultado = pessoa.emailValid("email_testedominio.com.br");
        //utilizarassertFalse
        //return resultado;
    }

    @Test
    public void testar_email_mais_50_caracteres(){
        //boolean resultado = pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        //testar com assertEquals

        assertEquals(false, pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
        //return resultado;
    }


}
