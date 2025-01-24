import java.util.Random;

public class randsum {
    public static void main(String[] args) {
        Random random = new Random();
        
       
        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100); 
        
        System.out.println("Random Number 1: " + num1);
        System.out.println("Random Number 2: " + num2);
        System.out.println("Sum of the random Numbers:" + (num1+num2));
    }
}
