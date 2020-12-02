public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte en bytes es " + Byte.BYTES);
        System.out.println("Tipo byte en bits es " + Byte.SIZE);
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short en bytes es " + Short.BYTES);
        System.out.println("Tipo short en bits es " + Short.SIZE);
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int en bytes es " + Integer.BYTES);
        System.out.println("Tipo int en bits es " + Integer.SIZE);
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long en bytes es " + Long.BYTES);
        System.out.println("Tipo long en bits es " + Long.SIZE);
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);

    }
}



