// ---------------------------------------------------------------------- <> ...1
import java.util.Scanner;

public class InputTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        String strNumber = scanner.nextLine();
//        String strNumber = (new Scanner(System.in)).nextLine();
        int decimalNumber = 0;
        try{
            decimalNumber = Integer.parseInt(strNumber);
        }catch (NumberFormatException e){
            System.out.println("Error, you must enter an integer number");
            main(args);
            System.exit(0);
        }

        String binNum = "- Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        String octNum = "- Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        String hexNum = "- Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        String message = "  Conversions: ";
        message += "\n" + binNum;
        message += "\n" + octNum;
        message += "\n" + hexNum;

        System.out.println(message);

    }
}

// ---------------------------------------------------------------------- <> ...2
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class InputTerminal {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer number");
////        String strNumber = scanner.nextLine();
//
//        int decimalNumber = 0;
//        try{
//            decimalNumber = scanner.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println("Error, you must enter an integer number");
//            main(args);
//            System.exit(0);
//        }
//
//        String binNum = "- Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
//        String octNum = "- Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
//        String hexNum = "- Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
//
//        String message = "  Conversions: ";
//        message += "\n" + binNum;
//        message += "\n" + octNum;
//        message += "\n" + hexNum;
//
//        System.out.println(message);
//
//    }
//}

// ---------------------------------------------------------------------- <> ...3
//import java.util.Scanner;
//
//public class InputTerminal {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer number");
////        String strNumber = scanner.nextLine();
//
//        int decimalNumber = 0;
//        try{
//            decimalNumber = scanner.nextInt();
//        }catch (Exception e){
//            System.out.println("Error, you must enter an integer number");
//            main(args);
//            System.exit(0);
//        }
//
//        String binNum = "- Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
//        String octNum = "- Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
//        String hexNum = "- Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
//
//        String message = "  Conversions: ";
//        message += "\n" + binNum;
//        message += "\n" + octNum;
//        message += "\n" + hexNum;
//
//        System.out.println(message);
//
//    }
//}
