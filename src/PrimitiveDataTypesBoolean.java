public class PrimitiveDataTypesBoolean {
    public static void main(String[] args) {

        boolean logicalData = true;
        boolean logicalData2 = false;
        boolean logicalData3 = Boolean.TRUE;
        boolean logicalData4 = Boolean.FALSE;

        System.out.println("logicalData = " + logicalData);
        System.out.println("logicalData2 = " + logicalData2);
        System.out.println("logicalData3 = " + logicalData3);
        System.out.println("logicalData4 = " + logicalData4);

        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        logicalData = d > f;
        System.out.println("logicalData = " + logicalData);

        boolean itsEqual = 3-2 == 1;
        System.out.println("itsEqual = " + itsEqual);

    }
}
