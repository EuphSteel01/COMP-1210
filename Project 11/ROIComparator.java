import java.util.Comparator;
/** DirectMC is derived from MarketingCampaign.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class ROIComparator implements Comparator<MarketingCampaign> {
   /**
    * Compares two MarketingCampaign.
    * @param c1 first MarketingCampaign
    * @param c2 second MarketingCampaign
    * @return int for order
   */
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.calcROI() < c2.calcROI()) {
         return 1;
      }
      else if (c1.calcROI() > c2.calcROI()) {
         return -1;
      }
      else {
         return 0;
      }
   }
}