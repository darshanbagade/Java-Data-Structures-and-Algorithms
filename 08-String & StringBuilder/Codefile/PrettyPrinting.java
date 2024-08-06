public class PrettyPrinting{
    public static void main(String[] args) {
        /*
        Format Specifier	Conversion Applied
            %%	             a % sign
            %x %X	         Integer hexadecimal
            %t %T	         Time and Date
            %s %S	         String
            %n	             Inserts a newline character
            %o	             Octal integer
            %f	             Decimal floating-point
            %e %E	         Scientific notation
            %g	             Causes Formatter to use either %f or %e, whichever is shorter
            %h %H          	Hash code of the argument
            %d	             Decimal integer
            %c	             Character
            %b %B	         Boolean
            %a %A	         Floating-point hexadecimal
        */

        //float a= 453.1283f;
        // print till two decimal with rounding off
        //System.out.printf("Formatted number is %.2f",a);

        // System.out.printf("Pie : %.3f",Math.PI);

        System.out.printf("Hello my name is %s and I am %s","Darshan","cool");
    }
}