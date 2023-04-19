//Create class
public class Transpose_matrix {
    //Main method
    public static void main(String[] args) {
        //Creating a matrix
        int Array[][] = {{1,2}, {3,4}};

        //Creating another matrix to store transpose of a matrix
        int transpose [][] = new int[2][2]; //2 row and 2 columns

        //Code to transpose a matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = Array[j][i];
            }
        }
        //Print without Transpose
        System.out.println("Printing Matrix without transpose: ");
        //Loop for i
        for (int i = 0; i < 2; i++) {
            //Loop for j
            for (int j = 0; j < 2; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        //Print After transpose
        System.out.println("Printing Matrix After Transpose: ");
        //Loop for i
        for (int i = 0; i < 2; i++) {
            //Loop for j
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
