import java.util.Scanner;

class SubDay10{
public static void main (String[] args){

int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number 1:");
a=sc.nextInt();
System.out.println("Enter Number 2:");
b=sc.nextInt();
System.out.println("Sum of the Numbers: " + (a+b));
if(a<b){
System.out.println("Subtracted Value: "+ ((a-b)*-1));
}
else{
System.out.println("Subtracted Value: "+ (a-b));
}
}
}