import java.util.Scanner;
class greatnumtern{
public static void main (String[] args){

int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value(distinct):");
a=sc.nextInt();
System.out.println("Enter b value(distinct):");
b=sc.nextInt();
System.out.println("Enter c value(distinct):");
c=sc.nextInt();
String res=((a>b)&&(a>c))? " a is greatest" : ((a<b)&&(b>c)) ? "b is greatest" :" c is greatest";
System.out.println(res);
}
}
