import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;


public class AprenderCucumber {

    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() throws Throwable {
    }

    @Quando("^executa-lo$")
    public void executaLo() throws Throwable {
    }

    @Então("^a especificação deve finalizar com sucesso$")
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
    
    
    private Date entrega = new Date();
    private Calendar cal = Calendar.getInstance();

    
    @Dado("^que o prazo é dia (\\d+)/(\\d+)/(\\d+)$") // 05/04/2018
    public void queOPrazoÉDia(Integer dia, Integer mes, Integer ano) throws Throwable {
//       Calendar cal = Calendar.getInstance();
       
       System.out.println("\n\nLOG: CAL: " + cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH) + 1 ) + "/"+cal.get(Calendar.YEAR) + "\n\n");
       
       cal.set(Calendar.DAY_OF_MONTH, dia);
       cal.set(Calendar.MONTH, mes - 1);
       cal.set(Calendar.YEAR, ano);
       entrega = cal.getTime();
       
       System.out.println("\n\nLOG: Dia da Esperado da Entrega: " + entrega + "\n\n");
    }

    @Quando("^a entrega atrasar em (\\d+) dias$") // 2
    public void aEntregaAtrasarEmDias(Integer diasAtrasado) throws Throwable {
//    	Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        cal.roll(Calendar.DAY_OF_MONTH, diasAtrasado);
        entrega = cal.getTime();
        
        System.out.println("\n\n LOG: Modificado o Dia da Entrega (se atrasar): " + entrega +"\n\n");
    }

    @Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$") // 07/04/2018
    public void aEntregaSeráEfetuadaEm(String dataEsperada) throws Throwable  {
        // Transform a Data type in String Type
    	System.out.println("\nData Esperada: " + dataEsperada);
    	
    	DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    	String dataFormatada = formatador.format(entrega);
    	
    	System.out.println("Data Formatada: " + dataFormatada + "\n");
    	
    	Assert.assertEquals(dataEsperada,dataFormatada);
    }

}
