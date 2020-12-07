public class ConversionDeTipos {
    public static void main(String[] args) {
        //---------------------- <> String -> Tipo ...
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        byte numeroByte = Byte.parseByte(numeroStr);
        System.out.println("numeroByte = " + numeroByte);

        short numeroShort = Short.parseShort(numeroStr);
        System.out.println("numeroShort = " + numeroShort);

        long numeroLong = Long.parseLong(numeroStr);
        System.out.println("numeroLong = " + numeroLong);

        String realStr = "98765.43E-3";

        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        float realFloat = Float.parseFloat(realStr);
        System.out.println("realFloat = " + realFloat);

        String logicoStr = "True";

        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        String charStr = "@";

        char datChar = charStr.charAt(0);
        System.out.println("datChar = " + datChar);

        //---------------------- <> Tipo ... -> String
        int numInt = 100;
        System.out.println("numInt = " + numInt);

        String numStr = Integer.toString(numInt);
        System.out.println("numStr = " + numStr);

        numStr = String.valueOf(numInt+5);
        System.out.println("numStr = " + numStr);

        double reDouble = 1.23456e2;

        String reStr = Double.toString(reDouble);
        System.out.println("reStr = " + reStr);

        reStr = String.valueOf(1.234567f);
        System.out.println("reStr = " + reStr);

        //---------------------- <> Tipo ... -> Tipo ... ... CAST !
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

        // > Superioridad de Tipos
        int x = 1000;
        long y = x;
//        int z = y;

//        //---------------------- <> var[String -> Tipo ...]
//        var numeroStr = "50";
//
//        var numeroInt = Integer.parseInt(numeroStr);
//        System.out.println("numeroInt = " + numeroInt);
//
//        var numeroByte = Byte.parseByte(numeroStr);
//        System.out.println("numeroByte = " + numeroByte);
//
//        var numeroShort = Short.parseShort(numeroStr);
//        System.out.println("numeroShort = " + numeroShort);
//
//        var numeroLong = Long.parseLong(numeroStr);
//        System.out.println("numeroLong = " + numeroLong);
//
//        var realStr = "98765.43E-3";
//
//        var realDouble = Double.parseDouble(realStr);
//        System.out.println("realDouble = " + realDouble);
//
//        var realFloat = Float.parseFloat(realStr);
//        System.out.println("realFloat = " + realFloat);
//
//        String logicoStr = "True";
//
//        var logicoBoolean = Boolean.parseBoolean(logicoStr);
//        System.out.println("logicoBoolean = " + logicoBoolean);
//
//        var charStr = "@";
//
//        var datChar = charStr.charAt(0);
//        System.out.println("datChar = " + datChar);
    }
}
