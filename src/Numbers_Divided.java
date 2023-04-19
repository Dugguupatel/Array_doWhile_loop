//Create class
public class Numbers_Divided {
    //Main method
    public static void main(String[] args) {

        //Number divided by 3
        System.out.println("Divided by 3: ");
        //Loop for i
        for (int i = 1; i < 100; i++)
        {
            //Condition for divided by 3
            if (i %3 == 0)
                System.out.print(i + ", ");
        }//new line
        System.out.println();

        //Number divided by 5
        System.out.println("Divide by 5: ");
        //Loop for i
        for (int i = 1; i < 100; i++)
        {
            //Condition for divided by 5
            if (i %5 == 0)
                System.out.print(i + ", ");
        }//new line
        System.out.println();
    }
}