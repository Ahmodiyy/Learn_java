package EssentialClasses.io$nio;

import EssentialClasses.io$nio.CustomExceptionDemo;

public class ExceptionDemo {
    static int  d;
    public static void custom ()throws  Exception{

        try{
          d = 0;
            int nul = 8/d;

        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

            if(d == 0 ){
                throw new CustomExceptionDemo("denominator is zero");
            }
            throw new ArithmeticException();
        }


    }
    public static void main (String[] args) throws  Exception{
        custom();

        }

}
