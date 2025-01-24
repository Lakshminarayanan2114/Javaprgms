import java.util.Scanner;
class mystynum{
public static void main (String[] args){

int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter num1 value:");
a=sc.nextInt();
System.out.println("Enter num2 value:");
b=sc.nextInt();
if(a>b){
System.out.println( a  +  "is the Greatest number");
}
else if(b>a){
System.out.println(b + "is the Greatest number");
}
else{
System.out.println("Both are equal");
}
}
}
