import java.util.Scanner;

class Threenum{
public static void main (String[] args){

int n1,n2,n3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 1:");
n1=sc.nextInt();
System.out.println("Enter Number 2:");
n2=sc.nextInt();
System.out.println("Enter Number 3:");
n3=sc.nextInt();
System.out.println("Sum of the Numbers: " + (n1+n2+n3));
}
}