import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;


public class MarketingCampaignPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests main method. 
    * @throws FileNotFoundException if the file cannot be opened.
   **/
   @Test public void mainTest() throws IOException, InvalidCategoryException
   {
      String[] args = new String[1];
      args[0] = "pet_boarding_data2.csv";
      MarketingCampaignPart3.main(args);
      String[] args1 = new String[0];
      MarketingCampaignPart3.main(args1);
      MarketingCampaignList mcList = new MarketingCampaignList();
      MarketingCampaign[] campList = new MarketingCampaign[7];
      pList.setPetList(petList);
      
      pList.readFile("pet_boarding_data2.csv");
   
      Assert.assertTrue("main test",
         pList.generateReport().contains("Boarding Report"));
      
   }
}
