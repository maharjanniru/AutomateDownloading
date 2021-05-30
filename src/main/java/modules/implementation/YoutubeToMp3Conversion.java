package modules.implementation;

import modules.n.IYoutubeToMp3Conversion;
import modules.pageObjects.YoutubeToMp3ConversionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YoutubeToMp3Conversion implements IYoutubeToMp3Conversion {
    private WebDriver driver;
    private YoutubeToMp3ConversionPage youtubeToMp3ConversionPage;

    @Override
    public void launch() {
        if(driver == null){
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver90");
            ChromeOptions options = new ChromeOptions().setHeadless(false);
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            driver.get("https://ytmp3.cc/youtube-to-mp3/");
            youtubeToMp3ConversionPage = new YoutubeToMp3ConversionPage(driver);



        }
    }
}
