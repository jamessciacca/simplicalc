package simplicalc;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        double x;
        double y;
        double sum;
        double difference;
        double product;
        double quotient;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To SimpliCalc!");
        System.out.print("Please enter an arithmetic operation: ");
        String operation = input.nextLine();

        if(operation.equals("+")){

            System.out.print("Enter the first number: ");
            x = input.nextDouble();
            System.out.print("Enter the second number: ");
            y = input.nextDouble();

            sum = add(x, y);

            System.out.println("The sum is = " + sum + "\n");
        }
        else if(operation.equals("-")){

            System.out.print("Enter the first number: ");
            x = input.nextDouble();
            System.out.print("Enter the second number: ");
            y = input.nextDouble();

            difference = subtract(x, y);

            System.out.println("The difference is = " + difference + "\n");

        }
        else if(operation.equals("*")){

            System.out.print("Enter the first number: ");
            x = input.nextDouble();
            System.out.print("Enter the second number: ");
            y = input.nextDouble();

            product = multiply(x, y);

            System.out.println("The product is = " + product + "\n");

        }
        else if (operation.equals("/")){

            System.out.print("Enter the first number: ");
            x = input.nextDouble();
            System.out.print("Enter the second number: " );
            y = input.nextDouble();

            quotient = divide(x, y);

            System.out.println("The quotient is = " + quotient + "\n");

        }
        else{
            System.out.println("Sorry enter a valid operation. Examples: +, -, *, /");
            
        }

        System.out.println("Thanks for using SimpliCalc!");

        input.close();
    }

    //methods to complete operations
    public static double add(double x, double y){
        return x + y;
    }

    public static double subtract(double x, double y){
        return x - y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static double divide(double x, double y){
        return x / y;
    }
}