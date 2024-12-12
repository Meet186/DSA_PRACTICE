package OOPS;

public class Students {
   public String Name;
   public int RollNo;
   private double percentage;
   final String schoolName = "ST.Alphonsa";
   private static int numberOfAtudents;

   public Students(){
       // Deafult Constructor
       // while create new constructor deafult constructor will deleted.
       // important to create deafult constructor.
   }

   public Students(String name, int rollNo,double per){
      this.Name = name;
      this.RollNo = rollNo;
      this.percentage = per;
      this.numberOfAtudents++;
   }

   public double getPercentage(){
       return  percentage;
   }

   public void setPercentage(double marks){
       percentage = marks;
   }

   public int getNoOfStudents(){
      return numberOfAtudents;
   }





}




