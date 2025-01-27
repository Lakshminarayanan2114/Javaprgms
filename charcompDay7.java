import java.util.Scanner;
class charcomp{
public static void main (String[] args){

char a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.next().charAt(0);
System.out.println("Enter b value:");
b=sc.next().charAt(0);
System.out.println("a Greater than b:" + (a>b));
System.out.println("a Greater than or equal to b:" + (a>=b));
System.out.println("a Lesser than b:" + (a<b));
System.out.println("a Lesser than or equal to b:" + (a<=b));
System.out.println("a equal to b:" + (a==b));
System.out.println("a not equal to b:" + (a!=b));
}
}
