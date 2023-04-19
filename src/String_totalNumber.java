import java.util.Locale;
//Create class
public class String_totalNumber {

    //Main method
    public static void main(String[] args) {

        //Counter variable to store the count of 'a'
        int count = 0;
        //Declare a string
        String name = "I Am an American";
        //Converting entire string to lower case to reduce the comparisons
        name = name.toLowerCase();

        //Loop for i
        for (int i = 0; i < name.length() - 1; i++) {
            //Condition to Check whether a character is
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
                //Increment character by 1
                count++;
            } else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {

            }
            }
        //Final answer to Print
            System.out.println("Number of 'a' in string is: " + count);

        }
    }