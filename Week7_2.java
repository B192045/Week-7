/*Define a package bank.
 Include following functionalities as abstract methods in an interface
abstract XXX credentialsCheck(String Username, String password); 
abstract XXX credit( XXX);
abstract XXX debit( XXX);
abstract XXX displayBalance(XXX);
abstract XXX exit();
Until user selects exit he can perform any of the above operations.
Handle the following exceptions during the transaction
1. Username and password mismatch. // display error message and continue;
2. If debit amount exceeds available balance. // display error message and
continue;
*/

import java.util.*;
import bank.Banks;


class Week7_2{
 public static void main(String args[]){
 Banks b=new Banks(2000);
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter username: ");
 String user=sc.next();
 System.out.println("Enter password: ");
 String password=sc.next();
 b.credentialsCheck(user,password);
 while(true){
 System.out.println("Enter operation required");
 int n=sc.nextInt();
 switch(n){
 case 1:
 System.out.println(b.credit(1000));
 break;
 case 2:
 System.out.println(b.debit(1000));
 break;
 case 3:
 b.display();
 break;
 case 4:
 b.exit();
 System.exit(0);}}
 }}
 
 