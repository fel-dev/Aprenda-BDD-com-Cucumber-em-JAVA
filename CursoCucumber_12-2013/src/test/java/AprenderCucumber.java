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
             
       cal.set(Calendar.DAY_OF_MONTH, dia);
       cal.set(Calendar.MONTH, mes - 1);
       cal.set(Calendar.YEAR, ano);
       entrega = cal.getTime();
       
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mês|mes|meses)$") // 2 dias
    public void aEntregaAtrasarEmDias(Integer tempoEmAtrasado, String unidadeDeTempo) throws Throwable {
//    	Calendar cal = Calendar.getInstance();
        cal.setTime(entrega);
        
        if (unidadeDeTempo.equals("dia") || unidadeDeTempo.equals("dias")) {
        	cal.roll(Calendar.DAY_OF_MONTH, tempoEmAtrasado);
    	}
        
	        else if (unidadeDeTempo.equals("mes") || unidadeDeTempo.equals("meses") || unidadeDeTempo.equals("mês")) {
	    		cal.roll(Calendar.MONTH, tempoEmAtrasado);
	    	} 
        
		        else {
		    		System.out.println("\n\n+----------- --- -- -   -");
		    		System.out.println("|Error: Verify the unit of time. Accepted \"dias\" or \"meses\".");
		    		System.out.println("|A Unidade de tempo informada: \"" + unidadeDeTempo + "\"");
		    		System.out.println("+----------- --- -- -   -\n\n");
		    		throw new cucumber.api.PendingException();
		    	};

        entrega = cal.getTime();
        
    }

    @Então("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$") // 07/04/2018
    public void aEntregaSeráEfetuadaEm(String dataEsperada) throws Throwable  {
    	
    	DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    	String dataFormatada = formatador.format(entrega);
    	    	
    	Assert.assertEquals(dataEsperada,dataFormatada);
    }
    
    @Dado("^que o ticket( especial)? é (\\b[A-Z]{2}\\d{3,4}\\b)$")
    public void queOTicketÉAF(String tipo, String ticket) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void queOValorDaPassagemÉR$(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Dado("que o nome do passageiro é \"(.*)\"$")
    public void queONomeDoPassageiroÉ(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Dado("que o telefone do passageiro é {int}-{int}")
    public void queOTelefoneDoPassageiroÉ(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Quando("criar os steps")
    public void criarOsSteps() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Então("o teste vai funcionar")
    public void oTesteVaiFuncionar() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }


}
