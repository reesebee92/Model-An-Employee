/**
 * Address
 * 
 * This class will generate the street, city, state, and zip for each address.
 * There are 2 available constructors as well as getter, setter, and toString
 * methods for every instance variable available.
 */
public class Address {

   // instance variables
   private String street;
   private String city;
   private String state;
   private String zip;

   // empty constructor
   public Address() {
      street = "None";
      city = "None";
      state = "None";
      zip = "None";
   }

   // parameterized constructor
   public Address(String str, String cty, String st, String zipc) {
      street = str;
      city = cty;
      state = st;
      zip = zipc;
   }

   /**
    * getStreet
    * 
    * This method will return the street
    */
   public String getStreet() {
      return street;
   }// end getStreet method

   /**
    * setStreet
    * 
    * This method will set the street
    * 
    * @param street
    */
   public void setStreet(String street) {
      this.street = street;
   }// end setStreet method

   /**
    * getCity
    * 
    * This method will return the city
    */
   public String getCity() {
      return city;
   }// end getCity method

   /**
    * setCity
    * 
    * This method will set the city
    * 
    * @param city
    */
   public void setCity(String city) {
      this.city = city;
   }// end setCity method

   /**
    * getState
    * 
    * This method will return the state
    */
   public String getState() {
      return state;
   }// end getState method

   /**
    * setState
    * 
    * This method will set the state
    * 
    * @param state
    */
   public void setState(String state) {
      this.state = state;
   }// end setState method

   /**
    * getZip
    * 
    * This method will return the zip code
    */
   public String getZip() {
      return zip;
   }// end getZip method

   /**
    * getZip
    * 
    * This method will set the state
    * 
    * @param zip
    */
   public void setZip(String zip) {
      this.zip = zip;
   }// end setZip method

   /**
    * toString
    * 
    * This method will return the Address string
    */
   public String toString() {
      return "" + street + ", " + city + ", " + state + ", " + zip;
   }// end toString method

}// end Address class
