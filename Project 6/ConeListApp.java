import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
/** 
 * Project_05 - ConeListApp. 
 *
 * @author Jess Banister
 * @version 2/14/21
 */
public class ConeListApp {
   /**
   * This method prints out a cone list.
   * @param args Command line (not used).
   * @throws IOException for scanning file title.
   */
   public static void main(String[] args) throws IOException {
      String coneListName = "";
      String labelIn = "";
      double heightIn = 0;
      double radiusIn = 0;
      
      ArrayList<Cone> myList = new ArrayList<Cone>();
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      coneListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         labelIn = scanFile.nextLine();
         heightIn = Double.parseDouble(scanFile.nextLine());
         radiusIn = Double.parseDouble(scanFile.nextLine());
         Cone newCone = new Cone(labelIn, heightIn, radiusIn);
         myList.add(newCone);
      }
      ConeList coneList1 = new ConeList(coneListName, myList);
      System.out.println(coneList1.toString());
      System.out.println(coneList1.summaryInfo());
   }
}