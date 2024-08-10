import java.util.Scanner;

public class TwoDarraySearch {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows : ");
       int rows = sc.nextInt();
       System.out.println("Enter number of cols : ");
       int cols = sc.nextInt();

       int matrix[][] = new int[rows][cols];

       System.out.println("Enter matrix values : ");

       for(int i = 0;i<rows;i++){
        for(int j = 0;j<cols;j++){
            matrix[i][j] = sc.nextInt();
        }
       }
       System.out.println("Enter value you want to search : ");
       int x = sc.nextInt();

       System.out.println("matrix values index at : ");

       for(int i = 0;i<rows;i++){
        for(int j = 0;j<cols;j++){
            if (matrix[i][j] == x) {
                System.out.println("Your value at row number : "+i);
                System.out.println("Your value at cols number : "+j);
            }
        }
       }
   }
}
