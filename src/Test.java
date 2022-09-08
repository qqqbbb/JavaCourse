import java.util.Objects;

public class Test
{
    char c0;

    public static void main(String[] args)
    {
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

        for (char i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++)
        {
            System.out.println(System.out.format("Decimal representation: %d: ASCII: %c", (int)i, (char)i));
            if (i == Character.MAX_VALUE)
                break;
        }

        char c1 = '\u0000';
        char c2 = Character.MIN_VALUE;
//        System.out.println("char " + (c2 == c1));

        byte[] textInBytes = {33, 33, 33};
        String stringFromBytes = new String(textInBytes);
//        System.out.println(stringFromBytes);
    }
}
