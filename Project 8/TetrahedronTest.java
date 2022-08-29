import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/** 
 * Tetrahedron uses test methods in order to 
 * test the methods in Testrahedron.
 *
 * @author Jess Banister
 * @version 3/8/21
 */

public class TetrahedronTest {

   /** Sets up the test file. 
    */
   @Before public void setUp() {
   }
   /** Tests the setLabel and getLabel methods.
    */
   @Test public void labelTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      test.setLabel("example");
      Assert.assertEquals("Label is not equal", "example", test.getLabel());
      Assert.assertFalse("Allowed invalid value", test.setLabel(null));
   }
   
   /** Tests the setBaseEdge and getBaseEdge methods.
    */
   @Test public void edgeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      test.setEdge(2.0);
      Assert.assertEquals("Edge is not equal", 2.0, test.getEdge(),
         1);
      Assert.assertFalse(test.setEdge(-1.0));
   }
   
   /** Tests the heigh method.
    */
   @Test public void heightTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Height is not equal", 0.816, test.height(),
         1);
   }
   
   /** Tests the surfaceArea method.
    */
   @Test public void surfaceAreaTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Surface area is incorrect", 1.732,
         test.surfaceArea(), 1);
   }
   
   /** Tests the volume method.
    */
   @Test public void volumeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("Volume is incorrect", 0.118, test.volume(), 1);
   }
   
   /** Tests the toString method of Tetrahedron.
    */
   @Test public void toStringTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      String toStringTest = "Tetrahedron \"test\" ";
      toStringTest += "with six edges of length 1.0 has:";
      toStringTest += "\n\theight = 0.816 units";
      toStringTest += "\n\tsurface area = 1.732 square units";
      toStringTest += "\n\tvolume = 0.118 cubic units";
      Assert.assertEquals("Output string not equal", toStringTest,
         test.toString());
   }
   
   /** Tests the getCount and resetCount methods.
    */
   @Test public void countTest() {
      Tetrahedron.resetCount();
      Assert.assertEquals("Count is not zero", 0, Tetrahedron.getCount());
      Tetrahedron test0 = new Tetrahedron("test0", 1.0);
      Tetrahedron test1 = new Tetrahedron("test1", 2.0);
      Tetrahedron test2 = new Tetrahedron("test2", 3.0);
      Assert.assertEquals("Count does not reflect number of created "
         + "tetrahedrons",
         3, Tetrahedron.getCount());
   }
   
   /** Tests the outcome of the equals method.
    */
   @Test public void equalsTrueTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Tetrahedron object = new Tetrahedron("test", 1.0);
      Assert.assertTrue("Object is not equal", test.equals(object));
   }
   
   /** Tests the instance of the equals method.
    */
   @Test public void equalsObjFalseTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      String object = "test";
      Assert.assertFalse("equals() does not differentiate objects",
         test.equals(object));
   }
   
   /** Tests the parameter comparison of the equals method.
    */
   @Test public void equalsTetrahedronFalseTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Tetrahedron labelIn = new Tetrahedron("test1", 1.0);
      Assert.assertFalse("label failure", test.equals(labelIn));
      Tetrahedron edgeIn = new Tetrahedron("test", 1.1);
      Assert.assertFalse("edge failure", test.equals(edgeIn));
   }
   
   
   /**
    * Tests the hashCode method.
    */
   @Test public void hashCodeTest() {
      Tetrahedron test = new Tetrahedron("test", 1.0);
      Assert.assertEquals("hashCode", 0, test.hashCode());
   }
   
   /** The first test of the compareTo method.
    *
    */
   @Test public void compareToTest1() {
      Tetrahedron test1 = new Tetrahedron("test1", 1.0);
      Tetrahedron test2 = new Tetrahedron("test2", 1.0);
      Assert.assertTrue(test1.compareTo(test2) == 0);
   }

   /** The second test of the compareTo method.
    *
    */
   @Test public void compareToTest2() {
      Tetrahedron test1 = new Tetrahedron("test1", 1.0);
      Tetrahedron test2 = new Tetrahedron("test2", 2.0);
      Assert.assertTrue(test1.compareTo(test2) < 0);
   }

   /** The third test of the compareTo method.
    *
    */
   @Test public void compareToTest3() {
      Tetrahedron test1 = new Tetrahedron("test1", 2.0);
      Tetrahedron test2 = new Tetrahedron("test2", 1.0);
      Assert.assertTrue(test1.compareTo(test2) > 0);
   }
}  