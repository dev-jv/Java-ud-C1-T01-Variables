public class PrimitiveDataTypesChar {

    static char varDef;

    public static void main(String[] args) {

        // ------------------------------------------------------- <> char
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("character = decimal : " + (character == decimal));

        char symbol = '@';

        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character: " + (symbol == character));

        System.out.println("Char in bytes is = " + Character.BYTES);
        System.out.println("Char in bits is = " + Character.SIZE);
        System.out.println("Maximum value for char = " + Character.MAX_VALUE);
        System.out.println("Minimum value for char = " + Character.MIN_VALUE);

        // ---------------------------------- <> var
        var charCharacter = '\u0040'; // char
        var charDecimal = 64; // int
        var charSymbol = '@'; // char

        // ------------------------------- <> Default values
//        char varDef = 'j';

        System.out.println("varDef = " + varDef);

        // ------------------------------- <> Special characters
        char space = ' ';
        char space2 = '\u0020';
        System.out.println("A deshojo is" + space + "red in" + space2 + "Spring.");

        char backspace = '\b';
        System.out.println("A deshojo is x" + backspace + "red in x Spring.");

        char tab = '\t';
        System.out.println("A deshojo is" + tab + "red in Spring.");

        char newLine = '\n';
        System.out.println("A deshojo is" + newLine + " ..red in Spring. and green in Summer.");

        char retCar = '\r';
        System.out.println("A defoliation is" + retCar + "red in Spring.");

        System.out.println("A defoliation is red in Spring.");

        System.out.println("A defoliation is" + System.getProperty("line.separator") + "red in Spring.");

        System.out.println("A defoliation is" + System.lineSeparator() + "red in Spring.");

    }
}
