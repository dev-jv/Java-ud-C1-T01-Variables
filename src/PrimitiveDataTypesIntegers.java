public class PrimitiveDataTypesIntegers {

    static byte varByte;
    static short varShort;
    static int varInt;
    static long varLong;

    public static void main(String[] args) {

        // ----------------------------------------------- <> byte, short, int and long
        byte byteNumber = 127;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("Byte type in bytes is " + Byte.BYTES);
        System.out.println("Byte type in bits is " + Byte.SIZE);
        System.out.println("Maximum value of a byte " + Byte.MAX_VALUE);
        System.out.println("Minimum value of a byte " + Byte.MIN_VALUE);

        short shortNumber = 32767;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("Type short in bytes is " + Short.BYTES);
        System.out.println("Type short in bits is " + Short.SIZE);
        System.out.println("Maximum value of a short " + Short.MAX_VALUE);
        System.out.println("Minimum value of a short " + Short.MIN_VALUE);

        int intNumber = 2147483647;
        System.out.println("intNumber = " + intNumber);
        System.out.println("Int type in bytes is " + Integer.BYTES);
        System.out.println("Int type in bits is " + Integer.SIZE);
        System.out.println("Maximum value of an int " + Integer.MAX_VALUE);
        System.out.println("Minimum value of an int " + Integer.MIN_VALUE);

        long longNumber = 9223372036854775807L;
        System.out.println("longNumber = " + longNumber);
        System.out.println("Type long in bytes is " + Long.BYTES);
        System.out.println("Type long in bits is " + Long.SIZE);
        System.out.println("Maximum value of a long " + Long.MAX_VALUE);
        System.out.println("Minimum value of a long " + Long.MIN_VALUE);

        // ------------------------ <> var // JDK 10 +
        var numByte = 127; // int
        var numShort = 32767; // int
        var numInt = 2147483647; // int
        var numLong = 9223372036854775807L; // long

        System.out.println("numLong = " + numLong); // ...

        // -------------------------- <> Default values, ...requires static variables in this case
        varByte = 127; // int
        short varShort = 32767; // int -
        int varInt = 2147483647; // int
        long varLong = 9223372036854775807L; // long

        System.out.println("varByte = " + varByte);
        System.out.println("varShort = " + varShort);
        System.out.println("varInt = " + varInt);
        System.out.println("varLong = " + varLong);

    }
}
