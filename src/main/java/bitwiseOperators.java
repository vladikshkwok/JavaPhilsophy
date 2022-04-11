public class bitwiseOperators {
    public static void main(String[] args) {
        int a = 9, b = 5, aShiftRight, bShiftRight, aShiftLeft, bShiftLeft;
        aShiftRight = a >> 2;
        bShiftRight = b >> 2;
        aShiftLeft = a << 2;
        bShiftLeft = b << 2;
        String aBinary = Integer.toBinaryString(a),
                bBinary = Integer.toBinaryString(b),
                notaBinary = Integer.toBinaryString(~a),
                notbBinary = Integer.toBinaryString(~b),
                aShiftBinaryRight = Integer.toBinaryString(aShiftRight),
                bShiftBinaryRight = Integer.toBinaryString(bShiftRight),
                aShiftBinaryLeft = Integer.toBinaryString(aShiftLeft),
                bShiftBinaryLeft = Integer.toBinaryString(bShiftLeft);


        System.out.println(a + " = " + aBinary);
        System.out.println(b + " = " + bBinary);

        System.out.println(aBinary + " & " + bBinary + " = " + Integer.toBinaryString(a & b));
        System.out.println(aBinary + " | " + bBinary + " = " + Integer.toBinaryString(a | b));
        System.out.println(aBinary + " ^ " + bBinary + " = " + Integer.toBinaryString(a ^ b));

        System.out.println("~" + aBinary + " = " + notaBinary);
        System.out.println("~" + bBinary + " = " + notbBinary);
        System.out.println("~" + a + " = " + ~a);
        System.out.println("~" + b + " = " + ~b);
//        NumberFormatException
//        System.out.println(Integer.parseInt(notaBinary, 2));
//        System.out.println(Integer.parseInt(notbBinary, 2));

        System.out.println(a + " >> 2 = " + aShiftRight);
        System.out.println(b + " >> 2 = " + bShiftRight);
        System.out.println(aBinary + " >> 2 = " + aShiftBinaryRight);
        System.out.println(bBinary + " >> 2 = " + bShiftBinaryRight);

        System.out.println(a + " << 2 = " + aShiftLeft);
        System.out.println(b + " << 2 = " + bShiftLeft);
        System.out.println(aBinary + " << 2 = " + aShiftBinaryLeft);
        System.out.println(bBinary + " << 2 = " + bShiftBinaryLeft);
    }
}
