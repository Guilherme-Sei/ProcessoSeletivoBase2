package elementmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CriarTarefasMantisElementMap {

    @FindBy(id = "category_id")
    protected WebElement selectCategoria;

    @FindBy(id = "reproducibility")
    protected WebElement selectFrequencia;

    @FindBy(id = "severity")
    protected WebElement selectGravidade;

    @FindBy(id = "priority")
    protected WebElement selectPrioridade;

    @FindBy(css = ".fa-plus-square-o")
    protected WebElement btnMais;

    @FindBy(id = "platform")
    protected WebElement txtPlataforma;

    @FindBy(id = "os")
    protected WebElement txtSO;

    @FindBy(id = "os_build")
    protected WebElement txtVersaoSO;

    @FindBy(id = "summary")
    protected WebElement txtResumo;

    @FindBy(id = "description")
    protected WebElement txtDescricao;

    @FindBy(id = "steps_to_reproduce")
    protected WebElement txtPassoAPasso;

    @FindBy(id = "additional_info")
    protected WebElement txtInformacoesAdicionais;

    @FindBy(id = "tag_select")
    protected WebElement selectMarcador;

    @FindBy(css = ".btn-primary")
    protected WebElement btnCriarNovaTarefa;

    @FindBy(css = "[value='Monitorar']")
    protected WebElement btnMonitorar;

}
