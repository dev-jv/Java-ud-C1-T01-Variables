public class PrimitivosFloat {

    static float varFloat;
    static double varDouble;

    public static void main(String[] args) {

        // ------------------------------------------------------- <> float y double
        float realFloat = 0.00000000015f;//1.5E-10F;//1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float en bytes es = " + Float.BYTES);
        System.out.println("Float en bits es = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 4.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double en bytes es = " + Double.BYTES);
        System.out.println("Double en bits es = " + Double.SIZE);
        System.out.println("Máximo valor para doble = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para doble = " + Double.MIN_VALUE);

        // --------------------------- <> var
        var numEnt = 3; // int
        var numFloat = 3.1F; // float
        var numDouble = 3.2; // double
        var numDouble2 = 3.3D; // double

        System.out.println("numDouble = " + numDouble);

        // ------------------------------- <> Valores por defecto, ..requiere variables estáticas en este caso
//        float varFloat = 4.5F;
//        double varDouble = 4.5;

        System.out.println("varFloat = " + varFloat);
        System.out.println("varDouble = " + varDouble);
    }
} 



