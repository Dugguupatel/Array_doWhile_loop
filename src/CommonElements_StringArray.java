//Create class
public class CommonElements_StringArray {
    //Main method
    public static void findCommonElement(String[] arr1,
                                         String[] arr2)
    {
        //Loop of i
        for (int i = 0; i < arr1.length; i++)
        {
            //Loop of j
            for (int j = 0; j < arr2.length; j++)
            {
                //Condition for Equality
                if (arr1[i].equals(arr2[j]))
                {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
    //Main method
    public static void main(String[] args) {

        String[] arr1 = {"Hello", "Hi", "Good", "Bye"};
        String[] arr2 = {"Hi", "How", "Hello", "Bye", "When" };

        findCommonElement(arr1, arr2);
    }
}
