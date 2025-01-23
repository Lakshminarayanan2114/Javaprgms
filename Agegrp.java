import java.util.Scanner;
import java.lang.Math;
class Agegrp{
public static void main (String[] args){

int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age value to display Group:");
n=sc.nextInt();
if(n>=65){
System.out.println("Senior");
}
else if(n>=20 && n<=64){
System.out.println("Adult");
}
else if(n>=13 && n<=19){
System.out.println("Teenager");
}
else if(n==0 && n<=12){
System.out.println("Child");
}
else{
System.out.println("Enter valid age number");
}
}
}