import java.util.*;

class BerthCountException extends Exception{
  public BerthCountException(String str){
  super(str);}}

class BerthTypeException extends Exception{
  public BerthTypeException(String str){
  super(str);}}

class unavailable extends Exception{
  public unavailable(String str){
  super(str);}}




class Week7_5{
 public static void main(String args[]){
 int s1=70,s2=70,b;
 int b1=70,b2=70;
 Scanner sc=new Scanner(System.in);
 while(true){
  System.out.println("1.AC 2.Sleeper 3.exit");
  int n=sc.nextInt();
  try{
  switch(n){
  case 1:
  System.out.println("Enter num of berths required: ");
  b=sc.nextInt();
  if(b>6)
  throw new BerthCountException("Entered above 6");
  else{
  if(b1>b)
   b1=b1-b;
  if(b2<b)
   b2=b2-b;
  else if(b<(b1+b2)){
  b=b-b1;
  b1=0;
  b2=b2-b;}
  else
  throw new unavailable("not available");}
 break;

 case 2:
  System.out.println("Enter num of berths required: ");
  b=sc.nextInt();
  if(b>6)
  throw new BerthCountException("Entered above 6"); 
  else{
  if(s1>b)
  s1=s1-b;
  if(s2<b)
  s2=s2-b;
  else if(b<(s1+s2)){
  b=b-s1;
  s1=0;
  s2=s2-b;}
  else
  throw new unavailable("not available");}
  if((b1<70||b2<70)&&(s1<70||s2<70))
 throw new BerthTypeException("Booking from both");

break;


 
case 4:
System.out.println("Remaining ac berths are: "+(b1+b2));
System.out.println("Remaining sleeper berths are: "+(s1+s2));

System.exit(0);}}
 
catch(unavailable u){
System.out.println(u);}

catch(BerthTypeException v){
System.out.println(v);}

catch(BerthCountException w){
System.out.println(w);}

}}}
