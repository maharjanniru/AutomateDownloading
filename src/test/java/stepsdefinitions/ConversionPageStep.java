package stepsdefinitions;

import cucumber.api.java.en.When;
import modules.pageObjects.YoutubeToMp3ConversionPage;

public class ConversionPageStep {
    public YoutubeToMp3ConversionPage youtubeToMp3ConversionPage;

    @When("^user sends url (.*) in video url input$")
    public void userSendsUrlNnInVideoUrlInput(String url) {
        System.out.println(url);
        System.out.println("test");
    }
}
