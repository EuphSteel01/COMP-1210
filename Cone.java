import java.text.DecimalFormat;
/** 
 * The driver for UserInfo. 
 *
 * @author Jess Banister
 * @version 2/7/21
 */
public class Cone {
 /**
  *Interprets ticket input.
  *@param args command line argument (not used)
  */
   //fields
   private String label = "";
   private double height = 0;
   private double radius = 0;
   
   /**cone base constructor.
    *@param labelIn user input for label
    *@param heightIn user input for height
    *@param radiusIn user input for radius
    */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
   //methods
   /**gets label input.
    *@return label returns label
    */
   public String getLabel() {
      return label;
   }
   /**sets label input.
    *@param labelIn user input for label
    *@return isSet returns if set or not
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**gets height input.
    *@return returns height 
    */
   public double getHeight() {
      return height;
   }
   /**sets height input.
    *@param heightIn user input for height
    *@return isSet returns if set or not
    */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   /**gets radius input.
    *@return returns radius 
    */
   public double getRadius() {
      return radius;
   }
   /**sets radius input.
    *@param radiusIn user input for radius
    *@return isSet returns if set or not
    */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   /**
    * This method finds the perimeter of the base of the cone.
    * @return returns the perimeter of the base
    */
   public double basePerimeter() {
      double basePerimeter = (radius * 2) * Math.PI;
      return basePerimeter;
   }
   /**
    * This method finds the are of the base of the cone.
    * @return returns the area of the base.
    */
   public double baseArea() {
      double baseArea = (Math.pow(radius, 2) * Math.PI);
      return baseArea;
   }
   /**
    * This method finds the slant height of the cone.
    * @return returns the slant height.
    */
   public double slantHeight() {
      double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
      return slantHeight;
   }
   /**
    * This method finds the area of the side of the cone.
    * @return returns the side area.
    */
   public double slantArea() {
      double slantArea = slantHeight() * radius * Math.PI;
      return slantArea;
   }
   /**
    * This method finds the area of the side of the cone.
    * @return returns the side area.
    */
   public double sideArea() {
      double sideArea = slantHeight() * radius * Math.PI;
      return sideArea;
   }
   /**
    * This method finds the surface area of the cone.
    * @return returns the surface area.
    */
   public double surfaceArea() {
      double surfaceArea = baseArea() + slantArea();
      return surfaceArea;
   }
   /**
    * This method finds the volume of the cone.
    * @return returns the volume.
    */
   public double volume() {
      double volume = Math.pow(radius, 2) * (height / 3) * Math.PI;
      return volume;
   }
   /**
     * This method prints the information of the cone.
    * @return returns the information of the cone.
    */
   public String toString() {
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      return "\"" + label + "\" is a cone with height = "
         + dFmt.format(height) + " units and radius = "
         + dFmt.format(radius) + " units,\n"
         + "which has base perimeter = "
         + dFmt.format(basePerimeter()) + " units, base area = "
         + dFmt.format(baseArea()) + " square units,\n"
         + "slant height = " + dFmt.format(slantHeight())
         + " units, side area = " + dFmt.format(sideArea())
         + " square units,\n" + "surface area = "
         + dFmt.format(surfaceArea()) + " square units,"
         + " and volume = " + dFmt.format(volume())
         + " cubic units.";
   }
   
   
}