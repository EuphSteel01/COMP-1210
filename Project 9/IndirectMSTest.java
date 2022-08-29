import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** IndirectMC is derived from DirectMC.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for getCostPerAd.
    *
    */
   @Test public void getCostPerAd() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setCostPerAd(2.0);
      Assert.assertEquals(test.getCostPerAd(), 2.0, 0.1);

   }
   
   /** Test for setCostPerAd.
    *
    */
   @Test public void setCostPerAd() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setCostPerAd(2.0);
      Assert.assertEquals("Cost is not equal", 2.0, test.getCostPerAd(),
            0.1);
   }
   
   /** Test for getNumberOfAds.
    *
    */
   @Test public void getNumberOfAds() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setNumberOfAds(3500);
      Assert.assertEquals(test.getNumberOfAds(), 3500, 1);
   }
   
   /** Test for setNumberOfAds.
    *
    */
   @Test public void setNumberOfAds() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setNumberOfAds(4500);
      Assert.assertEquals("Cost is not equal", 4500, test.getNumberOfAds(),
            1);
   }
   
   /** Test for getBaseCost.
    *
    */
   @Test public void getBaseCost() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(test.getBaseCost(), 1500.0, 1.0);
   }
   
   /** Test for campaignCost.
    *
    */
   @Test public void campaignCost() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("Cost is not equal", 8500.00, test.campaignCost(),
            1.00);
   }
   
   /** Test for toString.
    *
    */
   @Test public void toStringTest() {
      IndirectMC test = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      test.setCostPerAd(2.0);
      test.setNumberOfAds(3500);
      String toStringTest = "Web Ads 1 (class IndirectMC)" 
         + "\nRevenue: $15,000.00   Campaign Cost: $8,500.00   ROI: 76.47%" 
         + "\n   Base Cost: $1,500.00"
         + "\n   Ad Cost: $7,000.00 = $2.00 per ad * 3500 ads";
      Assert.assertEquals("Output string not equal", toStringTest,
         test.toString());
   }
}
