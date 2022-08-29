import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** DirectMC is derived from MarketingCampaign.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class DirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for setName.
    *
    */
   @Test public void setName() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.setName("Ads Mailing");
      Assert.assertEquals(test.getName(), "Ads Mailing");

   }
   
   /** Test for setRevenue.
    *
    */
   @Test public void setRevenue() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.setRevenue(15000.00);
      Assert.assertEquals(test.getRevenue(), 15000.00, 0.01);

   }
   
   /** Test for getCount.
    *
    */
   @Test public void getCount() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.resetCount();
      Assert.assertEquals(test.getCount(), 0, 1);

   }
   
   /** Test for resetCount.
    *
    */
   @Test public void resetCount() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.resetCount();
      Assert.assertEquals(test.getCount(), 0, 1);

   }
   
   /** Test for getCostPerMailPiece.
    *
    */
   @Test public void getCostPerMailPiece() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(test.getCostPerMailPiece(), 3.00, 0.01);

   }
   
   /** Test for getCostPerMailPiece.
    *
    */
   @Test public void setCostPerMailPiece() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.setCostPerMailPiece(4.00);
      Assert.assertEquals("Cost is not equal", 4.00, test.getCostPerMailPiece(),
            0.01);
   }
   
   /** Test for getNumberOfMailPieces.
    *
    */
   @Test public void getNumberOfMailPieces() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(test.getNumberOfMailPieces(), 2000, 1);
   }
   
   /** Test for setNumberOfMailPieces.
    *
    */
   @Test public void setNumberOfMailPieces() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      test.setNumberOfMailPieces(1000);
      Assert.assertEquals("Number is not equal", 1000, 
         test.getNumberOfMailPieces(), 1);
   }
   
   /** Test for campaignCost.
    *
    */
   @Test public void campaignCost() {
      DirectMC test = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("Cost is not equal", 7000.00, test.campaignCost(),
            1.00);
   }
   
   /** Test for toString.
    *
    */
   @Test public void toStringTest() {
      DirectMC test = new DirectMC("Ad Mailing", 15000.00, 3.00, 2000);
      String toStringTest = "Ad Mailing (class DirectMC)" 
         + "\nRevenue: $15,000.00   Campaign Cost: $7,000.00   ROI: 114.29%" 
         + "\n   Base Cost: $1,000.00"
         + "\n   Mail Cost: $6,000.00 = $3.00 per mail piece "
         + "* 2000 mail pieces";
      Assert.assertEquals("Output string not equal", toStringTest,
         test.toString());
   }
}
