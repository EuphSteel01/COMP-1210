import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/** 
 * Project_06 - ConeListMenuApp. 
 *
 * @author Jess Banister
 * @version 2/23/21
 */
public class ConeListMenuApp {
   /**Defines number as numberIn.
   *
   * @throws IOException throw the exception.
   * @param args Command line(not used).
   */
   public static void main(String[] args) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      String str = "*** no listname assigned ***";
      ArrayList<Cone> list = new ArrayList<Cone>();
      ConeList cl = new ConeList(str, list);
      
      String output = "";
      output += "Cone List System Menu";
      output += "\nR - Read File and Create Cone List";
      output += "\nP - Print Cone List";
      output += "\nS - Print Summary";
      output += "\nA - Add Cone";
      output += "\nD - Delete Cone";
      output += "\nF - Find Cone";
      output += "\nE - Edit Cone";
      output += "\nQ - Quit";
      System.out.println(output);
      
      
      
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         
         switch (choice) {
            case 'R': // Reads the File
               String file = "";
               System.out.print("\tFile name: ");
               file = scan.nextLine();
               cl = cl.readFile(file);
               System.out.println("\tFile read in and"
                  + " Cone List created");
               break;
            case 'P': // Prints data
               System.out.print(cl);
               break;
            case 'S': // Summary of data
               System.out.print(cl.summaryInfo() + "\n");
               break;
            case 'A': // Adds new cone
               String addLabel = "";
               double addRadius = 0.0;
               double addHeight = 0.0;
               System.out.print("\tLabel: ");
               addLabel = scan.nextLine().trim();
               System.out.print("\tHeight: ");
               addHeight = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               addRadius = Double.parseDouble(scan.nextLine());
               cl.addCone(addLabel, addRadius, addHeight);
               System.out.print("\t*** Cone added ***\n");
               break;
            case 'D': // Deletes selected cone
               String deleteLabel = "";
               System.out.print("\tLabel: ");
               deleteLabel = scan.nextLine().trim();
               if (cl.findCone(deleteLabel) == null) {
                  System.out.print("\t\"" + deleteLabel + "\" not found");
               }
               else {
                  System.out.print("\t\"" 
                     + cl.findCone(deleteLabel).getLabel() 
                     + "\" deleted\n");
                  cl.deleteCone(deleteLabel);
               }
               break;
            case 'F': // Finds selected cone
               String findLabel = "";
               System.out.print("\tLabel: ");
               findLabel = scan.nextLine().trim();
               if (cl.findCone(findLabel) != null) {
                  System.out.print(cl.findCone(findLabel) + "\n");
               }
               else {
                  System.out.print("\t\"" + findLabel + "\" not found\n");
               }
               break;
            case 'E': // Edits existing cone
               String editLabel = "";
               double editRadius = 0.0;
               double editHeight = 0.0;
               System.out.print("\tLabel: ");
               editLabel = scan.nextLine().trim();
               System.out.print("\tHeight: ");
               editHeight = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               editRadius = Double.parseDouble(scan.nextLine());
               if (cl.findCone(editLabel) != null) {
                  cl.editCone(editLabel, editRadius, editHeight);
                  System.out.print("\t\"" 
                     + editLabel
                     + "\" successfully edited\n");
               }
               else {
                  System.out.print("\t\"" + editLabel + "\" not found");
               }
               break;
            case 'Q': // Quits program
               System.out.print("");
               break;
            default: // Invalid Code default
               System.out.print("\t*** invalid code ***\n");
               break;
         }
      } while (choice != 'Q');
   }
}