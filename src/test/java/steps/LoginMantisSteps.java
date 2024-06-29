package steps;

import io.cucumber.java.en.*;
import pages.LoginMantisPage;

public class LoginMantisSteps {

    LoginMantisPage loginMantis = new LoginMantisPage();

    @Given("acesso a URL da plataforma")
    public void acessoAURLDaPlataforma() {
        loginMantis.acessoAURLDaPlataforma();
    }

    @When("preencho as informacoes de usuario e senha")
    public void preenchoAsInformacoesDeUsuarioESenha() {
        loginMantis.preenchoAsInformacoesDeUsuarioESenha();
    }

    @When("preencho com as informacoes de usuario e senha incorretos")
    public void preenchoComAsInformacoesDeUsuarioESenhaIncorretos() {
        loginMantis.preenchoComAsInformacoesDeUsuarioESenhaIncorretos();

    }

    @Then("validarei que os dados foram preenchidos corretamente")
    public void validareiQueOsDadosForamPreenchidosCorretamente() {
       loginMantis.validareiQueOsDadosForamPreenchidosCorretamente();
    }

    @Then("validarei a mensagem de erro {string}")
    public void validareiAMensagemDeErro(String mensagem) {
        loginMantis.validareiAMensagemDeErro(mensagem);
    }



}
