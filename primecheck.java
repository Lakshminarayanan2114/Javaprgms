import java.util.Scanner;
import java.lang.Math;
class primecheck{
public static void main (String[] args){

int n;
boolean p=true;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value to check prime");
n=sc.nextInt();
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
  p=false;
  break;
}
}
if(p){
System.out.println(n+" "+"is a Prime Number");
}
else{
System.out.println(n+" "+"is not a Prime Number");
}
}
}