package stepsdefinitions.commonsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import modules.implementation.YoutubeToMp3Conversion;
import modules.n.IYoutubeToMp3Conversion;

public class ConversionCommonStep{
   public IYoutubeToMp3Conversion iConversionPage;

    public ConversionCommonStep(){

        iConversionPage = new YoutubeToMp3Conversion();
    }

    @Given("^ConversionPage is launched$")
    public void launch(){
        iConversionPage.launch();

    }


}
