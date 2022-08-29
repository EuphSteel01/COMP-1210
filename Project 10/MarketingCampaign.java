import java.io.FileNotFoundException;

/** DirectMC is derived from MarketingCampaign.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class MarketingCampaignPart2 {
   /**
    * Main method.
    * @param args not used
    * @throws FileNotFoundException if the file cannot be opened.
    */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command argument.\n"
            + "Program ending.");
      }
      
      else {
         MarketingCampaignList test = new MarketingCampaignList();
         test.readFile(args[0]);
         
         System.out.println(test.generateReport());
               
         System.out.println(test.generateReportByName());
      
         System.out.println(test.generateReportByCampaignCost());
         
         System.out.println(test.generateReportByROI());
      }
   }

}
