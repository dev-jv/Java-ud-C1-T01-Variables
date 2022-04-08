public class PrimitiveDataTypesFloat {

    static float varFloat;
    static double varDouble;

    public static void main(String[] args) {

        // ------------------------------------------------------- <> float and double
        float realFloat = 0.00000000015f;//1.5E-10F;//1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float in bytes is = " + Float.BYTES);
        System.out.println("Float in bits is = " + Float.SIZE);
        System.out.println("Maximum value for float = " + Float.MAX_VALUE);
        System.out.println("Minimum value for float = " + Float.MIN_VALUE);

        double realDouble = 4.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double in bytes is = " + Double.BYTES);
        System.out.println("Double in bits is = " + Double.SIZE);
        System.out.println("Maximum value for double = " + Double.MAX_VALUE);
        System.out.println("Minimum value for double = " + Double.MIN_VALUE);

        // --------------------------- <> var
        var numEnt = 3; // int
        var numFloat = 3.1F; // float
        var numDouble = 3.2; // double
        var numDouble2 = 3.3D; // double

        System.out.println("numDouble = " + numDouble);

        // ------------------------------- <> Default values, ...requires static variables in this case
//        float varFloat = 4.5F;
//        double varDouble = 4.5;

        System.out.println("varFloat = " + varFloat);
        System.out.println("varDouble = " + varDouble);

    }
}
