import java.text.DecimalFormat;

/** 
 * TetrahedronList is a class that stores the name 
 * of the list and an array of Tetrahedron objects.
 *
 * @author Jess Banister
 * @version 3/25/21
 */
public class TetrahedronList {
   private String name = "";
   private Tetrahedron[] list;
   private int number;
   
   /**
    * Constructor.
   *
   * @param nameIn represents the name of the list
   * @param listIn is an array of objects
   * @param numberIn is the number of objects in the array
   */
   public TetrahedronList(String nameIn, Tetrahedron[] listIn, 
      int numberIn) {
      name = nameIn;
      list = listIn;
      number = numberIn;
   }
   
   /** getName returns the list name.
    *
    * @return returns name
    */
   public String getName() {
      return name;
   }
   
   /** numberOfTetrahedrons returns the 
    *  number of Tetrahedrons in a given list.
    *
    * @return returns number
    */
   public int numberOfTetrahedrons() {
      return number;
   }
   /** totalSurfaceArea returns the total surface area.
    *
    * @return returns surface area
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      for (int i = 0; i < number; i++) {
         Tetrahedron surf = list[i];
         totalSurfaceArea += surf.surfaceArea();
      }
      return totalSurfaceArea;
   }
   
   /** totalVolume returns the total volume.
    *
    * @return returnds total volume
    */
   public double totalVolume() {
      double totalVolume = 0.0;
      for (int i = 0; i < number; i++) {
         Tetrahedron tot = list[i];
         totalVolume += tot.volume();
      }
      return totalVolume;
   }
   
   /** averageSurfaceArea returns the  average surface area.
    *
    * @return returns average surface area
    */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0.0;
      if (number != 0) {
         averageSurfaceArea = totalSurfaceArea() / (double) number;
      }
      return averageSurfaceArea;
   }
   
   /** averageVolume returns the average volume.
    *
    * @return returns average volume
    */
   public double averageVolume() {
      double averageVolume = 0.0;
      if (number != 0) {
         averageVolume = totalVolume() / (double) number;
      }
      return averageVolume;
   }
   
   /** toString creates a string and returns 
    *  the string with the values inserted.
    *
    * @return returns strings
    */
   public String toString() {
      DecimalFormat nft = new DecimalFormat("#,##0.0##");
      String strings = "----- Summary for " + getName() + " -----";
      strings += "\nNumber of Tetrahedrons: " + number;
      strings += "\nTotal Surface Area: " + nft.format(totalSurfaceArea()) 
         + " square units";
      strings += "\nTotal Volume: " + nft.format(totalVolume()) 
         + " cubic units";
      strings += "\nAverage Surface Area: " + nft.format(averageSurfaceArea()) 
         + " square units";
      strings += "\nAverage Volume: " + nft.format(averageVolume()) 
         + " cubic units";
      return strings;   
   }
      
      /** getList returns the array of 
       *  the Tetrahedron object.
       * 
       * @return returns list
       */
   public Tetrahedron[] getList() {
      return list;
   }
      
      /** addTetrahedron creates a new Tetrahedron 
       *  and adds it to the list object.
       *  
       * @param labelIn takes the label of the object
       * @param edgeIn takes the edge value 
       */
   public void addTetrahedron(String labelIn, double edgeIn) {
      list[number++] = new Tetrahedron(labelIn, edgeIn);
   }
      
      /** findTetrahedron takes in an object and returns the 
       *  same object if found in the list object.
       *
       * @param labelIn takes the label of the object       
       * @return returns boolean
       */
   public Tetrahedron findTetrahedron(String labelIn) {
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }
      }
      return null;
   }
      
      /** deleteTetrahedron takes in an object and deletes the 
       *  same object if found in the list object.
       * 
       * @param labelIn takes the label of the object
       * @return returns delete
       */
   public Tetrahedron deleteTetrahedron(String labelIn) {
      Tetrahedron delete = findTetrahedron(labelIn);
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int d = i; d < number; d++) {
               list[d] = list[d + 1];
            }
            list[number--] = null;
         }
      }
      return delete;
   }
      
      /** editTetrahedron takes in an object and i the object it found then 
       *  edit the object and return true else return false.
       * 
       * @param labelIn takes the label of the object
       * @param edgeIn takes the edge value 
       * @return returns edit
       */
   public boolean editTetrahedron(String labelIn, 
         double edgeIn) {
      boolean edit = false;
      for (int i = 0; i < number; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            list[i].setEdge(edgeIn);
            edit = true;
         }
      }
      return edit;
   }
      
      /** findTetrahedronWithLargestVolume returns the 
       *  object with the largest volume.
       * 
       * @return returns lrg
       */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      if (numberOfTetrahedrons() > 0) {
         Tetrahedron lrg = list[0];
         for (int i = 1; i < numberOfTetrahedrons(); i++) {
            if (list[i].volume() > lrg.volume()) {
            
               lrg = list[i];
            } 
         }
         return lrg;
      }
      return null;
   }
}