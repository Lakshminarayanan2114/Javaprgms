import java.util.Scanner;
class SI{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double p,n,r;
System.out.println("enter principal AMt:");
p=sc.nextDouble();
System.out.println("enter rate of Interest:");
r=sc.nextDouble();
System.out.println("enter number of years:");
n=sc.nextDouble();
System.out.println("The Simple interest is :" + ((p*n*r)/100));
}
}