package pages;

import elementmap.VerTarefasMantisElementMap;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import properties.TestRule;

public class VerTarefasMantisPage extends VerTarefasMantisElementMap {

    public VerTarefasMantisPage(){
        PageFactory.initElements(TestRule.getDriver(),this);
    }

    public void acessoUmaDasTarefasCriadas() {
        btnNumeroTarefa.click();
    }

    public void validareiQueAFuncionalidadeEstaLevandoParaAPaginaCorreta() {
        Assert.assertTrue(btnMonitorar.isDisplayed());
    }

    public void adicionoUmaAnotacaoATarefaCriada() {
        txtAnotacao.click();
        txtAnotacao.sendKeys("Adicionar uma anotação");
        btnAdicionarAnotacao.click();
    }

    public void validareiQueAAnotacaoFoiCriadaComSucesso() {
        Assert.assertTrue(txtValidacaoAnotacao.isDisplayed());
    }

}
