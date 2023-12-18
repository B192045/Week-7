package bank;
import java.util.*;


interface functionalities{
 void credentialsCheck(String username,String password);
 int credit(int amount);
 int debit(int amount);
 void display();
 void exit();}

class mismatchException extends Exception{
    public mismatchException(String str){
    super(str);}}

class insufficientException extends Exception{
 public insufficientException(String str){
 super(str);}}

public class Banks implements functionalities{
 int balance;
 public Banks(int amount){
 this.balance=balance;}

 public void credentialsCheck(String username,String password){
 String usernam="aish";
 String passwor="aish20";
 try{
 if(!usernam.equals(username)&&(!passwor.equals(password)))
 throw new mismatchException("Mismatch error");
 else 
 System.out.println("correct");}
 catch(mismatchException e){
 System.out.println("Exception: "+e.getMessage());}
 }
 
 public int credit(int amount){
 balance+=amount;
 return balance;}

 public int debit(int amount){
  if(amount>balance){
 try{
 throw new insufficientException("Insufficient balance");}
 catch(insufficientException e){
 System.out.println("Exception: "+e.getMessage());}}
 else
 balance-=amount;
 return balance;}
 
 public void display(){
 System.out.println(balance);}

 public void exit(){
 System.out.println("Exiting");}}
