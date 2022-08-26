import java.text.DecimalFormat;

/** 
 * Tetrahedron is a class that stores values to 
 * be excicuted in the Test file. 
 *
 * @author Jess Banister
 * @version 3/8/21
 */
public class Tetrahedron implements Comparable<Tetrahedron> {
   private String label = "";
   private double edge = 0;
   private static int count = 0;
   
   
   /** This is the constructor for the program.
   * @param labelIn takes input for label.
   * @param edgeIn takes input for the edge.
   */
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   /** getLabel returns the String label.
   * @return returns label.
   */
   public String getLabel() {
      return label;
   }
   
   /** setLabel takes in labelIn and returns 
   *   a boolean if is it set.
   * @param labelIn takes labelIn.
   * @return returns the boolean if set.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /** getEdge returns the double edge.
   * @return returns edge.
   */
   public double getEdge() {
      return edge;
   }
   
   /** setEdge takes in edgeIn and sets it equal to 
   *   edge and also returns a boolean.
   * @param edgeIn takes egdeIn.
   * @return returns a boolean.
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /** Takes the formula given height and inputs
   *   edge to return the double height.
   * @return returns height,
   *
   */
   public double height() {
      double height = Math.sqrt(2.0 / 3.0) * edge;
      return height;
   }
   
   /** It returns the double surface area after 
   *   setting it equal to the desired output.
   * @return returns surface area.
   */
   public double surfaceArea() {
      double surfaceArea = Math.sqrt(3) * Math.pow(edge, 2);
      return surfaceArea;
   }
   
   /** It calculates the volume.
    * @return volume Returns the calculated volume.
    */ 
   public double volume() {
      double volume = (Math.pow(edge, 3) / (6 * Math.sqrt(2)));
      return volume;
   }
   
   /** It turns the variables into the desired 
    * to string output in the correct format.
    * @return output Returns formatted output to be displayed.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "Tetrahedron \"" + label 
         + "\" with six edges of length " + fmt.format(edge)
         + " has:\n";
      output += "\theight = " + fmt.format(height()) + " units\n";
      output += "\tsurface area = " + fmt.format(surfaceArea()) 
         + " square units\n";
      output += "\tvolume = " + fmt.format(volume()) + " cubic units";
      return output;
   }
   
   /** It returns the nember of tetrahedrons 
    * created and returns that total.
    * @return returns number of tertahedrons created
    */
   public static int getCount() {
      return count;
   }
   
   /** It resets the variable count to 0.
    * 
    */
   public static void resetCount() {
      count = 0;
   }
   /** It accepts a type Object and returns false if 
    * not a Tetrahedron, otherwise it returns true.
    * @param obj is the object being analysed.
    * @return returns a boolean depending on the input.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      } else {
         Tetrahedron d = (Tetrahedron) obj; 
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(edge - d.getEdge()) < .000001);
      }
   }

   /** This is the hash code for the program that returns 0.
    *
    * @return returns 0
    */
   public int hashCode() {
      return 0;
   }
   
   public int compareTo(Tetrahedron vol) {
      if (Math.abs(this.volume - vol.volume()) < 0.000001) {
         return 0;
      } else if (this.volume < vol.volume()) {
         return -1;
      } else {
         return 1;
      }
   }
}
