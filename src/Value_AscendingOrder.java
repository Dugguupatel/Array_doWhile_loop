//create class
    public class Value_AscendingOrder {
    //Main method
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int[] {4,1,6,8,5};
        int number = 0;
        //Displaying elements of original array
        System.out.println("Elements of original array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Loop for i
        for (int i = 0; i < arr.length ; i++) {
            //Loop for j
            for (int j = i; j < arr.length; j++) {
                //Condition Sort the array in ascending order
                if (arr[i] > arr[j]){
                    number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = number;
                }
            }
        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
