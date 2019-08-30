import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert length of array(Interger Number)");
        int length = 0;
        try {
            length = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error datatype!");
        }catch (Exception e) {
            System.out.println("Error!");
        }

        System.out.println("Insert value of array (Interger Number)");
        int array[] = new int[length];
        try {
            for(int i = 0 ; i < length ; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Array: " + Arrays.toString(array));
        } catch (InputMismatchException e) {
            System.out.println("Error datatype!");
        }catch (Exception e) {
            System.out.println("Error!");
        }

        int min = Minvalue(array);
        System.out.println("The smallest element in the array is: " + array[min]);
    }
    public static int Minvalue(int []array) {
        int min = array[0];
        int position = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if(array[i] < min) {
                min = array[i];
                position = i ;
            }
        }
        return position;
    }
}
