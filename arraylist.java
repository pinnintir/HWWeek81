import java.util.*;

public class Kleine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average;
        int count = 0, sum = 0, num, min = 0, max = 0;

        System.out.println("Please enter the number of numbers you wish to evaluate:");

        do {
            num = scan.nextInt();
            sum += num;
            count++;
        } while (count < 5);

        product *= num;

        {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int product = num1*num2;

        System.out.println("Your average is: " + average);
        System.out.println("The product is: " + product);    

        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);
        System.out.println("Output: "+product);
    }
}