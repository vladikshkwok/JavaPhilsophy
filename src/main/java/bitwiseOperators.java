public class bitwiseOperators {
    public static void main(String[] args) {
        int a = 7, b = 4;
        String aBinary = Integer.toBinaryString(a),
                bBinary = Integer.toBinaryString(b);

        System.out.println(aBinary);
        System.out.println(bBinary);
        System.out.println(aBinary + " & " + bBinary + " = " + Integer.toBinaryString(a & b));
        System.out.println(aBinary + " | " + bBinary + " = " + Integer.toBinaryString(a | b));
        System.out.println(aBinary + " ^ " + bBinary + " = " + Integer.toBinaryString(a ^ b));
    }
}
