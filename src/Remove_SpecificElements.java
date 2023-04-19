import java.util.ArrayList;
import java.util.Arrays;
//Create class
public class Remove_SpecificElements {

    //Main method
    public static void main(String[] args) {
        //Creating an ArrayList having default size 7
        ArrayList<String> arr = new ArrayList<String>(7);

        // Adding Elements to the ArrayList
        arr.add("Sunday");
        arr.add("Monday");
        arr.add("Tuesday");
        arr.add("Wednesday");
        arr.add("Thursday");
        arr.add("Friday");
        arr.add("Saturday");
        System.out.println("The list of the size is: " + arr.size());

        //Showing all the elements in the ArrayList
        for (String name : arr) {
            System.out.println("Name is: " + name);
        }
        //Removing elements available at position 1
        arr.remove(1);
        System.out.println("After removing the element the size of the Arraylist is: " + arr.size());

        //Showing all the elements in the ArrayList
        for (String name : arr){
            System.out.println("Name is: " + name);
        }
    }
}