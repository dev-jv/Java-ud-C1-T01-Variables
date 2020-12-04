public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println(" > Numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100; // 0b...
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println(" > Numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // 0...
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println(" > Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; // 0X1F4; // 0x...
        System.out.println("numeroHex = " + numeroHex);
    }
}



