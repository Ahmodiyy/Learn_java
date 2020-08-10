package EssentialClasses.io$nio;

import java.io.*;
import java.util.Scanner;

public class CharacterStreamDemo {
    BufferedReader inputStream;
    PrintWriter outputStream;
    private void charStreaming() throws IOException {
        try {
             inputStream = new BufferedReader(new FileReader("C:\\xanadu.txt"));
            outputStream  = new PrintWriter(new FileWriter("C:\\outagain.txt"));
            String a ;
            while((a = inputStream.readLine()) != null){
                System.out.println(a);
                outputStream.println(a);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void main(String[] args) throws  IOException {
        CharacterStreamDemo characterStreamDemo = new CharacterStreamDemo();
        characterStreamDemo.charStreaming();
        Scanner inputConsole = new Scanner("Hello everybody hea hea");

        while (inputConsole.hasNext()){
            System.out.println(inputConsole.next());
        }
        inputConsole.close();



    }
}
