package LanguageBasics;
import java.util.Scanner;

public class ControlFlow {
    void controlFlow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your month");
        String monthNumber= scanner.next();
        switch(monthNumber){
            case "January":
                System.out.println("on the 1st month");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }

    }
    boolean searcher;
    void searching (){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int verify = 7;
        int search=7;

        for(int a = 0; a<arr.length; a++){
            aa: if(arr[a]== search){
                 searcher=true;
                break;
            }

        }
        if(searcher){
            System.out.println("We've found "+search);
        }

    }
    int solving(int a){
        return a;
    }
    int solving(int b, int c){
        return b*c;
    }

    void arrying(int[] arr){
        System.out.println("passing array as parameter "+(arr[0]+arr[1]));
    }

    void varargsing(int... arr2){
        System.out.println("Varargs demo "+(arr2[0]+arr2[1]));
    }
    void passingByValue(int h){
        h = 1;
        System.out.println("passing by value is still " +h);
    }



    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();
//        controlFlow.controlFlow();
        controlFlow.searching();
        System.out.println(controlFlow.solving(1, 3));
        controlFlow.arrying(new int[]{1, 2});
        controlFlow.varargsing(4, 4);
        controlFlow.passingByValue(2);


    }
    }

