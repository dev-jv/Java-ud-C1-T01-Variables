public class ConversionDeTipos {
    public static void main(String[] args) {

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
    }
}

// -------------------------------------------------------------- <> var

//public class ConversionDeTipos {
//    public static void main(String[] args) {
//
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
//    }
//}



