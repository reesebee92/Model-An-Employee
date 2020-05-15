/**
 * Date
 * 
 * This class will generate the date including the month, day, and year.
 * There are 2 available constructors as well as getter, setter, and toString
 * methods for every instance variable available.
 */
public class Date {
   
   // instance variables
   private int month;
   private int day;
   private int year;

   // parameterized constructor
   public Date(int m, int d, int y) {
      month = m;
      day = d;
      year = y;
   }
   
   // empty constructor
   public Date() {
      month = -1;
      day = -1;
      year = -1;
   }

   /**
    * getMonth
    * 
    * This method will return the month
    */
   public int getMonth() {
      return month;
   }// end getMonth method

   /**
    * setMonth
    * 
    * This method will set the month
    * @param month
    */
   public void setMonth(int month) {
      if(month < 1 || month > 12) {
         throw new IllegalArgumentException();
      }
      this.month = month;
   }// end setMonth method

   /**
    * getDay
    * 
    * This method will return the day
    */
   public int getDay() {
      return day;
   }// end getDay method

   /**
    * setDay
    * 
    * This method will set the day
    * @param day
    */
   public void setDay(int day) {
      if(day < 1 || day > 31) {
         throw new IllegalArgumentException();
      }
      this.day = day;
   }// end setDay method

   /**
    * getYear
    * 
    * This method will return the year
    */
   public int getYear() {
      return year;
   }// end getYear method

   /**
    * setYear
    * 
    * This method will set the year
    * @param year
    */
   public void setYear(int year) {
      if(year < 1900 || year > 2020) {
         throw new IllegalArgumentException();
      }
      this.year = year;
   }// end setYear method
   
   /**
    * toString
    * 
    * This method will return the Date string
    * */
   public String toString() {
      return "" + month + "/" + day + "/" + year;
   }// end toString method

}// end class Date
