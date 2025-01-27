import java.util.Scanner;
class numcomp{
public static void main (String[] args){

int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.nextInt();
System.out.println("Enter b value:");
b=sc.nextInt();
System.out.println("a Greater than b:" + (a>b));
System.out.println("a Greater than or equal to b:" + (a>=b));
System.out.println("a Lesser than b:" + (a<b));
System.out.println("a Lesser than or equal to b:" + (a<=b));
System.out.println("a equal to b:" + (a==b));
System.out.println("a not equal to b:" + (a!=b));
}
}
