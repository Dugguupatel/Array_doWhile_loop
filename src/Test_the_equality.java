import java.util.Arrays;
//Create class
public class Test_the_equality {
    //main mehtod
    public static void main(String[] args) {

        //defining array to compare
        int[] a1 = new int[] {1,2,3,4,5};
        int[] a2 = new int[] {1,2,3,4,5};


        //comparing two arrays using equals method
         if (Arrays.equals(a1,a2))
             System.out.println("Arrays are equal");
         //else mean no answer
         else
             System.out.println("Arrays are NOT equal");

    }

}
