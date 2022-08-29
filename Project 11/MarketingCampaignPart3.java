import java.io.FileNotFoundException;
/** MarketingCampaignPart3 is the driver for all 
 * of the other programs in this project.
 *
 * @author Jess Banister
 * @version 4/15/21
 */
public class MarketingCampaignPart3 {
   
   /** This is the main method for the class 
    * MarketingCampaignPart3.
    *
    * @param args (no other params)
    * @throws FileNotFoundException throw the exception
    */
   public static void main(String[] args) throws FileNotFoundException {
      try {
         if (args.length > 0) {
            String fileName = args[0];
            MarketingCampaignList myList = new MarketingCampaignList();
            myList.readFile(fileName);
            System.out.print(myList.generateReport());
            System.out.println();
            System.out.println(myList.generateReportByName());
            System.out.println();
            System.out.println(myList.generateReportByCampaignCost());
            System.out.println();
            System.out.println(myList.generateReportByROI());
            System.out.println();
            System.out.println(myList.generateInvalidRecordsReport());
            System.out.println();
            
         }
         else {
            System.out.println("File name expected as "
               + "command line argument.\nProgram ending.");
         }
      }
      catch (FileNotFoundException exception) {
         String fileName = args[0];
         System.out.println("*** Attempted to read file: " + fileName
            + " (No such file or directory)");
      }
       
   }
}