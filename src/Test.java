import java.util.ArrayList;
import java.util.Objects;


public class Test
{
    char c0;

    public static void main(String[] args)
    {
//        int size = 40;
//        int total = 0;
//        for (int i = 0; i < size; i++)
//        {
//            for (int j = i + 1; j < size; j++)
//            {
//                System.out.println("j " + j);
//                total ++;
//            }
//        }
//        System.out.println("total " + total);

//        for (int i = -10; i < 11; i++)
//            System.out.println(i + " " + convertIntegerToBinary(i));
//            System.out.println(i + " " + Integer.toBinaryString(i));
//            System.out.println(i + " " + Integer.toString(i, 2));


//        int value = -12;
//        int unsignedRightShift = value >>> 2;
//        System.out.println("3 " + (3 == value >>> 2));


//        System.out.println("-5 << 1 = " + (-5 << 1));
//        System.out.println("-5 << 1 = " + Integer.toBinaryString(-5 << 1));
        //        Object[] ooo = {null,1,'q', "ww"};
//        System.out.println("size " + ooo.length);
//        for (Object i:ooo)
//            System.out.println(i);

//        System.out.println( "Byte min.: " + Byte.MIN_VALUE );           // -128
//        System.out.println( "Byte max.: " + Byte.MAX_VALUE );           // 127
//        System.out.println( "Char min.: " + Character.MIN_VALUE );      // '\u0000'
//        System.out.println( "Char max.: " + Character.MAX_VALUE );      // '\uFFFF'
//        System.out.println("Char min.: " + (int)Character.MIN_VALUE);     // 0
//        System.out.println("Char max.: " + (int)Character.MAX_VALUE);     // 65535
//        System.out.println( "Int min.: " + Integer.MIN_VALUE );         // -2147483648
//        System.out.println( "Int max.: " + Integer.MAX_VALUE );         // 2147483647
//        System.out.println( "Double min.: " + Double.MIN_VALUE );       // 4.9E-324
//        System.out.println( "Double max.: " + Double.MAX_VALUE );       // 1.797...E308
//        System.out.println( "Double NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY );       // -Infinity
//        System.out.println( "Double POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY );       // Infinity

//        for (char i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++)
//        {
//            System.out.println(System.out.format("Decimal representation: %d: ASCII: %c", (int)i, (char)i));
//            if (i == Character.MAX_VALUE)
//                break;
//        }

        char c1 = '\u0000';
        char c2 = Character.MIN_VALUE;
//        System.out.println("char " + (c2 == c1));

        byte[] textInBytes = {33, 33, 33};
        String stringFromBytes = new String(textInBytes);
//        System.out.println(stringFromBytes);
    }

    public static String convertIntegerToBinary(int n)
    { // does not work for negative
        if (n == 0)
            return "0";

        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        return binaryNumber.reverse().toString();
    }
}
