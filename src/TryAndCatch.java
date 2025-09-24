import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            int num1 = input.nextInt();

            System.out.println("Enter another number: ");
            int num2 = input.nextInt();

            if(num2 == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }

            if(num1<num2){
                throw new ArithmeticException("numerator cannot be less than the denominator");
            }

            int result = num1 / num2;

            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers alone");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Handle ArithmeticException for division issues
        }finally {
            System.out.println("Good bye!");
        }


    }
}
