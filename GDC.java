import java.util.*;

public class GDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two numbers:");

        byte number1 = scanner.nextByte();
        byte number2 = scanner.nextByte();

        byte common;

        if (number1 > number2){
            common = number1;
        }
        else{
            common = number2;
        }

        while (! (number1 % common == 0 && number2 % common == 0 )){
            common--;
        }

        System.out.println("The GCD of " + number1 + " and " + number2 + " is " + common);
    }
}
