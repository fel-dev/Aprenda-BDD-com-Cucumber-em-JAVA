import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class AprenderCucumber {

    @Dado("^que crei o arquivo corretamente$")
    public void queCreiOArquivoCorretamente() throws Throwable {
    }

    @Quando("^executa-lo$")
    public void executaLo() throws Throwable {
    }

    @Então("^a especificacao deve finalizar com sucesso$")
    public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
    }

    private int contador = 0;

    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(Integer int1) throws Throwable {
        contador = int1;
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(Integer int1) throws Throwable {
        contador = contador + int1;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSerá(Integer int1) throws Throwable {
        Assert.assertEquals((Integer) int1, (Integer) contador);
    }
    
    
    Date entrega = new Date();
    
    @Dado("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$")
    public void queOPrazoÉDia(Integer dia, Integer mes, Integer ano) throws Throwable {
       Calendar cal = Calendar.getInstance();
       cal.add(Calendar.DAY_OF_MONTH, dia);
       cal.add(Calendar.MONTH, mes);
       cal.add(Calendar.YEAR, ano);
       entrega = cal.getTime();
    }

    @Quando("^a entrega atrasar em (\\d+) dias$")
    public void aEntregaAtrasarEmDias(Integer int1) throws Throwable {
    	Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        cal.add(Calendar.DAY_OF_MONTH, (Integer) int1);
        entrega = cal.getTime();
    }

    @Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void aEntregaSeráEfetuadaEm(String data) throws Throwable  {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

}
