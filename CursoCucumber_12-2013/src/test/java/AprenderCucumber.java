import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class AprenderCucumber {

//	public void que_crei_o_arquivo_corretamente() throws Throwable {
	@Dado("que crei o arquivo corretamente")
	public void queCreiOArquivoCorretamente() {
	}

	@Quando("executa-lo")
	public void executaLo() {
	}

	@Então("a especificacao deve finalizar com sucesso")
	public void aEspecificacaoDeveFinalizarComSucesso() {
	}
	
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) throws Throwable{
	    contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) throws Throwable{
	    contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) throws Throwable{
	    Assert.assertEquals((Integer)int1, (Integer)contador);
		new RuntimeException();
	}

}
