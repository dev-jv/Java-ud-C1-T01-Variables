// ---------------------------------------------------------------------- <> ...1
import java.util.Scanner;

public class EntradaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        String numeroStr = scanner.nextLine();
//        String numeroStr = (new Scanner(System.in)).nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            System.out.println("Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBin = "- Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOct = "- Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "- Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = "  Conversiones: ";
        mensaje += "\n" + resultadoBin;
        mensaje += "\n" + resultadoOct;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}

// ---------------------------------------------------------------------- <> ...2
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class EntradaTerminal {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un número entero");
////        String numeroStr = scanner.nextLine();
//
//        int numeroDecimal = 0;
//        try{
//            numeroDecimal = scanner.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println("Error, debe ingresar un numero entero");
//            main(args);
//            System.exit(0);
//        }
//
//        String resultadoBin = "- Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
//        String resultadoOct = "- Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
//        String resultadoHex = "- Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
//
//        String mensaje = "  Conversiones: ";
//        mensaje += "\n" + resultadoBin;
//        mensaje += "\n" + resultadoOct;
//        mensaje += "\n" + resultadoHex;
//
//        System.out.println(mensaje);
//    }
//}

// ---------------------------------------------------------------------- <> ...3
//import java.util.Scanner;
//
//public class EntradaTerminal {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese un número entero");
////        String numeroStr = scanner.nextLine();
//
//        int numeroDecimal = 0;
//        try{
//            numeroDecimal = scanner.nextInt();
//        }catch (Exception e){
//            System.out.println("Error, debe ingresar un numero entero");
//            main(args);
//            System.exit(0);
//        }
//
//        String resultadoBin = "- Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
//        String resultadoOct = "- Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
//        String resultadoHex = "- Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
//
//        String mensaje = "  Conversiones: ";
//        mensaje += "\n" + resultadoBin;
//        mensaje += "\n" + resultadoOct;
//        mensaje += "\n" + resultadoHex;
//
//        System.out.println(mensaje);
//    }
//}



