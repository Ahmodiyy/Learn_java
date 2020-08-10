package OopsConcept;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public  class NumAndString{
    static  void printing() {
        float floatVar = 2;
        int intVar = 2;
         String stringVar = "3";
        System.out.format("The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s", floatVar, intVar, stringVar);
        String origin = "India";
        int centers = 12000;
        System.out.format("\n NIIT is a computer institute originated from %s with %d worldwide\n", origin,centers);

        System.out.format(Locale.FRANCE,
                "The value of the float " + "variable is %f, while the " +
                        "value of the integer variable " + "is %n, and the string is %s%n",
                floatVar, intVar, stringVar);
    }

    static void decimalFormatting(String format, double value){
        DecimalFormat decimalFormat = new DecimalFormat(format);
        String output = decimalFormat.format(value);
        System.out.format("%s %s %s", format, value, output);
        String reverse = "I love Programming";
        System.out.println("\n");
        for(int i =0; i<reverse.length(); i++){
            System.out.print((reverse.charAt(reverse.length()-1-i)));
        }

        StringBuilder sb = new StringBuilder(reverse);
        System.out.println(sb.reverse());
        sb.toString();

    }

    public static void main(String[] args) {
        printing();
        decimalFormatting("$###,###,###.###", 123456789);
        System.out.println("\n");
//        decimalFormatting("000.000", 30);
        int n = 4;
        String s = String.valueOf(n);
        s= s.concat("444");
        System.out.println(s);
        String an = "12";
        double d = Double.valueOf(an)+12;
        System.out.println(d);
        List list = new ArrayList();


}

}