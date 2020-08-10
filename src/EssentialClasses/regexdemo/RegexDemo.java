package EssentialClasses.regexdemo;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegexDemo {
    static void regexing(){
       String regexEpx = "[bc]at";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing2(){
        String regexEpx = "[^bc]at";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing3(){
        String regexEpx = "[b-d]at";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing4(){
        String regexEpx = "[b-c[f-h] B-C[F-H]]";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing5(){
        String regexEpx = "[aeiou&&[a-d]]";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing6(){
        String regexEpx = "[0-9&&[^2468]]";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }
// Predefined Construct
    static void regexing7(){
        String regexEpx = ".";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing8(){
        String regexEpx = "\\d";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    static void regexing9(){
        String regexEpx = "\\D";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }
// Quantifier
    static void regexing10(){
        String regexEpx = "a?";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing11(){
        String regexEpx = "a*";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing12(){
        String regexEpx = "a+";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing13(){
        String regexEpx = "a{2}";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing14(){
        String regexEpx = "a{3,}";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing15(){
        String regexEpx = "a{3,5}";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    // Capturing groups and character classes with quantifier

    static void regexing16(){
        String regexEpx = "[abc]{2}";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }
// Capturing Group
    static void regexing17(){
        String regexEpx = "(abc){2}";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }
// BackReference
    static void regexing17b(){
        String regexEpx = "(\\d\\d)\\1";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing18(){
        String regexEpx = ".*foo";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing19(){
        String regexEpx = ".*?foo";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }

    static void regexing20(){
        String regexEpx = ".*+foo";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }
// Boundary Matcher
    static void regexing21(){
        String regexEpx = "^abc$";
        Pattern p = Pattern.compile(regexEpx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());
        System.out.printf("i found %s starting at index %d and ending at index %d", m.group(), m.start(), m.end());

    }
// FLAGS
    static void regexing22(){
        String regexEpx = "[^bc]at";
        Pattern p = Pattern.compile(regexEpx, Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }
//USERFUL PATTERN METHODS
    static void regexing23(){
        String regexEpx = ",";
        Pattern p = Pattern.compile(regexEpx, Pattern.CASE_INSENSITIVE);
        String regexMatcer = "one,two,three";
        String[] str = p.split(regexMatcer);
        for(String s : str){
            System.out.println(s);
        }


    }

    static void regexing24(){
        String regexEpx = "\\d";
        Pattern p = Pattern.compile(regexEpx, Pattern.CASE_INSENSITIVE);
        String regexMatcer = "A1B2C3D4E5";
        String[] str = p.split(regexMatcer);
        for(String s : str){
            System.out.println(s);
        }

    }

    static void regexing25(){
        String regexEpx = "[^bc]at";
        Pattern p = Pattern.compile(regexEpx, Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String regexMatcer = scanner.next();
        Matcher m = p.matcher(regexMatcer);
        System.out.println(m.matches());

    }

    public static void main(String[] args) {
      //  regexing();
        //  regexing2();
      //
        //  regexing3();
        //regexing4();
       //
        // regexing5();
        //
        // regexing6();
        // regexing7();
       // regexing8();
       // regexing9();
        //regexing10();
       // regexing11();
       // regexing12();
       // regexing13();
       // regexing14();
       // regexing15();
       // regexing16();
       // regexing17();
       // regexing17b();
        //regexing18();
        //regexing19();
       // regexing20();
       // regexing21();
       // regexing22();
        //regexing23();
       // regexing24();




    }
}
