package modules.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class YoutubeToMp3ConversionPage {
    private WebDriver driver;

    public YoutubeToMp3ConversionPage(WebDriver driver){
        this.driver = driver;
    }

    public SelenideElement getVideoUrlInput(){
        return $(byXpath("//*[@id='input']"));
    }

    public SelenideElement getConvertButton(){
        return $(byXpath("//*[@id=\"submit\"]"));
    }

    public SelenideElement getDownloadButton(){
        return $(byXpath("//*[@id=\"buttons\"]/a[1]"));
    }

    public SelenideElement getConvertNextButton(){
        return $(byXpath("//*[@id=\"buttons\"]/a[3]"));
    }
}
