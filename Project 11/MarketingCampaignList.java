import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/** DirectMC is derived from MarketingCampaign.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class MarketingCampaignList {
   private MarketingCampaign[] objects = new MarketingCampaign[20];
   private String[] invalidRecords = new String[20];
   
   
   /** This is the constructor for MarketingCampaignList.
    *
    */
   public MarketingCampaignList() {
      objects = new MarketingCampaign[0];
      invalidRecords = new String[0];
   }
   
   /** The method getMarketingCampaignArray 
    * returns the array objects.
    *
    * @return returns objects
    */
   public MarketingCampaign[] getMarketingCampaignArray() {
      return objects;
   }
   
   /** The method getInvalidRecordsArray 
    * returns the array invalidRecords.
    *
    * @return returns invalidRecords
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /** The method addMarketingCampaign 
    * takes in MarketingCampaign array.
    *
    * @param object MarketingCampaign object
    */
   public void addMarketingCampaign(MarketingCampaign object) {
      objects = Arrays.copyOf(objects, objects.length + 1);
      objects[objects.length - 1] = object;
   }
   
   /** The method addInvalidRecord 
    * takes in MarketingCampaign array.
    *
    * @param records String records
    */
   public void addInvalidRecord(String records) {
      invalidRecords = Arrays.copyOf(invalidRecords, 
         invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = records;
   }
   
   /** The method readFile reads 
    * the contents of given files.
    *
    * @param nameIn is the name 
    * of the desired file to be imported
    * @throws FileNotFoundException if the file cannot be opened.
    */
   public void readFile(String nameIn) 
      throws FileNotFoundException {
      
      Scanner scan = new Scanner(new File(nameIn));
            
      while (scan.hasNext()) {
         String cat = "";
         String name = "";
         char code = 's';
         double revenue = 0.0;
         int numberOfThings = 0;
         double costPerThing = 0.0;
         
         String strRevenue = "";
         String strCost = "";
         String strNumber = "";
         
         String type = scan.nextLine();
         Scanner scan2 = new Scanner(type);
         scan2.useDelimiter(",");
         
         try {
            cat = scan2.next();
            code = cat.charAt(0);
            name = scan2.next();
            strRevenue = scan2.next();
            strCost = scan2.next();
            strNumber = scan2.next();
         
            revenue = Double.parseDouble(strRevenue);
            costPerThing = Double.parseDouble(strCost);
            numberOfThings = Integer.parseInt(strNumber);
         
            switch(code) {
               case 'D':
                  DirectMC dmc = new DirectMC(name, revenue, costPerThing, 
                     numberOfThings);
                  this.addMarketingCampaign(dmc);
                  break;
               case 'I':
                  IndirectMC idmc = new IndirectMC(name, revenue, 
                     costPerThing, numberOfThings);
                  this.addMarketingCampaign(idmc);
                  break;
               case 'S':
               
                  SearchEngineMC semc = new SearchEngineMC(name, 
                     revenue, costPerThing, numberOfThings);
                  this.addMarketingCampaign(semc);
                  break;
               case 'M':
               
                  SocialMediaMC smmc = new SocialMediaMC(name, revenue, 
                     costPerThing, numberOfThings);
                  this.addMarketingCampaign(smmc);
                  break; 
               default:
                  InvalidCategoryException e = new
                     InvalidCategoryException(String.valueOf(code));
                  String error = type;
                  error += "\n" + e;
                  addInvalidRecord(error);
                  break;
            }
         }
         
         catch (NumberFormatException e) {
            String error = type;
            error += "\n" + e;
            addInvalidRecord(error);  
         }
               
         catch (NoSuchElementException e) {
            String error = type;
            error += "\n" + e;
            error += ": For missing input data";
            addInvalidRecord(error);  
         } 
      }
   }
   
   
   /** The method generateReport generates 
    * a report on the data pulled.
    * 
    * @return returns a String
    */
   public String generateReport() {
      String output = "";
      
      output += "-----------------------------------------\n";
      output += "Marketing Campaign Report\n";
      output += "-----------------------------------------\n\n";
      
      int i = 0;
      while (i < objects.length) {
         output += objects[i].toString() + "\n\n";
         i++;
      }
      
      return output;
   }
   
   /** The method generateReportByName generates 
    * a report on the data pulled.
    * 
    * @return returns a String
    */
   public String generateReportByName() {
      Arrays.sort(getMarketingCampaignArray());
      String output = "";
      
      output += "-----------------------------------------\n";
      output += "Marketing Campaign Report (by Name)\n";
      output += "-----------------------------------------\n\n";
      
      int i = 0;
      while (i < objects.length) {
         output += objects[i].toString() + "\n\n";
      
         i++;
      }
      return output;
   }
   
   /** The method enerateReportByCampaignCost generates 
    * a report on the data pulled.
    * 
    * @return returns a String
    */
   public String generateReportByCampaignCost() {
      Arrays.sort(objects, new CampaignCostComparator());
      String output = "";      
      output = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Lowest Campaign Cost)\n"
         + "-------------------------------------------------\n\n";
      
      int i = 0;
      while (i < objects.length) {
         output += objects[i].toString() + "\n\n";
      
         i++;
      }
      return output;
   }
   
   /** The method generateReportByROI generates 
    * a report on the data pulled.
    * 
    * @return returns a String
    */
   public String generateReportByROI() {
      Arrays.sort(objects, new ROIComparator());
   
      String output = "";
      
      output += "-------------------------------------------------\n";
      output += "Marketing Campaign Report (by Highest ROI)\n";
      output += "-------------------------------------------------\n\n";
      
      int i = 0;
      while (i < objects.length) {
         output += objects[i].toString() + "\n\n";
      
         i++;
      }
      return output;
      
   }
   /** The method generateInvalidRecordsReport generates 
    * a report on the data pulled.
    * 
    * @return returns a String
    */
   public String generateInvalidRecordsReport() {
      String output = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------";
         
      int i = 0;
      while (i < invalidRecords.length) {
         output += "\n\n" + invalidRecords[i].toString();
         i++;
      }
      return output;
   }
}