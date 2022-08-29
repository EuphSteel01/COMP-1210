import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * TetrahedronListTest test the various methods in TetrahedronList.
 *
 * @author Jess Banister
 * @version 3/25/21
 */
public class TetrahedronListTest {
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    */
   @Before public void setUp() {
   }
   
   /** Test the getName method in TetrahedronList.
    *
    */
   @Test public void getNameTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("getName Test",
                           "test list", list.getName());
   }
   
   /** Test the numberOfTetrahedrons method in TetrahedronList.
    *
    */
   @Test public void numberOfTetrahedronsTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("numberOfTetrahedrons Test",
                           3, list.numberOfTetrahedrons(), .0001);
   }
   
   /** Test the totalSurfaceArea method in TetrahedronList.
    *
    */
   @Test public void totalSurfaceAreaTest() {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("totalSurfaceArea Test",
                           5.1961, list.totalSurfaceArea(), .0001);
   }
   
   /** Test the averageSurfaceArea method in TetrahedronList.
    *
    */
   @Test public void averageSurfaceAreaTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageSurfaceArea Test",
                           1.7320, list.averageSurfaceArea(), .0001);
                           
      TetrahedronList tlist = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageSurfaceArea Test2",
                           0, tlist.averageSurfaceArea(), .0001);
   }
   
   /** Test the totalVolume method in TetrahedronList.
    *
    */
   @Test public void totalVolumeTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertEquals("totalVolume Test",
                           0.3535, list.totalVolume(), .0001);
   }
   
   /** Test the averageVolume method in TetrahedronList.
    *
    */
   @Test public void averageVolumeTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
     
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("averageVolume Test",
                           0.1178, list.averageVolume(), .0001);
                           
      TetrahedronList tlist = new 
         TetrahedronList("test list", null, 0);
      Assert.assertEquals("averageVolume Test2",
                           0, tlist.averageVolume(), .0001);
   }
   
   /** Test the toString method in TetrahedronList.
    *
    */
   @Test public void toStringTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
   
      Assert.assertEquals("toString test", 
                           true, 
                           list.toString().contains("----- Summary" 
                              + " for test list -----"));
   }
   
   /** Test the getList method in TetrahedronList.
    *
    */
   @Test public void getListTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 1.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 1.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Assert.assertArrayEquals("getList Test",
                           t, list.getList());
   }
   
   /** Test the addTetrahedron method in TetrahedronList.
    *
    */
   @Test public void addTetrahedronTest() {
   
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      list.addTetrahedron("test4", 1.0);
      Tetrahedron[] sA = list.getList();
      
      Assert.assertEquals("addTetrahedron Test",
                           t2, sA[3]);
   }
     
     /** Test the findTetrahedron method in TetrahedronList.
      *
      */
   @Test public void findTetrahedronTest() {
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      
      Assert.assertEquals("findTetrahedron true Test",
                           t2, list.findTetrahedron("test"));
                           
      Assert.assertEquals("findTetrahedron false Test",
                           null, list.findTetrahedron("false"));
   
   }
      
     /** Test the deleteTetrahedron method in TetrahedronList.
      *
      */
   @Test public void deleteTetrahedronTest() {
     
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
      
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      
      Tetrahedron t2 = new Tetrahedron("test4", 1.0);
      Tetrahedron t3 = new Tetrahedron("test", 8.0);
      list.addTetrahedron("test4", 1.0);
      Tetrahedron[] sA = list.getList();
      
      Assert.assertEquals("pre deleteTetrahedron Test",
                           t2, sA[3]);         
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t3, list.deleteTetrahedron("test"));
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t2, sA[2]);
   
      Assert.assertEquals("deleteTetrahedron false Test",
                           null, list.deleteTetrahedron("false"));
   }
      
      /** Test the editTetrahedron method in TetrahedronList.
       *
       */
   @Test public void editTetrahedronTest() {
      
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 8.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 7.0);
         
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      Tetrahedron t3 = new Tetrahedron("test", 9.0);
      Tetrahedron[] sA = list.getList();
         
      Assert.assertEquals("pre editTetrahedron Test",
                              t2, sA[0]);
      Assert.assertEquals("editTetrahedron true Test",
                              true, list.editTetrahedron("test", 9.0));
      Assert.assertEquals("editTetrahedron true Test",
                              t3, sA[0]);
      Assert.assertEquals("findTetrahedron false Test",
                           false, list.editTetrahedron("false", 9.0));
   }
      
      /** Test the findTetrahedronWithLargestVolume
       *  method in TetrahedronList.
       *
       */
   @Test public void findTetrahedronWithLargestVolume() {
      
      Tetrahedron[] t = new Tetrahedron[20];
      t[0] = new Tetrahedron("test", 7.0);
      t[1] = new Tetrahedron("test2", 1.0);
      t[2] = new Tetrahedron("test3", 8.0);
         
      Tetrahedron t2 = new Tetrahedron("test", 7.0);
      Tetrahedron t3 = new Tetrahedron("test2", 1.0);
      Tetrahedron t4 = new Tetrahedron("test3", 8.0);
         
      TetrahedronList list = new TetrahedronList("test list", t, 3);
      Assert.assertEquals("findTetrahedronWithLargestVolumeTrueTest",
                              t4, 
                              list.findTetrahedronWithLargestVolume());
                              
      TetrahedronList tlist = new 
            TetrahedronList("test list", null, 0);
      Assert.assertEquals("findTetrahedronWithLargestVolumeFalseTest",
                              null, 
                              tlist.findTetrahedronWithLargestVolume());
   }
}