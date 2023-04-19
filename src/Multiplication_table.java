//Create class
public class Multiplication_table {
    //Create method
    static void number(int n) {
        int i = 1;
        //Use do-while loop
        do {
            System.out.print(n * i + " ");
            i = i + 1;
            //code to be executed
        } while(i <= 5);
        System.out.println(" ");
      }

      //Main method
    public static void main(String[] args) {
        int i =1;
        //Use do-while loop
        do {
            number(i);
            i = i + 1;
      } while (i <= 5);
    }
}