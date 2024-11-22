import java.util.Scanner;
class SolvingEquation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        solveLinearEquation(scanner);
        solveLinearSystem(scanner);   
        solveQuadraticEquation(scanner);
        
        scanner.close();
    }

    public static void solveLinearEquation(Scanner scanner){
        System.out.println("Solve the first degree ax + b = 0");
        System.out.println("Enter coefficient a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b : ");
        double b = scanner.nextDouble();
        
        if (a != 0){
            double x = -b / a ;
            System.out.println("Solution x = " + x);
        } else {
            System.out.println("No Solution");
        }
        System.out.println();
    }

    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Solve system of first-degree equations:");
        System.out.println("Enter coefficient a11: ");
        double a11 = scanner.nextDouble();
        System.out.println("Enter coefficient a12: ");
        double a12 = scanner.nextDouble();
        System.out.println("Enter coefficient a21: ");
        double a21 = scanner.nextDouble();
        System.out.println("Enter coefficient a22: ");
        double a22 = scanner.nextDouble();
        System.out.println("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.println("Enter b2: ");
        double b2 = scanner.nextDouble();
        

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }
        System.out.println();
    }

    
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Solving second-degree equation: ax^2 + bx + c = 0");
        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            double discriminant = b * b - 4 * a * c;
            
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two distinct real roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has one real root: " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
        System.out.println();
    }
}

