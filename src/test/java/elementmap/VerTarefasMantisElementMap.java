package elementmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class VerTarefasMantisElementMap {
    @FindBy(xpath = "//table[@id='buglist']//a[.='0000920']")
    protected WebElement btnNumeroTarefa;

    @FindBy(css = "[value='Monitorar']")
    protected WebElement btnMonitorar;

    @FindBy(id = "bugnote_text")
    protected WebElement txtAnotacao;

    @FindBy(css = "[value='Adicionar Anotação']")
    protected WebElement btnAdicionarAnotacao;

    @FindBy(css = "#bugnotes.widget-box tr:nth-of-type(1) > .bugnote-note")
    protected WebElement txtValidacaoAnotacao;



}
