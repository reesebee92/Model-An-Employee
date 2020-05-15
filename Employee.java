/** Employee
 * 
 * This class demonstrates the use of 3 other classes
 * Name, Address, and Date
 * 
 * All 3 classes are used to generate employee data for a
 * user specified data entry amount. The user will be prompted
 * to enter all the data for said number of employees and all the
 * data will be stored in an array and displayed at the end
 * 
 * @author sDantzler
 * */

import java.util.Scanner;

public class Employee {

   public static void main(String[] args) {

      // create a new Scanner to prompt the user
      Scanner input = new Scanner(System.in);

      // change the delimiter input to include spaces
      input.useDelimiter("\n");

      // ask the user about employee data entry amount
      System.out.println(
            "Enter the number of employees you wish to enter data for: ");
      int employeeEntry = input.nextInt();

      // create a String array to store data entered by user
      String[] employeeInfo = new String[employeeEntry * 4];

      // initialize an employeeID int to count each employee
      int[] employeeID = { 1 };

      // create an entry index to loop through array to enter data
      int entryIndex = 0;

      // use a for loop to enter set amount of employees into array
      for (int index = 0; index < employeeEntry; index++) {

         Name n = new Name();
         Address a = new Address();
         Date d = new Date();

         // enter employee ID into array
         employeeInfo[entryIndex] = "" + employeeID[0];

         System.out.println("\nEnter data for employee " + employeeID[0]
               + ":\n[please press enter after each entry]");
         System.out.println("Enter employee's name:\nFirst:");
         n.setFirstName(input.next());
         System.out.println("Last:");
         n.setLastName(input.next());

         // enter employee Name into array
         employeeInfo[++entryIndex] = n.toString();

         System.out.println("\nEnter employee's address:\nStreet:");
         a.setStreet(input.next());
         System.out.println("City:");
         a.setCity(input.next());
         System.out.println("State:");
         a.setState(input.next());
         System.out.println("Zip:");
         a.setZip(input.next());

         // enter employee Address into array
         employeeInfo[++entryIndex] = a.toString();

         System.out.println(
               "\nEnter employee's hire date (mon, day, year):"
               + "\n[please press enter after each entry]");
         d.setMonth(input.nextInt());
         d.setDay(input.nextInt());
         d.setYear(input.nextInt());

         // enter employee hire Date into array
         employeeInfo[++entryIndex] = d.toString();
         entryIndex++;

         // increase the employee count for the next employee data entry
         employeeID[0]++;

      } // end for loop
      input.close();

      // display the results
      System.out.println(
            "EmpID       Name                   Address                  Hire Date"
                  + "\n-------------------------------------------------------------------------");
      for (int displayIndex = 0; displayIndex < employeeInfo.length; displayIndex++) {
         if (displayIndex % 4 == 0) {
            System.out.println();
         }
         System.out.print(employeeInfo[displayIndex] + "         ");
      }
   }// end main method

}// end class Employee
