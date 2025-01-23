import java.util.Scanner;
class natnum{
public static void main (String[] args){

int a,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value upto which numbers to be calculated:");
a=sc.nextInt();
for(int i=1;i<=a;i++){
c+=i;
}
System.out.println("Sum of numbers upto" + a +":"+c);
}

}