package LanguageBasics;

import javax.xml.transform.sax.SAXSource;

public class BasicsQA{
    static byte by;
public static void localVariableTest(){
    byte lvt;
    // post pre incremental
    int ab = 2;
    int bc = ab+++ab;
    int cd = ++ab+ab;
    System.out.println("ab: "+ ab);
    System.out.println("bc: " + bc);
    System.out.println("cd: " + cd);

}

public static void bitwiseAndOrinclusiveOrexclusive(){
    System.out.println("//bitwiseAndOrinclusiveOrexclusive");
    byte de = 2;
    byte ef = 4;
    System.out.println(de|ef);
    System.out.println(de&ef);
    System.out.println(de^ef);
}

    public static void branchingStatement(){
        System.out.println("//branch Statement demo");
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            search2:for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
   static void continueKeyword(){

                String searchMe = "Look for a substring in me";
                String substring = "sub";
                boolean foundIt = false;

                int max = searchMe.length() -
                        substring.length();
       System.out.println("max: "+ max);
                test:
                for (int i = 0; i <= max; i++) {
                    int n = substring.length();
                    int j = i;
                    int k = 0;
                    while (n-- != 0) {
                        if (searchMe.charAt(j++) != substring.charAt(k++)) {
                            System.out.println("j: " + j);
                            System.out.println("k: " + k);
                            continue test;
                        }
                    }
                    foundIt = true;
                    break test;
                }
                System.out.println(foundIt ? "Found it" : "Didn't find it");
            }

    public static void main(String[] args) {
    localVariableTest();
    bitwiseAndOrinclusiveOrexclusive();
    branchingStatement();
        System.out.println("-----------continue keyword demo");
        continueKeyword();

        System.out.println("//instance variable default initialazation");
        System.out.println("by: " + by);


    }
}
