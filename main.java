import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Write the first number: ");
        int number1 = keyboard.nextInt();

        System.out.print("Write the second number: ");
        int number2 = keyboard.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of " + number1 + " + " + number2 + " is " + sum );

    }

}
