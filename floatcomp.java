import java.util.Scanner;
class floatcomp{
public static void main (String[] args){

float a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.nextFloat();
System.out.println("Enter b value:");
b=sc.nextFloat();
if(a>b){
System.out.println(a + "is the Greatest number");
}
else if(a==b){

System.out.println("a and b are equal");
}
else{

System.out.println( b +"is the Greatest number");
}
}
}