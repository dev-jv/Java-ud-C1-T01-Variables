
public class TypeConversion {
    public static void main(String[] args) {
        //---------------------- <> String -> Type ...
        String strNumber = "50";

        int intNumber = Integer.parseInt(strNumber);
        System.out.println("intNumber = " + intNumber);

        byte byteNumber = Byte.parseByte(strNumber);
        System.out.println("byteNumber = " + byteNumber);

        short shortNumber = Short.parseShort(strNumber);
        System.out.println("shortNumber = " + shortNumber);

        long longNumber = Long.parseLong(strNumber);
        System.out.println("longNumber = " + longNumber);

        String strReal = "98765.43E-3";

        double doubleReal = Double.parseDouble(strReal);
        System.out.println("doubleReal = " + doubleReal);

        float floatReal = Float.parseFloat(strReal);
        System.out.println("floatReal = " + floatReal);

        String strLogic = "True";

        boolean booleanLogic = Boolean.parseBoolean(strLogic);
        System.out.println("booleanLogic = " + booleanLogic);

        String strChar = "@";

        char datChar = strChar.charAt(0);
        System.out.println("datChar = " + datChar);

        //---------------------- <> Type ... -> String
        int intNum = 100;
        System.out.println("intNum = " + intNum);

        String strNum = Integer.toString(intNum);
        System.out.println("strNum = " + strNum);

        strNum = String.valueOf(intNum+5);
        System.out.println("strNum = " + strNum);

        double doubleRe = 1.23456e2;

        String strRe = Double.toString(doubleRe);
        System.out.println("strRe = " + strRe);

        strRe = String.valueOf(1.234567f);
        System.out.println("strRe = " + strRe);

        //---------------------- <> Type ... -> Type ... ... CAST !
        System.out.println(Short.MAX_VALUE);

        int i = 32767;

        short s = (short) i;
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);

        char b = (char)i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);

        // > Type Superiority
        int x = 1000;
        long y = x;
//        int z = y;

//        //---------------------- <> var[String -> Type ...]
//        var strNumber = "50";
//
//        var intNumber = Integer.parseInt(strNumber);
//        System.out.println("intNumber = " + intNumber);
//
//        var byteNumber = Byte.parseByte(strNumber);
//        System.out.println("byteNumber = " + byteNumber);
//
//        var shortNumber = Short.parseShort(strNumber);
//        System.out.println("shortNumber = " + shortNumber);
//
//        var longNumber = Long.parseLong(strNumber);
//        System.out.println("longNumber = " + longNumber);
//
//        var strReal = "98765.43E-3";
//
//        var doubleReal = Double.parseDouble(strReal);
//        System.out.println("doubleReal = " + doubleReal);
//
//        var floatReal = Float.parseFloat(strReal);
//        System.out.println("floatReal = " + floatReal);
//
//        String strLogic = "True";
//
//        var booleanLogic = Boolean.parseBoolean(strLogic);
//        System.out.println("booleanLogic = " + booleanLogic);
//
//        var strChar = "@";
//
//        var datChar = strChar.charAt(0);
//        System.out.println("datChar = " + datChar);
    }
}
