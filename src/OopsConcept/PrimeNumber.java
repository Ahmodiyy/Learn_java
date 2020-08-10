package OopsConcept;

import java.util.Scanner;

public class PrimeNumber {
    boolean t=true;
    int division;
    int result;
    void primeDemo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number less than 100");
        int number = scanner.nextInt();
        for(int a=2; a<=number/2; a++){
             result = number%a;
            System.out.println(result);
            if(result==0){
                t =false;
                break;
            }
        }
        if(t){
            System.out.println("this a prime number");
        }
        else{
            System.out.println("this is not a prime number");
        }

    }
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.primeDemo();


    }
}
