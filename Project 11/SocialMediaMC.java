
/** SocialMediaMC is derived from DirectMC.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class SocialMediaMC extends IndirectMC {
   /** This is the constructor for IndirectMC.
    *
    */
   public static final double BASE_COST = 3000.0;
   
   /** This is the constructor for SearchEngineMC.
    *
    * @param nameIn name in
    * @param revenueIn revenue in 
    * @param costPerAdIn cost per ad
    * @param numberOfAdsIn number of ads
    */
   public SocialMediaMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
   /** This method getBaseCost() returns BASE_COST.
    *
    * @return returns BASE_COST
    */
   @Override
   public double getBaseCost() {
      return BASE_COST;
   }
}