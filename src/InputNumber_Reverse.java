//Create class
public class InputNumber_Reverse {

    //Main method
    public static void main(String[] args) {
        //Initialize array
        int[] array = new int[]{1,2,3,4,5};
        //Print original array
        System.out.println("Original array: ");
        //Loop for i
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //New line
        System.out.println();
        //Print in reverse order
        System.out.println("Array in reverse order: ");

        //Loop though the array in reverse order
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
