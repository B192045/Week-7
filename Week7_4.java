//. Mr.Bean claims himself as efficient software developer and claims that his application can handle the following exceptions ArithmeticException, NullPointerExceptions, ArrayIndexOutOfBoundsException,
//IOException etc., . You being the Tester test the application to validate his claims.
//Hint : Develop any application that handle’s all the exceptions stated above.

import java.util.*;

public class Week7_4{
  public static void main(String args[]){
    try{
     String s=null;
     int[] a={1,2,0};
      int ab=s.length();
      int result=a[0]/a[2];
       int element=a[5];
     System.out.println(result);
     System.out.println(element);
      
      }
       catch(NullPointerException e){
       System.out.println("Exception: "+e.getMessage());}
      catch(ArithmeticException e){
      System.out.println("Exception: "+e.getMessage());}
      catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception: "+e.getMessage());
      }
      finally{
      System.out.println("All the exceptions are tested");}}}
      
