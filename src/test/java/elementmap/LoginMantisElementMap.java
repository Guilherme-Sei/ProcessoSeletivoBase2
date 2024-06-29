package elementmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMantisElementMap {


    @FindBy(xpath = "//input[@id='username']")
    public WebElement campo_nome_do_usuario;
    @FindBy(xpath = "//input[@class='width-40 pull-right btn btn-success btn-inverse bigger-110']")
    protected WebElement btn_entrar;
    @FindBy(id = "password")
    protected WebElement campo_senha;
    @FindBy(xpath = "//a[.='Relatados por Mim']")
    protected WebElement lbl_relatados_por_mim;

    @FindBy(css = ".alert-danger > p")
    protected WebElement msg_erro;

}
