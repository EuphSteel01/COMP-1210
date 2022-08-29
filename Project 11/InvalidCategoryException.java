/** InvalidCategoryException is a class that 
 * defines the new subclasses of the exception class.
 *
 * @author Jess Banister
* @version 4/12/21
*/
public class InvalidCategoryException extends Exception {
   
   /** This is the constructor for the class 
    * InvalidCatagoryException.
    *
    * @param catagoryIn takes in a string that is the catagory
    */
   public InvalidCategoryException(String catagoryIn) {
      super("For category: " + catagoryIn);
   }
}