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
//	    System.out.println("Contador agora é: " + contador);
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) throws Throwable{
	    contador = contador + int1;
//	    System.out.println("Contador agora é: " + contador);
//	    System.out.println("Incremento é: " + int1);
	}

	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) throws Throwable{
		System.out.println("Incremento é: " + int1);
	    System.out.println("Contador agora é: " + contador);
	    System.out.println(int1 == contador);
//	    Assert.assertTrue(int1 == contador);
	    Assert.assertEquals(int1, contador);
	}

}
