import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = sc.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        
        System.out.println("Nhập ma trận 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();
        
        System.out.println("Nhập ma trận 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();
        
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = matrix1[i][j] + matrix2[i][j];
        
        System.out.println("Ma trận tổng:");
        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}