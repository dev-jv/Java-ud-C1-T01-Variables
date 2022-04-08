public class NumberSystems {
    public static void main(String[] args) {

        int decimalNum = 500;
        System.out.println("decimalNum = " + decimalNum);

        System.out.println(" > Binary number of " + decimalNum + " = " + Integer.toBinaryString(decimalNum));
        int binaryNum = 0b111110100; // 0b...
        System.out.println("binaryNum = " + binaryNum);

        System.out.println(" > Octal number of " + decimalNum + " = " + Integer.toOctalString(decimalNum));
        int octalNum = 0764; // 0...
        System.out.println("octalNum = " + octalNum);

        System.out.println(" > Hexadecimal number of " + decimalNum + " = " + Integer.toHexString(decimalNum));
        int hexNum = 0x1f4; // 0X1F4; // 0x...
        System.out.println("hexNum = " + hexNum);

    }
}
