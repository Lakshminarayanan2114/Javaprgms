import java.util.Scanner;
class countdig{
public static void main (String[] args){

int a,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value:");
a=sc.nextInt();
while(a>0){
a=a/10;
c+=1;
}
System.out.println("Number of Digits:"+c);
}
}
