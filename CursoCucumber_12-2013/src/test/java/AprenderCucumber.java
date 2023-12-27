import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class AprenderCucumber {

//	public void que_crei_o_arquivo_corretamente() throws Throwable {
	@Dado("que crei o arquivo corretamente")
	public void queCreiOArquivoCorretamente() {
		System.out.println("---------\nImprimindo\n---------\nQualquer coisa\n--------- ");
	}

	@Quando("executa-lo")
	public void executaLo() {
	}

	@Então("a especificacao deve finalizar com sucesso")
	public void aEspecificacaoDeveFinalizarComSucesso() {
	}

}
