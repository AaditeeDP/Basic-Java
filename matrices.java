import java.util.*;

class Matrices{
    
    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);
        int i,j,row,column;
        System.out.println("IMPLEMENTATION OF TWO DIMENSIONAL ARRAY USING JAVA");
        System.out.println("Enter the number of rows of the matrice");
        row = sc.nextInt();
        System.out.println("Enter the number of column of the matrice");
        column = sc.nextInt();
        int a[][] = new int[row][column];
        int b[][] = new int[row][column];
        int c[][] = new int[row][column];
        System.out.println("Enter the content of matrix1:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                a[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Enter the content of matrix2:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                b[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("The addition of the two matrices = ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(" "+c[i][j]);
            }
        }
    }
}