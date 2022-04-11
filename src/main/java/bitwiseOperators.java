public class bitwiseOperators {
    public static void main(String[] args) {
        int a = 7, b = 4;
        String aBinary = Integer.toBinaryString(a),
                bBinary = Integer.toBinaryString(b),
                notaBinary = Integer.toBinaryString(~a),
                notbBinary = Integer.toBinaryString(~b);


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
    }
}
