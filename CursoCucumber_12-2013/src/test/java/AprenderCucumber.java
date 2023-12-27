import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;


public class AprenderCucumber {

	@Dado("^que crei o arquivo corretamente$")
	public void que_crei_o_arquivo_corretamente() {
	    System.out.println("Passou aqui!");
	}

	@Quando("^executa-lo$")
	public void executa_lo() {
		System.out.println("Passou aqui também!");
	}

	@Então("^a especificacao deve finalizar com sucesso$")
	public void a_especificacao_deve_finalizar_com_sucesso() {
		System.out.println("Passou aqui ! ! !");
	}
	
}
