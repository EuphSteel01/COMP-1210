import java.text.DecimalFormat;

/** IndirectMC is derived from DirectMC.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class IndirectMC extends MarketingCampaign {
   protected double costPerAd;
   protected int numberOfAds;
   /** Sets the base cost.
    *
    */
   public static final double BASE_COST = 1500.0;
   
   /** This is the constructor for IndirectMC.
    *
    * @param nameIn name in
    * @param revenueIn revenue in 
    * @param costPerAdIn cost per ad
    * @param numberOfAdsIn number of ads
    */
   public IndirectMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
   
   /** The method setCostPerAd sets costPerMailPiece.
    *
    * @param costPerAdIn cost per ad
    */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
   /** This method getCostPerAd() returns costPerAd.
    *
    * @return returns costPerAd
    */
   public double getCostPerAd() {
      return costPerAd;
   }
   
   /** This method getNumberOfAds() returns numberOfAds.
    *
    * @return returns numberOfAds
    */
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
   /** The method setCostPerAd sets costPerMailPiece.
    *
    * @param numberOfAdsIn number of ads
    */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   
   /** This method getBaseCost() returns BASE_COST.
    *
    * @return returns BASE_COST
    */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /** The method campaignCost returns the cost of the campaign.
    *
    * @return returns campaignCost
    */
   public double campaignCost() {
      return (getBaseCost() + (costPerAd * numberOfAds));
   }
   
   /** The method toString outputs all 
    * of the information in a string.
    *
    * @return returns string
    */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      double total = (costPerAd * numberOfAds);
      String string = super.toString()
          + "\n   Base Cost: " 
         + mv.format(this.getBaseCost()) + "\n   Ad Cost: " 
         + mv.format(total) + " = " 
         + mv.format(getCostPerAd()) + " per ad" 
         + " * " + getNumberOfAds() 
         + " ads";
      return string;
   }
}