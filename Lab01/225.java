import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("Sum:" + (num1 + num2));
        System.out.println("Difference:" + (num1 - num2));
        System.out.println("Product:" + (num1 * num2));
        System.out.println("Quotient:" + (num2 != 0 ? (num1/num2) : "Undifined"));

        sc.close();
    }
}