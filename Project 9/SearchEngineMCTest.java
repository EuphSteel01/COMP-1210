import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** IndirectMC is derived from DirectMC.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for getBaseCost.
    *
    */
   @Test public void getBaseCost() {
      SearchEngineMC test = new SearchEngineMC("Web Ads 2", 
         27500.00, 2.50, 5000);
      Assert.assertEquals(test.getBaseCost(), 2000.0, 1.0);

   }
   
   /** Test for toString.
    *
    */
   @Test public void toStringTest() {
      SearchEngineMC test = new SearchEngineMC("Web Ads 1", 
         15000.00, 2.0, 3500);
      test.setCostPerAd(2.0);
      test.setNumberOfAds(3500);
      String toStringTest = "Web Ads 1 (class SearchEngineMC)" 
         + "\nRevenue: $15,000.00   Campaign Cost: $9,000.00   ROI: 66.67%" 
         + "\n   Base Cost: $2,000.00"
         + "\n   Ad Cost: $7,000.00 = $2.00 per ad * 3500 ads";
      Assert.assertEquals("Output string not equal", toStringTest,
         test.toString());
   }
}
