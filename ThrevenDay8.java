import java.util.Scanner;

class Threven{
public static void main (String[] args){

int n1,n2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 1:");
n1=sc.nextInt();
System.out.println("Enter Number 2:");
n2=sc.nextInt();
System.out.println("Sum of the Numbers: " + (n1+n2));
if((n1+n2)%2==0)
System.out.println("Sum of the numbers is a Even number " + (n1+n2) );
}
}
