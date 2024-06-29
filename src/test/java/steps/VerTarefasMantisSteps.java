package steps;

import io.cucumber.java.en.*;
import pages.VerTarefasMantisPage;

public class VerTarefasMantisSteps {

    VerTarefasMantisPage verTarefasMantisPage = new VerTarefasMantisPage();

    @When("acesso uma das tarefas criadas")
    public void acessoUmaDasTarefasCriadas() {
        verTarefasMantisPage.acessoUmaDasTarefasCriadas();
    }

    @Then("validarei que a funcionalidade esta levando para a pagina correta")
    public void validareiQueAFuncionalidadeEstaLevandoParaAPaginaCorreta() {
        verTarefasMantisPage.validareiQueAFuncionalidadeEstaLevandoParaAPaginaCorreta();
    }

    @Then("adiciono uma anotacao a tarefa criada")
    public void adicionoUmaAnotacaoATarefaCriada() {
        verTarefasMantisPage.adicionoUmaAnotacaoATarefaCriada();
    }

    @Then("validarei que a anotacao foi criada com sucesso")
    public void validareiQueAAnotacaoFoiCriadaComSucesso() {
        verTarefasMantisPage.validareiQueAAnotacaoFoiCriadaComSucesso();
    }



}
