// ---------------------------------------------------------------------- <> ...1
//import javax.swing.*;
//
//public class EntradaVentana {
//    public static void main(String[] args) {
//
//        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
//        int numeroDecimal = Integer.parseInt(numeroStr);
//
//        System.out.println(" > Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
//        System.out.println(" > Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
//        System.out.println(" > Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
//
//        String mensaje = "  Conversiones: ";
//        mensaje += "\n- Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
//        mensaje += "\n- Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
//        mensaje += "\n- Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
//
//        JOptionPane.showMessageDialog(null, mensaje);
//    }
//}

// ---------------------------------------------------------------------- <> ...2
import javax.swing.*;

public class EntradaVentana {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBin = "- Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBin);

        String resultadoOct = "- Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOct);

        String resultadoHex = "- Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        String mensaje = "  Conversiones: ";
        mensaje += "\n" + resultadoBin;
        mensaje += "\n" + resultadoOct;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}



