import java.util.Scanner;
//Create class
public class Armstrong_Number {
        //function to check if the number is Armstrong or NOT
        static boolean isArmstrong(int n) {

         ///initialization
        int number, digits =0, last=0, sum =0;
        //assigning n into a temp variable
            number =n;
            //loop execute until the condition becomes false
            while (number > 0){
                number = number/10;
                digits++;
            }
            number = n;
            while (number > 0){
                //determines the last digit from the number
                last = number % 10;
                //Calculates thr power of a number up to digit times and add the resultant to the sum variable
                sum += (Math.pow(last,digits));
                //Remove the last digit
                number = number/10;
            }
            //Compare the sum with n
            if(n == sum)
                //Return if sum and n are equal
                return true;
            //Returns false if sum and n are not equal
            else return false;
        }
        //Main method
        public static void main(String[] args) {
            int num;
            //Call the scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            //Reads the limit from the user
            num = sc.nextInt();
            //conditions
            if (isArmstrong(num)){
                System.out.print("This number is Armstrong: ");
        } else {
                System.out.print("This number is Not Armstrong: ");
            }
    }
}
