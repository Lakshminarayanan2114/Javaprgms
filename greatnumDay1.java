import java.util.Scanner;
class greatnum{
public static void main (String[] args){

int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value(distinct):");
a=sc.nextInt();
System.out.println("Enter b value(distinct):");
b=sc.nextInt();
System.out.println("Enter c value(distinct):");
c=sc.nextInt();
if(a>b && a>c){
System.out.println(a + "is the Greatest number");
}
else if(b>a && b>c){
System.out.println(b + "is the Greatest number");
}
else{
System.out.println( c +"is the Greatest number");
}
}
}
