public class PrimitivosChar {

    static char varDef;

    public static void main(String[] args) {

        // ------------------------------------------------------- <> char
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal : " + (caracter == decimal));

        char simbolo = '@';

        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("Char en bytes es = " + Character.BYTES);
        System.out.println("Char en bits es = " + Character.SIZE);
        System.out.println("Máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("Mínimo valor para char = " + Character.MIN_VALUE);

        // ---------------------------------- <> var
        var charCaracter = '\u0040'; // char
        var charDecimal = 64; // int
        var charSimbolo = '@'; // char

        // ------------------------------- <> Valores por defecto
//        char varDef = 'j';

        System.out.println("varDef = " + varDef);
    }
}



