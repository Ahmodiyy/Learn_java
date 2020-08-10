package LanguageBasics;

public class VarArrDemo {
    public enum DayOfTheWeek{Monday, Tuesday, Wednessday, Thursday, Friday, Saturday, Sunday}

    byte a = 8;
    short b = 16;
    int c = 32;
    long d = 64L;
    char e = 16;
    float f = 32F;
    double g = 64D;
    boolean h =false;
    byte instanceVariable ;
    static byte staticVariable;
    /*numeric rep decimal hexadecimal and binary*/
    byte dec = 22;
    byte hexa = 0x2;
    byte binary = 0b10;
    /*just for easy reading*/
    long creditCardNumber= 2252_2544_5588_6556L;


    void arrayDemo(){
        byte localVariable;
      /*  System.out.println(localVariable);      note localVariable is NULL when not initialized*/
        localVariable=5;
        System.out.println(localVariable);
        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[2];
        System.arraycopy(arr, 1, arr1,0,2);
        System.out.println(arr1[0]+" "+arr1[1]+" "+arr1.length);
    }

    public static void main(String[] args) {
        VarArrDemo varArrDemo = new VarArrDemo();
        System.out.println(varArrDemo.dec +" "+varArrDemo.hexa+" "+varArrDemo.binary+" "+varArrDemo.creditCardNumber);
        char[] arr= new char[]{'p', 'i', 'n', 'e', 'a', 'p', 'p', 'l', 'e'};
        char[] arr2= new char[5];
        System.arraycopy(arr, 4,arr2, 0,5);
        System.out.println(new String(arr2));
        varArrDemo.arrayDemo();
        System.out.println(varArrDemo.instanceVariable+" "+staticVariable);
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
        System.out.println("------------------------");
        int v= 1;
        int z = v++;
        System.out.println(z);
        System.out.println(v);

        int l =1;
        int m =++l;
        System.out.println(m);
        System.out.println(l);
        System.out.println("----------------------");
        int f = 1;
        f++;
        System.out.println(f);
        System.out.println(f);
        ++f;
        System.out.println(f);
        System.out.println(++f);
        System.out.println(f);
        System.out.println("---------------------");
        int ifThenElse = Math.max(1, 2);
        System.out.println(ifThenElse);

        int bitmask = 2;
        int val = 3;
        // prints "2"

        System.out.println(2|2);
        System.out.println(2&2);
        System.out.println(4&5);
        System.out.println(10>>2);
        System.out.println(DayOfTheWeek.Monday);

        System.out.println("\tUnderstanding Bitwise and Bitshift Operator in java");
        int two = -2;
        System.out.printf("Before...\ntwo: %d binary form: %s length: %s\n", two, Integer.toBinaryString(two), Integer.toBinaryString(two).length());
        int signedleftshiftingtwo = two<<1;
        System.out.printf("After...\nsignedleftshiftingtwo: %d binary form: %s length: %s\n", signedleftshiftingtwo, Integer.toBinaryString(signedleftshiftingtwo), Integer.toBinaryString(signedleftshiftingtwo).length());

        System.out.printf("Before...\ntwo: %d binary form: %s length: %s\n", two, Integer.toBinaryString(two), Integer.toBinaryString(two).length());
        int signedrightshiftingtwo = two>>1;
        System.out.printf("After...\nsignedrightshiftingtwo: %d binary form: %s length: %s\n", signedrightshiftingtwo, Integer.toBinaryString(signedrightshiftingtwo), Integer.toBinaryString(signedrightshiftingtwo).length());

        System.out.printf("Before...\ntwo: %d binary form: %s length: %s\n", two, Integer.toBinaryString(two), Integer.toBinaryString(two).length());
        int unsignedrightshiftingtwo = two>>>1;
        System.out.printf("After...\nunsignedrightshiftingtwo: %d binary form: %s length: %s\n", unsignedrightshiftingtwo, Integer.toBinaryString(unsignedrightshiftingtwo), Integer.toBinaryString(unsignedrightshiftingtwo).length());


        System.out.printf("Before...\ntwo: %d binary form: %s length: %s\n", two, Integer.toBinaryString(two), Integer.toBinaryString(two).length());
        int unaryshiftingtwo = ~two;
        System.out.printf("After...\nunarytshiftingtwo: %d binary form: %s length: %s\n", unaryshiftingtwo, Integer.toBinaryString(unaryshiftingtwo), Integer.toBinaryString(unaryshiftingtwo).length());



    }

}

