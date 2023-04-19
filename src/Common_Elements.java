//Create class
public class Common_Elements {
    //Main method
    public static void main(String[] args) {
        String[] array1 = {"Audi", "BMW", "Toyota", "Honda", "Mercedes", "Porsche"};
        String[] array2 = {"Hyundai", "Porsche", "ferrari", "BMW", "Suzuki", "Audi"};

        //Loop for i
        for (int i = 0; i < array1.length; i++) {
            //Loop for j
            for (int j = 0; j < array2.length; j++) {

                //Condition for Common elements
                if (array1[i].equals(array2[j])){
                    //Final printout
                    System.out.println("Common Elements: " + array1[i]);
                }
            }
        }
    }
}
