import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;



public class MarketingCampaignPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests main method. 
    * @throws FileNotFoundException if the file cannot be opened.
   **/
   @Test public void mainMethod() throws FileNotFoundException {
      MarketingCampaign.resetCount();
      
      String[] args1 = {};
      MarketingCampaignPart2.main(args1);
      
      Assert.assertEquals(0, MarketingCampaign.getCount());
   }
   
   /** Tests main method. 
    * @throws FileNotFoundException if the file cannot be opened.
   **/
   @Test public void mainMethod2() throws FileNotFoundException {
      MarketingCampaign.resetCount();
      
      String[] args1 = {"marketing_campaign_data_1.csv"};
      MarketingCampaignPart2.main(args1);
      
      Assert.assertEquals(5, MarketingCampaign.getCount());
   }
}
