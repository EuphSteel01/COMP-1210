import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/** 
 * Project_06 - ConeList. 
 *
 * @author Jess Banister
 * @version 2/23/21
 */
public class ConeList {
   private String listName;
   private ArrayList<Cone> tList = new ArrayList<Cone>();
   /**Defines number as numberIn.
   * @param listNameIn string 
   * @param tListIn string
   */
   public ConeList(String listNameIn, ArrayList<Cone>tListIn) {
      listName = listNameIn;
      tList = tListIn;
   }
   /**getName takes no parameters and returns a string.
   *
   * @return returns listName
   */
   public String getName() {
      return listName;
   }
   /**numberofCones takes no parameters and returns an int.
   *
   * @return returns listName
   */
   public int numberOfCones() {
      return tList.size();
   }
   /**totalBasePerimeter takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalBasePerimeter() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).basePerimeter();
         index++;
      }
      return total;
   }
   /**totalBaseArea takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalBaseArea() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).baseArea();
         index++;
      }
      return total;
   }
   /**totalSlantHeight takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalSlantHeight() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).slantHeight();
         index++;
      }
      return total;
   }
   /**totalSideArea takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalSideArea() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).sideArea();
         index++;
      }
      return total;
   }
   /**totalSurfaceArea takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   /**totalVolume takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).volume();
         index++;
      }
      return total;
   }
   /**averageSurfaceArea takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).surfaceArea();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   /**averageVolume takes no parameters and returns a double.
   *
   * @return returns total
   */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).volume();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   /**toString takes no parameters and returns a string.
   *
   * @return returns result
   */
   public String toString() {
      System.out.println();
      String result = listName + "\n";
      int index = 0;
      while (index < tList.size()) {
         result += "\n" + tList.get(index) + "\n";
         index++;
      }
      return result;
      
   }
   /**summaryInfo takes no parameters and returns a string.
   *   
   * @return returns result
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      System.out.println();
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + df.format(totalBasePerimeter());
      result += "\nTotal Base Area: " + df.format(totalBaseArea());
      result += "\nTotal Slant Height: "  + df.format(totalSlantHeight());
      result += "\nTotal Side Area: " + df.format(totalSideArea());
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      return result;
   }
   /** Returns the ArrayList of Cone objects.
*
* @return returns null or newConeList
*/
   public ArrayList<Cone> getList() {
      return tList;
   }
   /** Takes a String parameter representing the file name, 
   * reads in the file, storing the list name and creating 
   * an ArrayList of Cone objects.
*
* @param file is a String
* @throws IOException throw the Exception
* @return returns null or newConeList
*/
   public ConeList readFile(String file) throws IOException {
      Scanner userInput = new Scanner(new File(file));
      String newListName;
      ArrayList<Cone> newList = new ArrayList<Cone>();
      newListName = userInput.nextLine();
      while (userInput.hasNext()) {
         String name = "";
         while (userInput.hasNextLine() && !userInput.hasNextDouble()) {
            name += userInput.nextLine();
         }
         name = name.trim();
         double radius = userInput.nextDouble();
         double height = userInput.nextDouble();
         Cone c = new Cone(name, radius, height);
         newList.add(c);
      }
      userInput.close();
      ConeList newCList 
         = new ConeList(newListName, newList);
      return newCList;
   }

   /**Returns nothing but takes three parameters (label, height, 
   * and radius), creates a new Cone object.
*
* @param labelIn is a String
* @param heightIn as a double
* @param radiusIn as a double
*/ 
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      Cone c = new Cone(labelIn, radiusIn, heightIn);
      tList.add(c);
   }
      
   
   
   /** Takes a label of aCone as the String parameter 
   * and returns the corresponding Cone object.
*
* @param labelIn is a String
* @return returns result
*/
   public Cone findCone(String labelIn) {
      for (Cone c : getList()) {
         if (c.getLabel().equalsIgnoreCase(labelIn)) {
            return c;
         }
      }
      return null;
   }
   
   /** Takes a String as a parameter that represents the label 
   * of the Cone and returns the Cone.
*
* @param labelIn is a String
* @return returns result
*/
   public Cone deleteCone(String labelIn) {
      if (findCone(labelIn) != null) {
         Cone deleted = findCone(labelIn);
         tList.remove(findCone(labelIn));
         return deleted;
      }
      else {
         return null;
      }
   }
   /** Takes three parameters (label, height, and radius), 
   * uses the label to find the corresponding the Cone object.
*
* @param labelIn is a String
* @param heightIn  as a double
* @param radiusIn as a double
* @return returns true or false
*/
   public boolean editCone(String labelIn, double heightIn, double radiusIn) {
      if (findCone(labelIn) != null) {
         findCone(labelIn).setRadius(radiusIn);
         findCone(labelIn).setHeight(heightIn);
         return true;
      }
      return false;
   }
}
