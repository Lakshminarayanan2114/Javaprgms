import java.util.Scanner;
class numcomp4{
public static void main (String[] args){

int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value(distinct):");
a=sc.nextInt();
System.out.println("Enter b value(distinct):");
b=sc.nextInt();
System.out.println("Enter c value(distinct):");
c=sc.nextInt();
System.out.println("Enter d value(distinct):");
d=sc.nextInt();
String res=((a>b)&&(a>c))? " a is greatest" : ((a<b)&&(b>c)) ? "b is greatest" :((a<c)&&(c>b)) ? " c is greatest" : "d is greatest";
System.out.println(res);
}
}