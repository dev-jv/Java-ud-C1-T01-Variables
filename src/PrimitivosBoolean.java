public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        boolean datoLogico2 = false;
        boolean datoLogico3 = Boolean.TRUE;
        boolean datoLogico4 = Boolean.FALSE;

        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println("datoLogico3 = " + datoLogico3);
        System.out.println("datoLogico4 = " + datoLogico4);

        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);







    }
}
