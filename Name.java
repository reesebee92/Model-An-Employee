/**
 * Name
 * 
 * This class will generate the first and last name of an individual with 2
 * available constructors. There are 2 available constructors as well as getter, setter, and toString
 * methods for every instance variable available.
 */
public class Name {

   // instance variables
   private String firstName;
   private String lastName;

   // empty constructor
   public Name() {
      firstName = "None";;
      lastName = "None";
   }

   // parameterized constructor
   public Name(String fn, String ln) {
      firstName = fn;
      lastName = ln;
   }

   /**
    * getFirstName
    * 
    * This method will return the first name
    */
   public String getFirstName() {
      return firstName;
   }// end getter method for First Name

   /**
    * setFirstName
    * 
    * This method will set the first name
    * @param firstName
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }// end setter method for First Name

   /**
    * getLastName
    * 
    * This method will return the last name
    */
   public String getLastName() {
      return lastName;
   }// end getter method for Last Name

   /**
    * setLastName
    * 
    * This method will set the last name
    * @param lastName
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }// end setter method for Last Name
   
   /**
    * toString
    * 
    * This method will return the Name string
    * */
   public String toString() {
      return "" + firstName + " " + lastName;
   }// end toString method

}// end Name class
