import java.util.Scanner;
import java.lang.Math;
class quadeq{
public static void main (String[] args){

int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter coefficient 1 value:");
a=sc.nextInt();
System.out.println("Enter coefficient 2 value:");
b=sc.nextInt();
System.out.println("Enter coefficient 3 value:");
c=sc.nextInt();
double disc= (b * b) - (4 * a * c);
if (disc>0){
double rp=(-b+Math.sqrt(disc))/(2*a);
double rn=(-b-Math.sqrt(disc))/(2*a);
System.out.println("Root1 result:"+rp);
System.out.println("Root2 result:"+rn);
}
else{
double realPart = (double) -b / (2 * a);
double imaginaryPart = Math.sqrt(-disc) / (2 * a);
System.out.println("Root1 result: " + realPart + " + " + imaginaryPart + "i");
System.out.println("Root2 result: " + realPart + " - " + imaginaryPart + "i");
        }
}
}