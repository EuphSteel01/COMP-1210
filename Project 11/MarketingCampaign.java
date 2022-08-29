import java.text.DecimalFormat;

/** MarketingCampaign describes marketing campaign 
 * data and provides methods to access the data.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public abstract class MarketingCampaign {
   protected String name;
   protected double revenue;
   protected static int count = 0;
   
   /** This is the constructor for MarketingCampaign.
    *
    * @param nameIn takes in the name
    * @param revenueIn takes the revenue in
    */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   /** The method getName returns the string name.
    * 
    * @return returns string
    */
   public String getName() {
      return name;
   }
   
   /** The method setName sets the field.
    *
    * @param nameIn takes in the name
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /** The methid getRevenue returns revenue.
    * 
    * @return returns revenue
    */
   public double getRevenue() {
      return revenue;
   }
   
   /** This method setRevenue sets the 
    * value for the variable revenue.
    *
    * @param revenueIn takes the revenue in
    */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /** The method getCount returns the count.
    *
    * @return returns count
    */
   public static int getCount() {
      return count;
   }
   
   /** The method resetCount resets 
    * the count to zero when called.
    *
    */
   public static void resetCount() {
      count = 0;
   }
   
   /** The method calcROI calculates the ROI and returns the ROI.
    *
    * @return returns ROI
    */
   public double calcROI() {
      double roi = (revenue - campaignCost()) / campaignCost();
      return roi;
   }
   
   /** The method toString outputs all 
    * of the information in a string.
    *
    * @return returns string
    */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      DecimalFormat roi = new DecimalFormat("0.##%");
      String string = this.getName() + " (" + this.getClass() + ")"
         + "\nRevenue: " + mv.format(getRevenue()) + "   Campaign Cost: "
         + mv.format(campaignCost()) + "   ROI: " + roi.format(calcROI());
      return string;
   }
   
   /** This method campaignCost returns 
    * the cost for the campaign.
    * 
    * @return returns cost
    */
   public abstract double campaignCost();
   
   /** This method compareTo returns 
    * an int.
    * 
    * @param object  is an object
    * @return returns an int
    */
   public int compareTo(MarketingCampaign object) {
      return this.name.toLowerCase().compareTo(object.name.toLowerCase());
   }
}