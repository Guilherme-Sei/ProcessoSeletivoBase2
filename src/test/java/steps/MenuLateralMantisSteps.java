package steps;

import io.cucumber.java.en.*;
import pages.MenuLateralMantisPage;

public class MenuLateralMantisSteps {

    MenuLateralMantisPage menuLateralMantisPage = new MenuLateralMantisPage();

    @When("acesso a funcionalidade Minha visao no menu lateral")
    public void acessoAFuncionalidadeMinhaVisaoNoMenuLateral() {
        menuLateralMantisPage.acessoAFuncionalidadeMinhaVisaoNoMenuLateral();
    }

    @When("acesso a funcionalidade Ver tarefas no menu lateral")
    public void acessoAFuncionalidadeVerTarefasNoMenuLateral() {
        menuLateralMantisPage.acessoAFuncionalidadeVerTarefasNoMenuLateral();
    }

    @When("acesso a funcionalidade criar tarefas no menu lateral")
    public void acessoAFuncionalidadeCriarTarefasNoMenuLateral() {
        menuLateralMantisPage.acessoAFuncionalidadeCriarTarefasNoMenuLateral();
    }

    @When("acesso a funcionalidade registro de mudanca no menu lateral")
    public void acessoAFuncionalidadeRegistroDeMudancaNoMenuLateral() {
        menuLateralMantisPage.acessoAFuncionalidadeRegistroDeMudancaNoMenuLateral();
    }

    @When("acesso a funcionalidade planejamento no menu lateral")
    public void acessoAFuncionalidadePlanejamentoNoMenuLateral() {
        menuLateralMantisPage.acessoAFuncionalidadePlanejamentoNoMenuLateral();
    }

    @Then("validarei que a funcionalidade minha visão foi acessada com sucesso")
    public void validareiQueAFuncionalidadeMinhaVisãoFoiAcessadaComSucesso() {
        menuLateralMantisPage.validareiQueAFuncionalidadeMinhaVisãoFoiAcessadaComSucesso();
    }

    @Then("validarei que a funcionalidade ver tarefas foi acessada com sucesso")
    public void validareiQueAFuncionalidadeVerTarefasFoiAcessadaComSucesso() {
        menuLateralMantisPage.validareiQueAFuncionalidadeVerTarefasFoiAcessadaComSucesso();
    }

    @Then("validarei que a funcionalidade criar tarefas foi acessada com sucesso")
    public void validareiQueAFuncionalidadeCriarTarefasFoiAcessadaComSucesso() {
        menuLateralMantisPage.validareiQueAFuncionalidadeCriarTarefasFoiAcessadaComSucesso();
    }

    @Then("validarei que a funcionalidade registro de mudanca foi acessada com sucesso")
    public void validareiQueAFuncionalidadeRegistroDeMudancaFoiAcessadaComSucesso() {
        menuLateralMantisPage.validareiQueAFuncionalidadeRegistroDeMudancaFoiAcessadaComSucesso();
    }

    @Then("validarei que a funcionalidade planejamento foi acessada com sucesso")
    public void validareiQueAFuncionalidadePlanejamentoFoiAcessadaComSucesso() {
        menuLateralMantisPage.validareiQueAFuncionalidadePlanejamentoFoiAcessadaComSucesso();
    }


}
