import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** SocialMediaMC is derived from DirectMC.
 *
 * @author Jess Banister
 * @version 3/27/21
 */

public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for getBaseCost.
    *
    */
   @Test public void getBaseCost() {
      SocialMediaMC test = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      Assert.assertEquals(test.getBaseCost(), 3000.0, 1.0);
   }
   
   /** Test for toString.
    *
    */
   @Test public void toStringTest() {
      SocialMediaMC test = new SocialMediaMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setCostPerAd(2.0);
      test.setNumberOfAds(3500);
      String toStringTest = "Web Ads 1 (class SocialMediaMC)" 
         + "\nRevenue: $15,000.00   Campaign Cost: $10,000.00   ROI: 50%" 
         + "\n   Base Cost: $3,000.00"
         + "\n   Ad Cost: $7,000.00 = $2.00 per ad * 3500 ads";
      Assert.assertEquals("Output string not equal", toStringTest,
         test.toString());
   }
}
