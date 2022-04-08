// ---------------------------------------------------------------------- <> ...1
//import javax.swing.*;
//
//public class InputWindow {
//    public static void main(String[] args) {
//
//        String strNumber = JOptionPane.showInputDialog(null, "Enter a integer number");
//        int decimalNumber = Integer.parseInt(strNumber);
//
//        System.out.println(" > Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));
//        System.out.println(" > Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber));
//        System.out.println(" > Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber));
//
//        String message = "  Conversions: ";
//        message += "\n- Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
//        message += "\n- Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
//        message += "\n- Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
//
//        JOptionPane.showMessageDialog(null, message);
//
//    }
//}

// ---------------------------------------------------------------------- <> ...2
import javax.swing.*;

public class InputWindow {
    public static void main(String[] args) {

        String strNumber = JOptionPane.showInputDialog(null, "Enter a integer number");
        int decimalNumber = 0;
        try{
            decimalNumber = Integer.parseInt(strNumber);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, you must enter an integer number");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String BinResult = "- Binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(BinResult);

        String OctResult = "- Octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(OctResult);

        String HexResult = "- Hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(HexResult);

        String message = "  Conversions: ";
        message += "\n" + BinResult;
        message += "\n" + OctResult;
        message += "\n" + HexResult;

        JOptionPane.showMessageDialog(null, message);

    }
}
