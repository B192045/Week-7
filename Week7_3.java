/*Define package audit.
Include following functionalities as abstract methods in an interface.
abstract XXX taxChecker (XXX);
abstract XXX taxPaid(XXX);
abstract XXX homeExpenditure(XXX);
abstract XXX healthExpenditure(XXX);
abstract XXX vehicleExpenditure(XXX);
abstract XXX personalFamilyExpenditure(XXX);
abstract XXX miscellaneousExpenditure(XXX);
Inputs : all the above expenditures, TotalIncome and Taxpaid
He/She has to pay 10% of ( TotalIncome- (all other expenditures)) on mismatch
throw an exception as fraud and display message, how much he/she has to pay.*/

import java.util.*;

 interface functionalities{
  void taxchecker();
   int  taxpaid();
   int homeexpenditure();
   int healthexpenditure();
   int vehicleexpenditure();
   int personalfamilyexpenditure();
    int miscellaneousexpenditure();}
    
    class fraudexception extends Exception{
    public fraudexception(String str){
    super(str);}}
    
     class Taxdepartment implements functionalities{
      int totalincome=1000;
      int misc,family,health,vehicle,home,paid;
      Scanner sc=new Scanner(System.in);
     
     public int taxpaid(){
      System.out.println("Enter total tax paid: ");
      paid=sc.nextInt();
      return paid;}
      
    public  int homeexpenditure(){
      System.out.println("Enter home expenditure: ");
      home=sc.nextInt();
      return home;}
      
      public int healthexpenditure(){
      System.out.println("Enter health expenditure: ");
      health=sc.nextInt();
      return health;}
      
      public int vehicleexpenditure(){
      System.out.println("Enter vehicle expenditure: ");
      vehicle=sc.nextInt();
      return vehicle;}
      
      public int personalfamilyexpenditure(){
       System.out.println("Enter family expenditure: ");
      family=sc.nextInt();
      return family;}
      
      public int miscellaneousexpenditure(){
       System.out.println("Enter miscellaneous expenditure: ");
      misc=sc.nextInt();
      return misc;}
      
      
      
      public void  taxchecker(){
      int correct=10*(totalincome-(misc+family+vehicle+health+home))/100;
      System.out.println("Correct amount is: "+correct);
      if(paid<correct){
      try{
      throw new fraudexception("HE IS A FRAUD");}
      catch(fraudexception fr){
     System.out.println("remaining amount: "+(correct-paid));
      System.out.println(fr.getMessage());}
     }
      else if(paid>=correct)
      System.out.println("He is not a fraud");}}
      
      public class Week7_3{
      public static void main(String args[]){
      Taxdepartment t1=new Taxdepartment();
       t1.taxpaid();
       t1.homeexpenditure();
        t1.healthexpenditure();
        t1.vehicleexpenditure();
        t1.personalfamilyexpenditure();
        t1.miscellaneousexpenditure();
         t1.taxchecker();}}
      
       
